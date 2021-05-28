package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {
		public static void main(String[] args) {
			IArquivosController arqCont = new ArquivosController();
			String dirWin = "C:\\Windows";
			String path = "C:\\Windows\\Temp\\Exemplo";
			String name = "teste.txt";
			try{
				//arqCont.readDir(dirWin);
				//arqCont.createFile(path, name);
				arqCont.readFile(path, name);
				//arqCont.openFile(path, name);
			}catch(IOException e){
				e.printStackTrace();
			} 
		}

}
