package FormandoEquipo;

public class Equipo implements Comparable<Object>{

	private double afinidad;
	private String respIguales;
	private int cantColaboradores;
	
	public Equipo(String respIguales, int cant) {
		
		this.respIguales = respIguales;
		this.cantColaboradores = cant;
		this.afinidad = (cant * Math.pow(respIguales.length(), 2));
	}

	@Override
	public int compareTo(Object o) {
		return (int) (this.afinidad - ((Equipo)o).afinidad);
	}

	public double getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(double afinidad) {
		this.afinidad = afinidad;
	}

	public String getRespIguales() {
		return respIguales;
	}

	public void setRespIguales(String respIguales) {
		this.respIguales = respIguales;
	}

	public int getCantColaboradores() {
		return cantColaboradores;
	}

	public void setCantColaboradores(int cantColaboradores) {
		this.cantColaboradores = cantColaboradores;
	}
	
}
