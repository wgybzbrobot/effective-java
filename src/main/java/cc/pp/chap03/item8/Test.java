package cc.pp.chap03.item8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {

		final int NUMBER_OF_STUDENTS = 5;
		int[] marks = new int[NUMBER_OF_STUDENTS];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
				System.out.print("Enter marks for student #" + (i + 1) + ":");
				String str = reader.readLine();
				marks[i] = Integer.parseInt(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int 总和 = 0;
		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			总和 += marks[i];
		}
		System.out.println("Average Marks: " + (float) 总和 / NUMBER_OF_STUDENTS);

	}

}
