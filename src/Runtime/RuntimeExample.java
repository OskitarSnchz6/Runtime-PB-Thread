package Runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RuntimeExample {

	public static void main(String[] args) {
		
		//Sacar el Runtime
		Runtime builder = Runtime.getRuntime();
		
		//Ejecutar la linea de comandos
		String cmd = "ls -l";
		
		try {
			//ejecutar el comando y guardar el proceso
			Process out = builder.exec(cmd);
			
			//sacar el resultado y pintarlo en la consola
			BufferedReader bf = new BufferedReader(new InputStreamReader(out.getInputStream()));
			String linea;
			while( (linea=bf.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}