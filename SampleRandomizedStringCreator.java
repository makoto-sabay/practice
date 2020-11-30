package samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SampleRandomizedStringCreator {
	public int count = 0;
	
	public SampleRandomizedStringCreator() {
		this.count = 8;
	}
	
	public String getRandomizedString() {
		return(generatePassword(getRandomPasswordMap()));
	}

	private Map<String, String> getRandomPasswordMap() {
		Map<String, String> map = new HashMap<>();
		String[] tmp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

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
			password = returnRandomizedString(tmp);
		}
		else {
			password = returnRandomizedString(map);
		}

		return password;
	}

	private String returnRandomizedString(Map<String, String> map) {
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
