import java.util.HashMap;
import java.util.Scanner;

public class morsecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<>();
		map.put(".-", "A");
		map.put("-...", "B");
		map.put("-.-.", "C");
		map.put("-..", "D");
		map.put(".", "E");
		map.put("..-.", "F");
		map.put("--.", "G");
		map.put("....", "H");
		map.put("..", "I");
		map.put(".---", "J");
		map.put("-.-", "K");
		map.put(".-..", "L");
		map.put("--", "M");
		map.put("-.","N");
		map.put("---", "O");
		map.put(".--.", "P");
		map.put("--.-", "Q");
		map.put(".-.", "R");
		map.put("...", "S");
		map.put("-", "T");
		map.put("..-", "U");
		map.put("...-", "V");
		map.put(".--", "W");
		map.put("-..-", "X");
		map.put("-.--", "Y");
		map.put("--..", "Z");
		map.put("/", " ");
		
		String morse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		String [] morseArray = morse.split(" ");
		
		for(String word: morseArray) {
			System.out.print(map.get(word));
		}
	
		
	}
	public void HashMap() {
		
	
		
	}

}
