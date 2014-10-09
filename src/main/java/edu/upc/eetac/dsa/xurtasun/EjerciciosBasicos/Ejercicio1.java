package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;
import java.io.*;

public class Ejercicio1 
{
	
    public static void main( String[] args ) throws BigNumberException
    {
      File fichero = null;
      Reader lectura = null;
      BufferedReader tunel = null;
      
      try{
    	  fichero = new File ("numeros.txt");
    	  lectura = new FileReader (fichero);
    	  tunel = new BufferedReader (lectura);
    	  
    	  String linea;
    	  
    	  while((linea=tunel.readLine())!=null)
    	  {
    		  String [] numeros = linea.split("-");
    		  for (int i = 0;i < numeros.length;i++)
    		  {
    			  int entero = Integer.parseInt(numeros[i]);

    			  if (entero>1000){
    				  
    				  throw new BigNumberException();
    			  }
    			  else
	    			  {
	    			  	System.out.println(numeros[i]);
	    			  }
    			  
    			 

    		  }
    	  }
      }
      catch (BigNumberException b)
	      {
    	  	b.BigNumberException();
	      }
      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }
      finally
      {
    	  try{
    		  if( null != lectura )
	    		  {
	    		  	lectura.close();
	    		  }
    		  }
    	  catch (Exception e2)
    	  		  {
	    		 	e2.printStackTrace();
	    		  }
      }
      
      
    }
}
