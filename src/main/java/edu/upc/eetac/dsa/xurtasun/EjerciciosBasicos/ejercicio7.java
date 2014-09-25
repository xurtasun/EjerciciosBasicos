package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ejercicio7 
{
	
	public static void main(String[] args) 
	{
		String nFichero = "ejer7.txt";
		Dato d = new Dato ("Xavi",34,'k');
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		
		try 
		{
			fos = new FileOutputStream (nFichero);
			out = new ObjectOutputStream(fos);
			out.writeObject(d);
			
			out.close();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		
		FileInputStream fis = null;
		ObjectInputStream in = null;
		
		try
		{
			fis = new FileInputStream(nFichero);
			in = new ObjectInputStream(fis);
			d = (Dato) in.readObject();
			in.close();
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		System.out.println(d);
		
		
	}

}
