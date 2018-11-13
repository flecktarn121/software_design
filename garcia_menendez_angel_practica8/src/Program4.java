import java.io.IOException;

import data.BarChartThree;
import data.Database;
import data.DefaultDataCenter;
import data.PieChartThree;
import data.StateLineFour;
import poll.Poll;
import ui.Interviewer;

public class Program4 {
	public static void main(String[] args) throws IOException {
		DefaultDataCenter dc = new DefaultDataCenter();
		dc.Add(new Database(dc));
		dc.Add(new PieChartThree(dc));
		dc.Add(new StateLineFour(dc));
		dc.Add(new BarChartThree(dc));
		Poll poll = new Poll("¿Está a favor de la energia nuclear?", dc);

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}
