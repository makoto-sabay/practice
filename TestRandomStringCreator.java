package inputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestRandomStringCreator {
	public int count = 0;
	
	public TestRandomStringCreator() {
		this.count = 8;
	}
	
	public String getRandomLowerString() {
		return(generatePassword(getRandomPasswordMap()));
	}
	
	public String getRandomUpperLowerString() {
		return(generatePassword(getRandomUpperLowerPasswordMap()));
	}

	private Map<String, String> getRandomPasswordMap() {
		Map<String, String> map = new HashMap<>();
		String[] tmp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < tmp.length; i++){
			map.put(String.valueOf(i), tmp[i]);
		}

		return map;
	}
	
	private Map<String, String> getRandomUpperLowerPasswordMap() {
		Map<String, String> map = new HashMap<>();
		String[] tmp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

		for (int i = 0; i < tmp.length; i++){
			map.put(String.valueOf(i), tmp[i]);
		}

		return map;
	}

	private String generatePassword(Map<String, String> map) {
		String password = "";

		// Check null
		if(map == null) {
			Map<String, String> tmp = getRandomPasswordMap();
			password = getRandomizedString(tmp);
		}
		else {
			password = getRandomizedString(map);
		}

		return password;
	}

	private String getRandomizedString(Map<String, String> map) {
		String tmp = "";
		int nexttmp = 0;
		Random random = new Random();

		// Generate randomized string one by one
		for (int i = 0; i < count; i++) {
			nexttmp = random.nextInt(map.size()); 			// generate randomized integer less than map size
			tmp += map.get(String.valueOf(nexttmp));		// get randomized character from map
		}

		return tmp;
	}
}
