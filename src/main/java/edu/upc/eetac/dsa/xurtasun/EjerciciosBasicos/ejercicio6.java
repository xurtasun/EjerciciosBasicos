package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;
import java.io.*;



public class ejercicio6
{
	
    public static void main( String[] args )
    {
    	File fichero1 = null;
        Reader lectura1 = null;
        BufferedReader br1 = null;
        int cont1 = 0;
        int cont2 = 0;
        int i = 0 ;
        int j = 0;
        String linea;
        
        String file1 = "registro.txt";
        
        try{
       	 
      	  fichero1 = new File (file1);
      	  lectura1 = new FileReader (fichero1);
        	}
        
        catch(FileNotFoundException e)
        	{
       	 System.out.println("Fichero no encontrado");
        	}
        
        try
	         {
       	  br1 = new BufferedReader (lectura1);
       	  linea = br1.readLine(); 
       	  while (linea != null)
       	  {
	       		  String [] resultado = linea.split(" ");
	       		  System.out.println(resultado[i]);
	       		  //cont1 = Integer.parseInt(resultado[4]);
	       		  i++;
       		  
       	  }
       	  
       	  System.out.println(cont1);
       	  
       	 
	         }
        catch (IOException e)
	         {
	         	throw new RuntimeException(e);
	         }
        
        //File fichero2 = null;

        //String file2 = "imagen.jpg";
        //fichero2 = new File (file2);
        //System.out.println("El archivo tiene "+ fichero2.length()+" Bytes.");
        
       
    }	
}
    

