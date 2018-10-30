package form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Monument;

public abstract class BasicForm implements Form{
	private BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	public BasicForm() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void edit();

	String readLine() {
		do {
			try {
				return console.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura: inténtelo de nuevo");
			}
		} while (true);
	}

}
