package com.hackerrank.solutions;

import java.io.File;
import java.util.Scanner;

public class Folder {
	public static void main(String args[]) {

		// Scanner sc = new Scanner(System.in);
		String str = "C:\\Users\\NIPC-43\\Desktop\\output\\sbmi";
		checkAndCreateFolderDirect(str);
		//checkAndCreateFolder(str);
		// sc.close();

	}

	private static void checkAndCreateFolderDirect(String str) {
		File file = new File(str);
		if(!file.exists()) {
			file.mkdir();
		}
		
	}

	private static void checkAndCreateFolder(String path) {
		path = "str\\mm\\";
		String parentFolder = "";
		if (path.contains("/")) {
			parentFolder = path.substring(0, path.lastIndexOf("/"));
		} else {
			parentFolder = path.substring(0, path.indexOf("\\"));
		}
		System.out.println(parentFolder);
		try {
			File file = new File(parentFolder);
			if (!file.exists()) {
				file.mkdir();
			}
			file = new File(path);
			if (!file.mkdir()) {
				file.mkdir();
			}
		} catch (Exception e) {

			System.out.println("Exception while creating directory: " + e.getMessage());
		}

	}

}
