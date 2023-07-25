package com.example.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
	
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new 
					FileReader("c:\\personal\\SpringbootApplications\\DBTrainingJul2023\\csvexample.csv"));
			String str;
			while ((str = in.readLine()) != null) {
				String[] cols = str.split(",");
				for (int i = 0; i < cols.length; i++) {
					System.out.println(cols[i]);
				}
			}
			//System.out.println(str);
			in.close();
		} catch (IOException e) {
			// ideally you should catch all you exception
		}finally {
			// ideally you should release all your resource here
		}
	}


}
