package data;

import java.util.ArrayList;
import java.util.List;

import poll.Poll;

public class DefaultDataCenter {
	Poll poll;
	private List<DataObserver> observers = new ArrayList<DataObserver>();

	public DefaultDataCenter() {
	}

	public void Add(DataObserver observer) {
		observers.add(observer);
	}

	public void remove(DataObserver observer) {
		this.observers.remove(observer);
	}

	public void updateData() {
		observers.parallelStream().forEach((observer) -> {
			observer.update();
		});
	}
}
