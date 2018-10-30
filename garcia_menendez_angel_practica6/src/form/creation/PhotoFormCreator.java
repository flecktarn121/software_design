package form.creation;

import form.Form;
import form.PhotoForm;
import model.Photo;

public class PhotoFormCreator implements FormCreator<Photo> {

	@Override
	public Form create(Photo objectToEdit) {
		return new PhotoForm(objectToEdit);
	}

}
