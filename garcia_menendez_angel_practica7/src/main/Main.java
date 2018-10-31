package main;

import java.io.*;

import filesystem.FileSystem;
import outputs.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FileSystem system = new FileSystem();

		system.copyFile("privado.txt", new NormalizedTextOutput(new FileOutput("copia.txt")));
		system.copyFile("privado.txt", new NormalizedTextOutput(new EncriptedOutput(new FileOutput("copiaEncriptada.txt"))));
		system.copyFile("privado.txt", new EncriptedOutput(new Internet("156.35.33.105")));
		system.copyFile("privado.txt",
				new EncriptedOutput(new NoRepeatedSpacesOutput(new Bluetooth("iPhone de César"))));
	}
}
