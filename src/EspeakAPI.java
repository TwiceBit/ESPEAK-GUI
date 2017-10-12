import java.io.IOException;

public class EspeakAPI {

/*
 * Author: TwiceBitDev
 * GitHub: github.com/TwiceBit
 * API: github.com/TwiceBit/TwiceBit-Java-APIs
 * API Developed by TwiceBit
 */

	
	
	
	public static void main(String[] args) {

	}

	public static void say(String text) {
		try {
			new ProcessBuilder("espeak", text).start();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void say(String text, String voice) {
		try {
			new ProcessBuilder("espeak", "-v", voice, text).start();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void say(String text, String voice, int voicespeed) {
		try {
			new ProcessBuilder("espeak", "-v", voice, "-s", String.valueOf(voicespeed), text).start();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void say(String text, String voice, int voicespeed, int pause) {
		try {
			new ProcessBuilder("espeak", "-v", voice, "-s", String.valueOf(voicespeed), "-g", String.valueOf(pause),
					text).start();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}


