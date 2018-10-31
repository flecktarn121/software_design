package main;

import java.io.*;

import filesystem.FileSystem;
import outputs.*;
import outputs.filter.CharacterCountOutput;
import outputs.filter.EncriptedOutput;
import outputs.filter.NoRepeatedSpacesOutput;
import outputs.filter.NormalizedTextOutput;

public class Main {
	public static void main(String[] args) throws IOException {
		FileSystem system = new FileSystem();

		system.copyFile("privado.txt", new NormalizedTextOutput(new FileOutput("copia.txt")));
		system.copyFile("privado.txt", new NormalizedTextOutput(new EncriptedOutput(new FileOutput("copiaEncriptada.txt"))));
		system.copyFile("privado.txt", new EncriptedOutput(new Internet("156.35.33.105")));
		system.copyFile("privado.txt", new NoRepeatedSpacesOutput(new EncriptedOutput(new Internet("156.35.33.106"))));
		system.copyFile("privado.txt", new NoRepeatedSpacesOutput(new NormalizedTextOutput(new EncriptedOutput(new Internet("156.35.33.107")))));
		system.copyFile("privado.txt",
				new EncriptedOutput(new NoRepeatedSpacesOutput(new Bluetooth("iPhone de César"))));
		CharacterCountOutput counter = new CharacterCountOutput(new Internet("1.1.1.1"));
		system.copyFile("privado.txt", new EncriptedOutput(counter));
		System.out.println("The number of characters is: "+counter.getNumberOfCharacters());
	}
}
