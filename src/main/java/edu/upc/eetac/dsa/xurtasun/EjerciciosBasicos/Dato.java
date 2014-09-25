package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;

import java.io.*;

public class Dato implements Serializable
		{
			int edad;
			String nombre;
			char peso;
	
			public Dato (String nom, int edat, char pes)
			{
				this.edad = edat;
				this.nombre = nom;
				this.peso = pes;
				
			}
			
			public String getnombre()
			{
				return nombre;
			}
			public void setnombre(String nom) 
			{
				this.nombre = nom;
			}
			public int getedad()
			{
				return edad;
			}
			public void setedad(int ed) 
			{
				this.edad = ed;
			}
			public void setgenero(char pes) 
			{
				this.peso = pes;
			}
			public char getgenero() 
			{
				return peso;
			}
			public String toString()
			{
				return "Dato (persona) [nombre=" + nombre + ", edad=" + edad+ ", peso="+peso+ "]";
			}
			
		}
