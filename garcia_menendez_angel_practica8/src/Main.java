import java.io.*;

import data.DataCenter;
import data.DefaultDataCenter;
import poll.*;
import ui.Interviewer;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		DataCenter dc = new DefaultDataCenter();
		Poll poll = new Poll("¿Está a favor de la energia nuclear?", dc);

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}

