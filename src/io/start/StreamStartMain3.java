package io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("temp/hello.dat");
		byte[] input = {65, 66, 67};
		fos.write(input);
		fos.close();

		FileInputStream fis = new FileInputStream("temp/hello.dat");
		byte[] buffer = new byte[10];
		int readCount = fis.read(buffer, 0, 10);// 0 ~ 10
		System.out.println("readCount = " + readCount);
		System.out.println(Arrays.toString(buffer));
		fis.close();
	}
	/**
	 * 컴퓨터는 대부분 byte 단위로 데이터를 주고 받는다 bit 단위는 너무 작다.
	 * 파일, 네트워크 콘솔 각각 데이터를 주고 받는 방식으로 데이터를 주고 받는다.
	 */
}
