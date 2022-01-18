package processBuilder;

import java.io.IOException;

public class LanzaProceso {
	public static void main(String[] args) {
	String proceso = "notepad";
		ProcessBuilder pb = new ProcessBuilder(proceso);
		pb.inheritIO();
		try {
			Process p = pb.start();
			int codRet = p.waitFor();
			System.out.println("La ejecución de " + proceso + " devuelve " + codRet + " " + (codRet == 0 ? "(ejecución correcta)" : "(ERROR)"));
		} catch (IOException e) {
			System.err.println("Error durante ejecución del proceso");
			System.exit(2);
		} catch (InterruptedException e) {
			System.err.println("Proceso interrumpido");
			System.exit(3);
		}
	}
}