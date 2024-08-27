package controller;
import java.io.*;

public class DistroController {
	public DistroController() {
		super();
	}
	
	private String os() {
		return System.getProperty("os.name").toLowerCase();
		}
	
	public void exibeDistro() {
		String os = os();
		
		if (os.contains("linux")) {
			try {
				Process process = Runtime.getRuntime().exec("cat /etc/os-release");
				
				BufferedReader buffer = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String linha;
				System.out.println("Informações da distribuiçao linux: ");
				
				while((linha=buffer.readLine())!=null) {
					if (linha.startsWith("NAME=") || linha.startsWith("VERSION="));
					System.out.println(linha);
				}
			
			buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
		}
	} else {
		System.out.println("Sistema não é Linux. SO inválido");
		}
	}
}
