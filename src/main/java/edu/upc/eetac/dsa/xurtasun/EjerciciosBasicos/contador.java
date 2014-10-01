package edu.upc.eetac.dsa.xurtasun.EjerciciosBasicos;

public class contador  {
	
	String id;
	int nInicio;
	
	public contador (String id, int num)
	{
		this.id = id;
		this.nInicio = num;
	}

	public String getidentificador()
	{
		return id;
	}
	public void setidentificador(String id) 
	{
		this.id = id;
	}

	public int getnumero()
	{
		return nInicio;
	}
	public void setnumero(int num) 
	{
		this.nInicio = num;
	}
	public String toString()
	{
		return "contador (cronometro) [identificador=" + id + ", empieza en=" + nInicio+"]";
	}

}
