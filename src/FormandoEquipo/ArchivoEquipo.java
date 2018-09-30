package FormandoEquipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArchivoEquipo {

	public static FormarEquipo leer(String path) throws FileNotFoundException  {
		
		Scanner sc = new Scanner(new File(path));
		
		int cantPreguntas = sc.nextInt();
		int cantColaboradores = sc.nextInt();
		Colaborador[] colaboradores = new Colaborador[cantColaboradores];
		sc.nextLine(); // linea en blanco.. preguntar como evitar esto
		
		for(int i=0;i<cantColaboradores;i++)
			colaboradores[i]=new Colaborador(sc.nextLine());
		
		Arrays.sort(colaboradores);
		
		sc.close();
		return new FormarEquipo(colaboradores,cantColaboradores,cantPreguntas);
	}
	
	public static void escribir(String path, Equipo equipo) throws FileNotFoundException {
		
		PrintWriter salida = new PrintWriter(new File(path));
		
		if(equipo == null)
			salida.println("0");
		else {
			salida.println(equipo.getAfinidad());
			salida.println(equipo.getRespIguales());
		}
		
		salida.close();
		
	}
	
	
}
