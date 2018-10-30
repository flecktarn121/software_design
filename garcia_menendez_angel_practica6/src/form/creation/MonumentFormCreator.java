package form.creation;

import form.Form;
import form.MonumentForm;
import model.Monument;

public class MonumentFormCreator implements FormCreator<Monument> {

	@Override
	public Form create(Monument objectToEdit) {
		return new MonumentForm(objectToEdit);
	}


}
