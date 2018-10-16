

public class CampoNumero extends CampoBase{

	public CampoNumero(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkValidity(String texto) {
		boolean valido = true;
		for (char ch : texto.toCharArray()) {
			if (!Character.isDigit(ch)) {
				valido = false;
				break;
			}
		}
		return valido;
	}
}
