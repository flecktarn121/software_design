package form;

import model.Monument;

/* 
 * Formulario básico para usar cuando se quieran pedir sólo dos valores sobre algo.
 */
public class MonumentForm extends BasicForm implements Form {
	Monument monument;

	public MonumentForm(Monument monument) {
		this.monument = monument;
	}

	public void edit() {
		System.out.println("Editando el monumento...");

		System.out.println("Valores actuales:");
		printMonument(monument);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Autor: ");
		String value = readLine();
		if (value.length() > 0)
			monument.setAuthor(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			monument.setAddress(value);

		System.out.println("Valores finales:");
		printMonument(monument);
	}

	private void printMonument(Monument monument) {
		System.out.println(" - Autor: " + monument.getAuthor());
		System.out.println(" - Dirección: " + monument.getAddress());
	}

}