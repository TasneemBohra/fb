package facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ShortestPathAlgo {
	class FlightRoute {
		String to;
		String from;
		int time;
		int distance = 0;
	}

		
	public static void main(String[] args) {
		ArrayList<FlightRoute> routes = new ArrayList<>();
		// Base case 
		if (routes == null || routes.size() == 0) {
			System.out.println("No Path Exisit");
			return;
		}
	}
	
	private static int getPath(String source, String destination, ArrayList<FlightRoute> routs) {
		int nodes = routs.size();
		HashMap<String, Integer> distance = new HashMap<>();
		for (int i = 0 ; i < nodes;  i ++) distance.put(routs.get(i).from, Integer.MAX_VALUE);
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		
		distance.put(source, 0);
		queue.add(source);
		
		while (!queue.isEmpty()) {
			
		}
		
		
		//int distance[] = new int[nodes + 1];
		
		//
		
		return 0;
	}
	
	
	
}
