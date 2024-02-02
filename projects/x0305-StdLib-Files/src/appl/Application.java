package appl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import jj.util.log.Log;

public class Application {

	public static void main(String[] args) throws IOException {
		demoOverwrite();
		demoAppend();
		demoLines();
	}
	
	static void demoOverwrite() throws IOException {
		Log.logMethodCall();
		var path = Path.of("abc.txt");

		Files.writeString(path, "Hello\n");
		Files.writeString(path, "World\n");
		Files.writeString(path, "Good\nBye\n");
		 
		final String line1 = Files.readString(path);
		final String line2 = Files.readString(path);
		final String line3 = Files.readString(path);
		 
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
	}
	
	static void demoAppend() throws IOException {
		Log.logMethodCall();
		var path = Path.of("abc.txt");

		Files.writeString(path, "Hello\n");
		Files.writeString(path, "World\n", StandardOpenOption.APPEND);
		 
		final String line = Files.readString(path);
		
		System.out.println(line);
	}

	static void demoLines() throws IOException {
		Log.logMethodCall();
		var path = Path.of("abc.txt");

		Files.writeString(path, "Hello\n");
		Files.writeString(path, "World\n", StandardOpenOption.APPEND);
		 
		Files.readString(path).lines().forEach(System.out::println);
		Files.lines(path).forEach(System.out::println);
	}
}
