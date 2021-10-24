package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchPath {
	public static boolean pathExists(int n, int[][] edges, int start, int end) {
		List<List<Integer>> adjacencyList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; ++i) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            
            if (currNode == end) return true;
            
            for (int neighbour : adjacencyList.get(currNode)) {
                if (visited[neighbour]) continue;
                visited[neighbour] = true;
                queue.add(neighbour);
            }
        }
        
        return false;
	}
}
