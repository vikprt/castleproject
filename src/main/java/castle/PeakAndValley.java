package castle;

import java.util.*;
import java.util.Map.Entry;
/*
 * @Project Code Challenge
 * @Author 	Vikas Grover
 * This class calculates Peak & Valley based on Integer Array Provided
 */
public class PeakAndValley {
	private int peak;
	private int valley;
	private Map<Integer, Integer> castles; 
	private static final int VALUERESET = -1;
	
	public PeakAndValley() {
		castles = new HashMap<>();
	}

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
		new PeakAndValley().solution(values);
	}

	public int solution(int[] data) {
		int i = 1;
		for (; i < data.length; i++) {
			calc(i, i-1, data);
		}
		if (data[i-2] != data[i-1]) {
			castles.put(i-1, data[i-1]);
		} else if ((data[i-2] == data[i-1]) && (valley == peak)) {
			castles.put(i-1, data[i-1]);
		}
		print();
		return castles.size();
	}

	private void calc(int currIndex, int prevIndex, int[] data) {
		if (data[prevIndex] < data[currIndex]) {
			if (valley != VALUERESET) {
				valley = VALUERESET;				
				peak = data[currIndex];
				castles.put(prevIndex, data[prevIndex]);
			}
		} else if (data[prevIndex] == data[currIndex]) {
			if (valley != VALUERESET) {
				valley = data[currIndex];
			}
			if (peak != VALUERESET) {
				peak = data[currIndex];
			}
		} else if (data[prevIndex] > data[currIndex]) {
			if (peak != VALUERESET) {
				peak = VALUERESET;				
				valley = data[currIndex];
				castles.put(prevIndex, data[prevIndex]);
			}
		}
	}
	
	public void print() {
		System.out.print("Build Castle for values");
		for (Entry<Integer, Integer> e : castles.entrySet()) {
			System.out.print(" | " + e.getValue());
		}
		System.out.println(" |");
		System.out.println("No of Castles           | " + castles.size() + " |\n");
	}	
}