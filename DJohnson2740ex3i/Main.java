package dJohnson2740ex3i;

import javax.swing.DefaultListModel;

public class Main {

	public static void main(String[] args) {
		DriverExamObjMapper mapper = new DriverExamObjMapper("DriverExam.txt");
		DriverExam exam = mapper.getDriverExam();

	}

}
