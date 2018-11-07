import java.io.IOException;

import data.DefaultDataCenter;
import poll.Poll;
import ui.Interviewer;

public class Program1 {
	public static void main(String[] args) throws IOException 
	{
		DefaultDataCenter dc = new DefaultDataCenter();
		Poll poll = new Poll("¿Está a favor de la energia nuclear?", dc);

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}
