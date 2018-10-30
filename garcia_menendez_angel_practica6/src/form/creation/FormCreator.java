package form.creation;

import form.Form;

public interface FormCreator<T> {
	public Form create(T objectToEdit);
}
