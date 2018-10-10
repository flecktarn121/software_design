import java.io.*;

public class CampoPredefinido extends CampoBase implements Campo {

	private String etiqueta;
	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = false;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();

				for (String valor : valores) {
					if (texto.toLowerCase().equals(valor.toLowerCase())) {
						valido = true;
						break;
					}
				}
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	public String getString() {
		return texto;
	}

	private String texto;

	@Override
	protected boolean checkValidity(String texto) {
		// TODO Auto-generated method stub
		return false;
	}
}
