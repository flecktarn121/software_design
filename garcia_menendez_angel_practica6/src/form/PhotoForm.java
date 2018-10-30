package form;

import model.Photo;

public class PhotoForm extends BasicForm implements Form {
	private Photo photo;

	public PhotoForm(Photo photo) {
		this.photo = photo;
	}

	@Override
	public void edit() {
		System.out.println("Editando la fotografía...");

		System.out.println("Valores actuales:");
		printPhoto(photo);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Autor: ");
		String value = readLine();
		if (value.length() > 0)
			photo.setUser(value);

		System.out.print(" - Descripcion: ");
		value = readLine();
		if (value.length() > 0)
			photo.setDescription(value);

		System.out.println("Valores finales:");
		printPhoto(photo);
	}

	private void printPhoto(Photo photo) {
		System.out.println("- Author: "+photo.getUser());
		System.out.println("- Descripcion: "+photo.getUser());
	}

}
