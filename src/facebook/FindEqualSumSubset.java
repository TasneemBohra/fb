package facebook;

import java.util.ArrayList;
import java.util.List;

public class FindEqualSumSubset {
	public static Boolean isSolution(List<Integer> solution, Integer sum) {
		return (sum == 0);
	}
	
	public static List<Integer> construct_candidates(Integer []input, List<Integer> solution, Integer sum) {
		List<Integer> candidates = new ArrayList<Integer>();
		
		for (Integer i=0; i < input.length ; i++) {
			if(!solution.contains(i) && sum >= i) {
				candidates.add(i);
			}
		}
		return candidates;
	}
	
	static void process_solution(Integer []input, List<Integer> solution) {
		for (int i=0; i<input.length; i++) {
			if (!solution.contains(i)) {
				System.out.print(input[i] + " ");
			}
		}
		System.out.println();
		for (Integer i : solution) {
				System.out.print(input[i] + " ");
		}
	}
	static Boolean finished = false;

	static void backtrack(Integer[] input, List<Integer> solution, Integer sum) {
		if ( isSolution(solution, sum) ) {
			finished = true;
			process_solution(input,solution);
		} else {
			List<Integer> candidates = construct_candidates(input, solution, sum);
			for (Integer candidate : candidates) {
				if (!finished) {
					sum -= input[candidate];
					solution.add(candidate);
					backtrack(input,solution,sum);
					solution.remove(candidate);
					sum += input[candidate];	
				}
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Integer[] input = {1,2,5,6,4,8};
		Integer sum = 0;
		for(Integer x : input) {
			sum+=x;
		}
		if (sum%2 != 0) {
			System.out.println("Not possible");
			return;
		} else
		System.out.println("Sum is " + sum + " Trying for " + sum/2 );
		List<Integer> solution = new ArrayList<Integer>();
		backtrack(input,solution, sum/2);
	}
}
