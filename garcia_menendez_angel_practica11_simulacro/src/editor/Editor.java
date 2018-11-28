package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Editor {
	public static BufferedReader in;
	private static StringBuilder texto;
	private static Parser parser;

	public void initiate() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		texto = new StringBuilder("");
		parser = new Parser(this);

		System.out.println("Acciones");
		System.out.println("--------");
		System.out.println("abre <fichero>");
		System.out.println("inserta <texto>\t\t// inserta las palabras al final del texto");
		System.out.println("borra\t\t\t// borra la última palabra");
		System.out.println("reemplaza <a> <b>\t// reemplaza la cadena <a> por la <b> en todo el texto");
		System.out.println("salir");
		System.out.println();
		System.out.println("Tareas");
		System.out.println("------");
		System.out.println("graba <macro>\t\t// comienza la grabación de una macro");
		System.out.println("para\t\t\t// finaliza la grabación");
		System.out.println("ejecuta <macro>\t\t// ejecuta la macro cuyo nombre se indique");
		System.out.println();

		do {
			System.out.print("> ");

			String[] line = in.readLine().split(" ");

			// No se comprueba que el número de palabras sea el adecuado
			// Aquí habría que aplicar el patron command
			parser.parse(line).execute(line);

			System.out.println(texto);

		} while (true);
	}

	public void exit() {
		System.out.println("Exiting the editor...");
		System.exit(0);
	}

	public StringBuilder getText() {
		return texto;
	}

	public void setText(StringBuilder text) {
		Editor.texto = text;
	}

	public Parser getParser() {
		return Editor.parser;
	}
}
