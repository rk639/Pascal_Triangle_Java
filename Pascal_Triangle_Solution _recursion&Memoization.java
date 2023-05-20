import java.io.*;
import java.util.*;

class PascalTriangle {
  //creating a cache for memoization
  private static Map<String, Integer> memoMap = new HashMap<>();
    
	public static void main (String[] args) {
		int rows = 5; // Number of rows in Pascal's Triangle
        //iterating over each row to build pascal triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calculatePascalValue(i, j) + " ");
            }
            System.out.println();
        }
	}
	
	private static int calculatePascalValue(int row, int col) {
        String key = row + "-" + col;
        //return current value if found in cache else calculate, store in cache and return 
        if (memoMap.containsKey(key)) {
            return memoMap.get(key);
        }
        //edge case condition check
        if (col == 0 || col == row) {
            memoMap.put(key, 1);
            return 1;
        }
        //calculate current position value
        int value = calculatePascalValue(row - 1, col - 1) + calculatePascalValue(row - 1, col);
        memoMap.put(key, value);
        return value;
    }
}