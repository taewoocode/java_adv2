package io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ByteArrayStreamMain {
	private static final Logger logger = Logger.getLogger(ByteArrayStreamMain.class.getName());

	public static void main(String[] args) throws IOException {


		byte[] input = {1, 2, 3};
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(input);

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		byte[] bytes = bais.readAllBytes();
		logger.info("message: " + Arrays.toString(bytes));
	}
}
