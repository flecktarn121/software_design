import java.io.*;

import data.BarChart;
import data.Database;
import data.DefaultDataCenter;
import data.PieChart;
import poll.*;
import ui.Interviewer;

public class Main {
	public static void main(String[] args) throws IOException {
		DefaultDataCenter dc = new DefaultDataCenter();
		dc.Add(new Database());
		dc.Add(new PieChart());
		dc.Add(new BarChart());
		Poll poll = new Poll("¿Está a favor de la energia nuclear?", dc);

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}
