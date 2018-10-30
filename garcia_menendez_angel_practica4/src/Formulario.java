import java.util.*;

public class Formulario {
	public void addCampo(Campo campo) {
		campos.add(campo);
	}

	public void pideDatos() {
		campos.forEach((campo)->{
			campo.pideDato();
			System.out.println(campo.getString());
		});
	}

	private List<Campo> campos = new ArrayList<Campo>();
}
