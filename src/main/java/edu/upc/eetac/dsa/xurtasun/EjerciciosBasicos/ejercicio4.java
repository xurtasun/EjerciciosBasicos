package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ejercicio4
{
	
    public static void main( String[] args )
    {
    	 File fichero = null;
         Reader lectura = null;
         BufferedReader tunel = null;
         int contador = 0;
         int Rlectura;
         
         Date date = new Date();
         
         String file = "caracteres.txt";
         
         try{
        	 
       	  fichero = new File (file);
       	  lectura = new FileReader (fichero);
         	}
         
         catch(FileNotFoundException e)
         	{
        	 System.out.println("Fichero no encontrado");
         	}
         
         try
	         {
        	  tunel = new BufferedReader (lectura);
        	  Rlectura = tunel.read();
        	  while (Rlectura != -1)
        	  {
        		  contador ++;
        		  Rlectura = tunel.read();
        	  }
        	  System.out.println("El archivo contiene "+ contador+" caracteres.");
        	 
	         }
         catch (IOException e)
	         {
	         	throw new RuntimeException(e);
	         }
         
         String impresion;
         SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         
         impresion = fecha.format(date) + " " + file +" "+ contador;
         System.out.println(impresion);
         
         
         File fichero2 = null;
         
         try 
         	{
        	 fichero2 = new File("registro.txt");
        	 	if(!fichero2.exists())
        	 		{
        	 			fichero2.createNewFile();
        	 		}
        	 	FileWriter fw = new FileWriter (fichero2,true);
        	 	BufferedWriter bw = new BufferedWriter(fw);
        	 	bw.write(impresion);
        	 	bw.newLine();
        	 	bw.close();
         	}
         catch (IOException e) 
         	{
        	 	e.printStackTrace();
        	}
         finally 
         	{
        	 try 
        	 	{
        		 if (tunel != null)
        		 {
        			 tunel.close();
        		 }
        	 	}
        	 	catch (Exception e2) 
        	 		{
        	 			throw new RuntimeException(e2);
        	 		}
        	 }
         
         }
    }
    

