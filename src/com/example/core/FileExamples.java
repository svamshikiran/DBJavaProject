package com.example.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExamples {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new 
					FileReader("c:\\personal\\SpringbootApplications\\DBTrainingJul2023\\sample.txt"));
			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			//System.out.println(str);
			in.close();
		} catch (IOException e) {
		}
	}

}
