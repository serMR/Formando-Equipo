package FormandoEquipo;

public class Colaborador implements Comparable<Object>{

	private String respuesta;
	
	public Colaborador(String resp) {
		this.respuesta = resp;
	}
	
	public boolean esAfin(Colaborador obj, int n) {
		return this.respuesta.substring(0, n).equals(obj.respuesta.substring(0,n));
		
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public int compareTo(Object arg0) {
		Colaborador obj = (Colaborador) arg0;
		// TODO Auto-generated method stub
		return respuesta.compareTo(obj.respuesta);
	}
	
}
