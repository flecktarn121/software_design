package form.creation;

import form.Form;
import form.RestaurantForm;
import model.Restaurant;

public class RestaurantFormCreator implements FormCreator<Restaurant> {
	@Override
	public Form create(Restaurant objectToEdit) {
		return new RestaurantForm(objectToEdit);
	}

}
