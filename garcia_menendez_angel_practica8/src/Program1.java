import java.io.IOException;

import data.BarChart;
import data.Database;
import data.DefaultDataCenter;
import data.PieChart;
import data.StateLine;
import poll.Poll;
import ui.Interviewer;

public class Program1 {
	public static void main(String[] args) throws IOException {
		DefaultDataCenter dc = new DefaultDataCenter();
		dc.Add(new Database(dc));
		dc.Add(new BarChart(dc));
		dc.Add(new PieChart(dc));
		dc.Add(new StateLine(dc));
		Poll poll = new Poll("¿Está a favor de la energia nuclear?", dc);

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}
