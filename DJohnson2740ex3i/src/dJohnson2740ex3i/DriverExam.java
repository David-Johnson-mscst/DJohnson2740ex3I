package dJohnson2740ex3i;

import javax.swing.DefaultListModel;

public class DriverExam {
	private char[] answers;
	private char[] responses;
	private final double requiredPct = 0.7;
	
	public DriverExam(char[] answers) {
		this.answers = new char[answers.length];
		for (int i = 0; i < answers.length; i++) {
			this.answers[i] = answers[i];
		}
	}
	
	public DriverExam(DefaultListModel answers) {
		this.answers = new char[answers.getSize()];
		for (int i = 0; i < answers.getSize(); i++) {
			String a = (String) answers.get(i);
			this.answers[i] = a.charAt(0);
		}
	}
	
	public void setResponses(DefaultListModel responses) {
		this.responses = new char[responses.getSize()];
		for (int i = 0; i < responses.getSize(); i++) {
			String r = (String) responses.getElementAt(i);
			this.responses[i] = r.charAt(0);
		}
	}
	
	public DefaultListModel getAnswers() {
		DefaultListModel answersListModel = new DefaultListModel();
		int i = 0;
		 while (i < answers.length) {
			 answersListModel.addElement('B');
			 answersListModel.addElement('D');
			 answersListModel.addElement('A');
			 answersListModel.addElement('A');
			 answersListModel.addElement('C');
			 answersListModel.addElement('A');
			 answersListModel.addElement('B');
			 answersListModel.addElement('A');
			 answersListModel.addElement('C');
			 answersListModel.addElement('D');
		 }
		return answersListModel;
	}
	
	public int validate() {
		 int invalidIndex = -1;
		 int i = 0;
		 while (i < answers.length && invalidIndex == -1) {
			 if (responses[i] != 'A' &&
					 responses[i] != 'B' &&
					 responses[i] != 'C' &&
					 responses[i] != 'D')
				 invalidIndex = i;
			 else i++;
		 }
		 return invalidIndex;
	}
	
	public boolean passed() {
		if (totalCorrect() >= requiredPct) {
			return true;
		}
	}
	
	public int totalCorrect() {
		for ( int i = 0; answers[i] == responses[i]; i++) {
			return this.answers;
		}
	}
	
	public int totalIncorrect() {
		for ( int i = 0; answers[i] != responses[i]; i++) {
			return this.answers.length;
		}
	}
	
	public int [] questionsMissed() {
		int[] missed = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int m = 0;
		for (int i = 0; answers[i] == responses[i]; i++) {
			if (answers != responses) {
				missed[m] = i + 1;
				m++;
			}
		}
		return missed;
	}

}
