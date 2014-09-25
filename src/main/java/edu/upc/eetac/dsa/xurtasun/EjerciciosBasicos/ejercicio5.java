package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ejercicio5
{
	
    public static void main( String[] args )
    {
    	 File fichero = null;
         BufferedReader tunel = null;

         
         Date date = new Date();
         
         String file = "imagen.jpg";
         fichero = new File (file);
         System.out.println("El archivo tiene "+ fichero.length()+" Bytes.");
         
         
         
         String impresion;
         SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         
         impresion = fecha.format(date) + " " + file +" "+ fichero.length()+ "Bytes";
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
    

