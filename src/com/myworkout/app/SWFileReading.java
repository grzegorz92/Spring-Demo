package com.myworkout.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWFileReading {

	public String proSwimmer() {

		File fr = new File("swimmingWorkout_pro.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(fr);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String value = "";
		while (sc.hasNextLine()) {
			value = value + sc.nextLine() + "\n";

		}

		sc.close();

		return value;

	}

	public String beginnerSwimmer() {

		File fr = new File("swimmingWorkout_beginner.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(fr);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String value = "";
		while (sc.hasNextLine()) {
			value = value + sc.nextLine() + "\n";

		}

		sc.close();

		return value;

	}

}
