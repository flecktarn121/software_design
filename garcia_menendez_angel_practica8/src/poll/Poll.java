package poll;

import data.DataCenter;

public class Poll {
	private int yeses, nos;
	private String question;
	private DataCenter dc;

	public Poll(String question, DataCenter dc) {
		this.question = question;
		this.dc = dc;
	}

	public String getQuestion() {
		return question;
	}

	public int getYeses() {
		return yeses;
	}

	public int getNos() {
		return nos;
	}

	public void incrementYeses() {
		yeses++;
		dc.updateData();
	}

	public void incrementNos() {
		nos++;
		dc.updateData();
	}

}
