package map.elemets;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Monument;

public class MonumentMapElement implements MapElement {

	private Monument monument;

	public MonumentMapElement(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String getTitle() {
		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return new GPS().getCoordinates(monument.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		String info = monument.getName() + ". Creado por " + monument.getAuthor() + ", " + monument.getAddress();
		return info;
	}

	@Override
	public void open() {
		new GPS().getDirectionsTo(monument.getAddress());

	}

}
