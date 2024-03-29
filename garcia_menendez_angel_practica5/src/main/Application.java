package main;

import java.io.*;
import tool.*;

import editor.*;

public class Application {
	private Editor editor;
	private boolean exit;
	private BufferedReader input;
	private PrintStream output;

	public static void main(String[] args) throws IOException {
		new Application().run();
	}

	public void run() throws IOException {

		editor = new Editor(new Drawing());
		input = new BufferedReader(new InputStreamReader(System.in));
		output = System.out;

		showHelp();
		while (!exit) {
			askUser();
		}
		output.println("�Adios!");
		return;
	}

	private void showHelp() {
		output.println("");
		output.println("Herramientas: seleccion - rectangulo - circulo - triangulo");
		output.println("Acciones del rat�n: pulsar <x>,<y> - mover <x>,<y> - soltar");
		output.println("Otras acciones: dibujar - ayuda - salir");
		output.println("-----------------------------------------------------------");
	}

	private void askUser() throws IOException {
		output.print("> ");
		output.flush();
		String[] tokens = input.readLine().split("[ ]", 2);
		String action = tokens[0];

		// Comprueba que a las acciones que no requieren par�metros, efectivamente no se
		// les
		// pase ninguno (por usabilidad, para que el usuario se d� cuenta de que la
		// �ltima
		// acci�n no funciona como �l esperaba). Por ejemplo, si por equivocaci�n
		// tecle�:
		//
		// "soltar 200, 345"
		//
		// cuando realmente esas coordenadas no son tenidas en cuenta (se deber�a haber
		// llamado previamente a "mover 200, 345" y luego simplemente "soltar").
		//
		if (action.equals("seleccion") || action.equals("rectangulo") || action.equals("circulo")
				|| action.equals("triangulo") || action.equals("soltar") || action.equals("dibujar")
				|| action.equals("ayuda") || action.equals("salir")) {
			if (tokens.length > 1) {
				output.printf("Error de sintaxis: \"%s\" no tiene par�metros\n", action);
				return;
			}
		}

		if (action.equals("salir")) {
			exit = true;
		} else if (action.equals("seleccion")) {
			editor.setTool(new SelectionTool(editor));
		} else if (action.equals("rectangulo")) {
			editor.setTool(new RectangleTool(editor));
		} else if (action.equals("circulo")) {
			editor.setTool(new CircleTool(editor));
		} else if (action.equals("triangulo")) {
			editor.setTool(new TriangleTool(editor));
			
		} else if (action.equals("pulsar")) {
			try {
				// la siguiente l�nea es para que funcione independientemente de si las
				// coordenadas
				// est�n separadas s�lo por una coma o si hay espacios entre los n�meros y la
				// coma
				String[] arguments = tokens[1].split("\\s*,\\s*");
				int x = Integer.parseInt(arguments[0]);
				int y = Integer.parseInt(arguments[1]);
				editor.useTool(tokens);
			} catch (NumberFormatException e) {
				output.println(
						"Error de sintaxis: se esperaban las coordenadas del punto en que se hizo clic: pulsar <x>, <y>");
			}
		} else if (action.equals("mover")) {
			try {
				// la siguiente l�nea es para que funcione independientemente de si las
				// coordenadas
				// est�n separadas s�lo por una coma o si hay espacios entre los n�meros y la
				// coma
				String[] arguments = tokens[1].split("\\s*,\\s*");
				int x = Integer.parseInt(arguments[0]);
				int y = Integer.parseInt(arguments[1]);
				editor.useTool(tokens);
			} catch (NumberFormatException e) {
				output.println(
						"Error de sintaxis: se esperaban las coordenadas del punto adonde se movi� el cursor: mover <x>, <y>");
			}
		} else if (action.equals("soltar")) {
			editor.useTool(tokens);
		} else if (action.equals("dibujar")) {
			editor.drawDocument();
		} else if (action.equals("ayuda")) {
			showHelp();
		} else if (action.equals("deshacer")) {
			editor.getActionManager().undo();
		} else if (action.equals("rehacer")) {
			editor.getActionManager().redo();
		} else {
			output.println("Acci�n desconocida");
			showHelp();
		}
	}
}
