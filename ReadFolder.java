package com.file;

import java.io.File;
import java.util.Arrays;

public class ReadFolder {
	
	public static void main(String[] args) {
		
		
		File f = new  File("C:\\Users\\Bhagirath\\Downloads");
		
		File dFolder [] = f.listFiles();
		
		Arrays.sort(dFolder);
		for(File e : dFolder)
		{
			
			if(e.isFile())
			{
				System.out.println("File :-"+e.getName());
			}
			else if(e.isDirectory())
			{
				System.out.println(" directory-:"+e.getName());
			}
			else
				System.out.println("something went wrong");
		}
	}

}
