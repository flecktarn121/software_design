package map.elemets;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Restaurant;

public class RestaurantMapElement implements MapElement {

	private Restaurant restaurant;

	public RestaurantMapElement(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String getTitle() {
		return restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return new GPS().getCoordinates(restaurant.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return restaurant.getName() + " " + restaurant.getAddress() + "\n" + restaurant.getPhone();
	}

	@Override
	public void open() {
		System.out.println("Llamando al " + restaurant.getPhone() + "...");

	}

}
