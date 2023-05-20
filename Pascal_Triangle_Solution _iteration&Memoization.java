import java.io.*;
import java.util.*;

class PascalTriangle {
  private static Map<String, Integer> memoMap = new HashMap<>();
    
	public static void main (String[] args) {
		int rows = 5; // Number of rows in Pascal's Triangle
        iterating over row and col to calculate value
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calculatePascalValue(i, j) + " ");
            }
            System.out.println();
        }
	}
	
	private static int calculatePascalValue(int row, int col) {
        String key = row + "-" + col;
        if (col == 0 || col == row) {
            memoMap.put(key, 1);
            return 1;
        }
        
        int val;
        if(memoMap.containsKey(key)){
            val = memoMap.get(key);
        }
        else{
            val = memoMap.get((row - 1) + "-" + (col - 1)) + memoMap.get((row - 1) + "-" + col);
            memo.put(key, val);
        }

        return val;
    }