package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;
import java.util.Timer;
import java.util.TimerTask;

public class CuentaAtras extends Thread 
{
	int inicio = 16;
	String[] Contador = new String[3];
	/*int cont1 = Integer.parseInt(Contador[0]);
	int cont2 = Integer.parseInt(Contador[1]);
	int cont3 = Integer.parseInt(Contador[2]);*/
	
	

	static int i;
	
	Timer timer = new Timer();
    	
	TimerTask task = new TimerTask() {

        public void run()
        {
        	
        	System.out.println("Soy el contador numero "+ i);
        	System.out.println("Timer: "+ inicio);
        	inicio--;
        	
        }
        };
	
	

	 

	public void run() 
	{
		timer.schedule(task, 0, 1000);
		System.out.println("Iniciando thread");
       
    }
	 
    public static void main (String [] args) {
    	
    	int nContadores = 3;

    	/*for( i= 0; i< nContadores; i++){
    		new CuentaAtras().start();
    	}*/
    	
    	
    	
    	new CuentaAtras().start();
    }

}
