
public class CampoPredefinido extends CampoBase implements Campo {
	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	@Override
	protected boolean checkValidity(String texto) {
		boolean valido = false;
		for (String valor : valores) {
			if (texto.toLowerCase().equals(valor.toLowerCase())) {
				valido = true;
				break;
			}
		}
		return valido;

	}
}
