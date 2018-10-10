import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CampoBase implements Campo {

	private String etiqueta;
	private String texto;

	public CampoBase(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Override
	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
				valido=checkValidity(texto);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);

	}
	
	

	protected abstract boolean checkValidity(String texto);

	@Override
	public String getString() {
		
		return texto;
	}

}
