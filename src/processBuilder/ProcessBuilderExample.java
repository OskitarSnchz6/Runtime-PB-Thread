package processBuilder;

import java.io.File;

public class ProcessBuilderExample {
	public static void main(String[] args) {
		
		//Crear el comando
		String cmd = "ps";
		
		try {
			ProcessBuilder pb = new ProcessBuilder(cmd);
			
			//Dirigir la salida al fichero llamado x
			pb.redirectOutput(new File("C:\\Users\\oskit\\OneDrive\\Escritorio\\prueba.txt"));
			
			pb.start();//Ejecutar el comando
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}