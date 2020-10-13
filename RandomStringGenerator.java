package generator;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;

public class RandomStringGenerator {
	// default
	public int count = 8;							// word count (default)
	public boolean lower = true;			// true : Available on the RandomGenerator (default)
	public boolean upper = false;
	public boolean num = false;
	public boolean smbl = false;


	public RandomStringGenerator() {
		lower = true;
		upper = false;
		num = false;
		smbl = false;
	}

	public RandomStringGenerator(boolean l) {
		lower = l;
		upper = false;
		num = false;
		smbl = false;
	}

	public RandomStringGenerator(boolean l, boolean u) {
		lower = l;
		upper = u;
		num = false;
		smbl = false;
	}

	public RandomStringGenerator(boolean l, boolean u, boolean n) {
		lower = l;
		upper = u;
		num = n;
		smbl = false;
	}

	public RandomStringGenerator(boolean l, boolean u, boolean n, boolean s) {
		lower = l;
		upper = u;
		num = n;
		smbl = s;
	}

	/**
	 * Return Randomized Text
	 *
	 * @return Randomized Password
	 */
	public String getPassword() {
		// set conditions
		setCondition();

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 *
	 * i : Number of word
	 *
	 * @return Randomized Password
	 */
	public String getPassword(int i) {
		// set conditions
		setCondition(i);

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 *
	 * l : lowercase
	 * u : uppsercase
	 *
	 * @return Randomized Password
	 */
	public String getPassword(boolean l, boolean u) {
		// set conditions
		setCondition(l, u);

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}


	/**
	 * Return Randomized Text
	 *
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 *
	 * @return Randomized Password
	 */
	public String getPassword(boolean l, boolean u, boolean n) {
		// set conditions
		setCondition(l, u, n);

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}


	/**
	 * Return Randomized Text
	 *
	 * i : Number of word
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 *
	 * @return Randomized Password
	 */
	public String getPassword(int i, boolean l, boolean u, boolean n) {
		// set conditions
		setCondition(i, l, u, n);

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 *
	 * i : Number of word
	 * l : lowercase
	 * u : uppsercase
	 *
	 * @return Randomized Password
	 */
	public String getPassword(int i, boolean l, boolean u) {
		// set conditions
		setCondition(i, l, u, false, false);

		// create random password
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 *
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 * s : symbols
	 *
	 * @return Randomized Password
	 */
	public String getPassword(boolean l, boolean u, boolean n, boolean s) {
		// set conditions
		setCondition(l, u, n, s);

		// create randomize charactors
		String password = createRandomPassword();

		// return password
		return password;
	}


	/**
	 * Return Randomized Text
	 *
	 * i : Number of word
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 * s : symbols
	 *
	 * @return Randomized Password
	 */
	public String getPassword(int i, boolean l, boolean u, boolean n, boolean s) {
		// set conditions
		setCondition(i, l, u, n, s);

		// create randomize charactors
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 * 	For Web Application
	 *
	 * i : Number of word
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 * s : symbols
	 *
	 * @return Randomized Password
	 */
	public String getPassword(String  i,boolean l, boolean u, boolean n, boolean s) {
		// set conditions
		setCondition(i, l, u, n, s);

		// create randomize charactors
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Return Randomized Text
	 * 	For Web Application
	 *
	 * i : Number of word
	 * l : lowercase
	 * u : uppsercase
	 * n : numbers
	 * s : symbols
	 *
	 * @return Randomized Password
	 */
	public String getPassword(String  i, String l, String u, String n, String s) {
		// set conditions
		setCondition(i, l, u, n, s);

		// create randomize charactors
		String password = createRandomPassword();

		// return password
		return password;
	}

	/**
	 * Set Condition
	 */
	private void setCondition() {
		lower = true;
		upper = false;
		num = false;
		smbl = false;
		count = 8;
	}

	/**
	 * Set Condition
	 *
	 * @param i (Word Count)
	 */
	private void setCondition(int i) {
		lower = true;
		upper = false;
		num = false;
		smbl = false;
		setCount(i);
	}

	/**
	 * Set Condition
	 *
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 */
	private void setCondition(boolean l, boolean u) {
		lower = l;
		upper = u;
		num = false;
		smbl = false;
		count = 8;
	}

	/**
	 * Set Condition
	 *
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 */
	private void setCondition(boolean l, boolean u, boolean n) {
		lower = l;
		upper = u;
		num = n;
		smbl = false;
		count = 8;
	}

	/**
	 * Set Condition
	 *
	 * @param i (Word Count)
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 */
	private void setCondition(int i, boolean l, boolean u, boolean n) {
		lower = l;
		upper = u;
		num = n;
		smbl = false;
		setCount(i);
	}

	/**
	 * Set Conditions
	 *
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 * @param s (Symbols)
	 */
	private void setCondition(boolean l, boolean u, boolean n, boolean s) {
		lower = l;
		upper = u;
		num = n;
		smbl = s;
		count = 8;
	}

	/**
	 * Set Conditions
	 *
	 * @param i (Word Count)
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 * @param s (Symbols)
	 */
	private void setCondition(int i, boolean l, boolean u, boolean n, boolean s) {
		lower = l;
		upper = u;
		num = n;
		smbl = s;
		setCount(i);
	}


	/**
	 * Set Conditions
	 * For Web Application
	 *
	 * @param i (Word Count)
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 * @param s (Symbols)
	 */
	private void setCondition(String i, boolean l, boolean u, boolean n, boolean s) {
		lower = l;
		upper = u;
		num = n;
		smbl = s;
		setCount(convertStringToInt(i));
	}


	/**
	 * Set Conditions
	 * For Web Application
	 *
	 * @param i (Word Count)
	 * @param l (Lowercase)
	 * @param u (Uppercase)
	 * @param n (Number)
	 * @param s (Symbols)
	 */
	private void setCondition(String i, String l, String u, String n, String s) {
		lower = convertStringToBoolean(l);
		upper = convertStringToBoolean(u);
		num = convertStringToBoolean(n);
		smbl = convertStringToBoolean(s);
		setCount(convertStringToInt(i));
	}

	/**
	 *  Convert from String to Boolean
	 *
	 * @param tmp
	 * @return
	 */
	private boolean convertStringToBoolean(String tmp) {
		boolean flag = false;
		return flag;
	}

	/**
	 * Convert from String to Int
	 *
	 * @param tmp
	 * @return
	 */
	private int convertStringToInt(String tmp) {
		int i = 8;
		i = Integer.valueOf(tmp).intValue();
		return i;
	}


	/**
	 * Word Count
	 * The number of password characters is more than three and less than one hundred twenty-eight.
	 *
	 * @param word count
	 */
	private void setCount(int i) {
		if(i >= 3 && i <= 128) {
			count = i;
		}
		else {
			count = 8;
		}
	}


	/**
	 * Crate Random Password
	 *
	 * @return
	 */
	private String createRandomPassword() {
		String password = "";

		// Create Map for Randomized Password
		Map<String, String> map = createRandomStringMap();

		// Randomize
		password = generatePassword(map);

		// Clear Map
		map.clear();

		return password;
	}


	/**
	 * Create Random String Map
	 *
	 * @return
	 */
	private Map<String, String> createRandomStringMap() {
		Map<String, String> map = new HashMap<String, String>();
		int pattern = 0;
		String[] array;

		// Get Random Password Pattern
		pattern = getRandomPasswordPattern();

		// Create String Array
		array = createStringArray(pattern);

		// Get Map for Random Password
		map = getRandomPasswordMap(array);

		return map;
	}


	/**
	 * Get Raodom Password Pattern
	 *
	 * @return
	 */
	private int getRandomPasswordPattern() {
		int i =0;

		if (lower == false && upper == false && num == false && smbl == false) {
			i = 0;
		}
		else if (lower == true  && upper == false && num == false && smbl == false) {
			i = 1;
		}
		else if (lower == true  && upper == true  && num == false && smbl == false) {
			i = 2;
		}
		else if (lower == true  && upper == false && num == true  && smbl == false ) {
			i = 3;
		}
		else if (lower == true  && upper == false && num == false  && smbl == true ) {
			i = 4;
		}
		else if (lower == true  && upper == true  && num == true  && smbl == false) {
			i = 5;
		}
		else if (lower == true  && upper == true  && num == false  && smbl == true) {
			i = 6;
		}
		else if (lower == true  && upper == false && num == true  && smbl == true ) {
			i = 7;
		}
		else if (lower == true  && upper == true  && num == true  && smbl == true) {
			i = 8;
		}
		else if (lower == false && upper == true  && num == false && smbl == false) {
			i = 9;
		}
		else if (lower == false && upper == true  && num == true  && smbl == false) {
			i = 10;
		}
		else if (lower == false && upper == true  && num == false  && smbl == true) {
			i = 11;
		}
		else if (lower == false && upper == true  && num == true  && smbl == true) {
			i = 12;
		}
		else if (lower == false && upper == false && num == true  && smbl == false) {
			i = 13;
		}
		else if (lower == false && upper == false && num == true  && smbl == true ) {
			i = 14;
		}
		else if (lower == false && upper == false  && num == false  && smbl == true) {
			i = 15;
		}
		else  {
			i = 0;
		}

		return i;
	}

	/**
	 * Create String Array
	 *
	 * @param pattern
	 * @return array
	 */
	private String[] createStringArray(int pattern) {
		String[] smallchara = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] largechara = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] symbols = {"#", "$", "%", "&"};

		String[] array;

		if (pattern == 0) {
			array = smallchara;
		}
		else if (pattern == 1) {
			array = smallchara;
		}
		else if (pattern == 2) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
			array = tmp;
		}
		else if (pattern == 3) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			array = tmp;
		}
		else if (pattern == 4) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 5) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			array = tmp;
		}
		else if (pattern == 6) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 7) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 8) {
			String [] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 9) {
			array = largechara;
		}
		else if (pattern == 10) {
			String [] tmp =  {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			array = tmp;
		}
		else if (pattern == 11) {
			String [] tmp =  {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 12) {
			String [] tmp =  {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "I", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 13) {
			array = numbers;
		}
		else if (pattern == 14) {
			String [] tmp =  {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "#", "$", "%", "&"};
			array = tmp;
		}
		else if (pattern == 15) {
			array = symbols;
		}
		else {
			array = smallchara;
		}

		return array;
	}

	/**
	 * Get Map for Random Password
	 *
	 * @param array
	 * @return map
	 */
	private Map<String, String> getRandomPasswordMap(String[] array) {
		Map<String, String> map = new HashMap<>();

		if(array == null) {
			String[] tmp =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			array = tmp;
		}

		for (int i = 0; i < array.length; i++){
			  map.put(String.valueOf(i), array[i]);
		}

		return map;
	}

	/**
	 * Get Map for Randomized Password
	 *
	 * @return
	 */
	private Map<String, String> getRandomPasswordMap() {
		Map<String, String> map = new HashMap<>();
		String[] tmp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for (int i = 0; i < tmp.length; i++){
			map.put(String.valueOf(i), tmp[i]);
		}

		return map;
	}

	/**
	 * Generate Password
	 *
	 * @param map
	 * @return password
	 */
	private String generatePassword(Map<String, String> map) {
		String password = "";

		// Check null
		if(map == null) {
			Map<String, String> tmp = getRandomPasswordMap();
			password = getRandomString(tmp);
		}
		else {
			password = getRandomString(map);
		}

		return password;
	}

	/**
	 * Get Randomized String
	 *
	 * @param map
	 * @return Randmized String
	 */
	private String getRandomString(Map<String, String> map) {
		String tmp = "";
		int nexttmp = 0;
		Random random = new Random();

		// Generate randomized string one by one
		for (int i = 0; i < count; i++) {
			nexttmp = random.nextInt(map.size()); 				// generate randomized integer less than map size
			tmp += map.get(String.valueOf(nexttmp));		// get randomized character from map
		}

		return tmp;
	}


}
