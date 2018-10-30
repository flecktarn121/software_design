package form;

import model.Restaurant;

public class RestaurantForm extends BasicForm implements Form {
	private Restaurant restaurant;
	public RestaurantForm(Restaurant restaurant) {
		this.restaurant=restaurant;
	}

	@Override
	public void edit() {
		System.out.println("Editando el restaurante...");

		System.out.println("Valores actuales:");
		printRestaurant(restaurant);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Nombre: ");
		String value = readLine();
		if (value.length() > 0)
			restaurant.setName(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			restaurant.setAddress(value);

		System.out.println("Valores finales:");
		printRestaurant(restaurant);
	}

	private void printRestaurant(Restaurant restaurant) {
		System.out.println(" - Nombre: " + restaurant.getName());
		System.out.println(" - Dirección: " + restaurant.getAddress());
	}

}
