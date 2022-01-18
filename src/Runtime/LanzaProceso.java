package Runtime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LanzaProceso {
	public static void main(String[] args) {
	Runtime r = Runtime.getRuntime();
	String comando = "notepad";
		Process p;
		try {
			p = r.exec(comando);
				p.waitFor(3, TimeUnit.SECONDS);
				p.destroy();
			} catch (IOException e1) {
				System.out.println("Error en: " + comando);
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				System.err.println("Proceso interrumpido");
				e1.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
		}
	}
}