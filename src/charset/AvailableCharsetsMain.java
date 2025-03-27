package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {
	/**
	 * 이용 가능한 Charset
	 */
	public static void main(String[] args) {
		SortedMap<String, Charset> charset = Charset.availableCharsets();
		for (String charsetName : charset.keySet()) {
			System.out.println("charsetName = " + charsetName);
		}

		System.out.println("=============");
		System.out.println("charset1 = " + getCharset(new String("MS949")));

		Set<String> aliases = getCharset(new String("MS949")).aliases();
		for (String alias : aliases) {
			System.out.println("alias = " + alias);
		}

		//UTF-8
		Charset charset2 = getCharset("UTF-8");
		Charset charset3 = StandardCharsets.UTF_8;

		//시스템의 기본 Charset 조회
		Charset defaultCharset = Charset.defaultCharset();
		System.out.println("defaultCharset = " + defaultCharset);

	}

	private static Charset getCharset(String name) {
		return Charset.forName(name);
	}



}
