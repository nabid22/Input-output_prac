package Filename;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sum {

	private static final String FILENAME = "F:\\Users\\cse\\Desktop\\nabid.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "anis nabid rocky mahabub limon\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
