package helloword;

public class arrays {
	public static void main(String[] args) {

		int value = 7;

		int[] values;
		values = new int[3];

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		int[] numbers = { 5, 6, 7 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
		// lista text prima metoda
		/*
		 * String[] words = { "word1", "word2", "word3" };
		 * 
		 * for (int i = 0; i < words.length; i++) { System.out.println(words[i]); }
		 */
		// a doua metoda mai simpla
		String[] words = { "word1", "word2", "word3" };

		for (String word : words) {
			System.out.println(words);
		}
		// Multidimensional arrays
		int[][] grid = { { 4, 6, 77 }, { 2, 3 }, { 1, 2, 3, 4 } };
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);

		String[][] texts = new String[2][3];

		System.out.println(texts[0][1]);

		texts[0][1] = "hello there";

		System.out.println(texts[0][1]);

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
                 System.out.print(grid[row][col] + "\t");
			}
           System.out.println();
		}
	}
}
