package action;

import java.util.ArrayDeque;
import java.util.Deque;

public class ActionManager {
	private Deque<Action> redoStack;
	private Deque<Action> undoStack;

	public ActionManager() {
		redoStack = new ArrayDeque<Action>();
		undoStack = new ArrayDeque<Action>();
	}

	public void addAction(Action action) {
		undoStack.push(action);
	}

	public void undo() {
		Action action = undoStack.pop();
		if (action != null) {
			action.undo();
			redoStack.push(action);
		}
	}

	public void redo() {
		Action action = redoStack.pop();
		if (action != null) {
			action.redo();
			undoStack.push(action);
		}
	}
}
