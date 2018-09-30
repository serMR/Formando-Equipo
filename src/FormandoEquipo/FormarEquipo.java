package FormandoEquipo;

public class FormarEquipo {

	private int cantColaboradores;
	private int cantPreguntas;
	private Colaborador[] colaboradores;
	
	public FormarEquipo(Colaborador[] c, int col, int preg) {
		
		this.colaboradores = c;
		this.cantColaboradores = col;
		this.cantPreguntas = preg;
	
	}
	
	public Equipo resolucion() {
		
		int c=0,cont=1;
		boolean bandera=true;
		Equipo equipo = null, auxiliar = null;
		
		for(int n=1;n<=cantPreguntas;n++){

			while(c<cantColaboradores) {
				
				while( (c+1)<cantColaboradores && colaboradores[c].esAfin(colaboradores[c+1], n)) { 
					cont++;
					c++;
				}
			
				if(bandera) {
					equipo = new Equipo(colaboradores[c].getRespuesta().substring(0,n),cont);
					bandera=false;
				}else {
					auxiliar = new Equipo(colaboradores[c].getRespuesta().substring(0,n),cont);
					if(equipo.compareTo(auxiliar)<0) 
						equipo=auxiliar;
				}
				
				cont=1;
				c++;
			}
			c=0;
		}

		return equipo;
	
	}
	
	
}
