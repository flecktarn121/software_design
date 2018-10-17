package tool;
import editor.Drawing;

public interface Tool {
	public void processAcction(String[] tokens);
	public void setDrawing(Drawing drawing);
}
