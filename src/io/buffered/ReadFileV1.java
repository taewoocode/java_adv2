package io.buffered;

import static io.buffered.BufferedConst.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;

public class ReadFileV1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(BufferedConst.FILE_NAME);

		long startTime = System.currentTimeMillis();
		int fileSize = 0;
		int data;
		while ((data = fis.read()) != -1) {
			fileSize++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("File created: " + FILE_NAME);
		System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
		System.out.println("Time taken:: " + (endTime - startTime) + "ms");

		ForkJoinPool.getCommonPoolParallelism();
	}
}
