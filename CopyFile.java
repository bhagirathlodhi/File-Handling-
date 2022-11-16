package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.INPUT_STREAM;

public class CopyFile {
	public static void main(String[] args) {
		
		copyFile();
	}

	public static void copyFile(){
		
	
	File f = new File("C:\\Users\\Bhagirath\\Downloads\\sample.pdf");
	File of = new File("C:\\Users\\Bhagirath\\Downloads\\sample_copy.pdf");
	FileInputStream input = null;
	FileOutputStream out = null;
	try
	{
		input = new FileInputStream(f);
		out = new FileOutputStream(of);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}try
	{
		System.out.println(input.available());
	}catch(
	IOException e)
	{
		e.printStackTrace();
	}

	int i = 0;try
	{
		while ((i = input.read()) != -1) {
			out.write(i);
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}finally
	{
		// close the streams:
		if (input != null)
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		if (out != null)
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
}
}

