package FormandoEquipo;

import java.io.FileNotFoundException;

public class AppEquipo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FormarEquipo equipo = ArchivoEquipo.leer(".\\equipo4.in");
		ArchivoEquipo.escribir(".\\equipo.out", equipo.resolucion());		
	}

}
