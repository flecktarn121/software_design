package CH.ifa.draw.samples.nada;

import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.standard.CreationTool;

public class EjemploTool extends CreationTool {

	public EjemploTool(DrawingView view) {
		//implementado usando prototype. Podría hacerse con el template y el metodo createFigure
		super(view, new EjemploFigure());
	}

}
