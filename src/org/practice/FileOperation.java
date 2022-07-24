package org.practice;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\New folder\\sample\\sudha\\ammu\\kumar.xlsx\\sudha.ppt");
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
	//	boolean mkdirs = f.mkdirs();
		//System.out.println(mkdirs);
		
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		
		
		
		
		
		
		
	}

}
