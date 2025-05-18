package io.start;

import static java.nio.charset.StandardCharsets.*;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {
	public static void main(String[] args) throws IOException {
		System.out.println("hello");

		PrintStream printStream = System.out;
		printStream.println();

		byte[] bytes = "hello\n".getBytes(UTF_8);
		printStream.write(bytes);
		printStream.println("Print!");
	}
}
