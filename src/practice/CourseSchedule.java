package practice;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        
        for (int i = 0; i < numCourses; ++i) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            adjacencyList.get(prerequisite[0]).add(prerequisite[1]);
        }
        
        boolean[] visited = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; ++i) {
            if (!canBeCompleted(i, adjacencyList, visited)) return false;
        }
        
        return true;
    }
    
    private boolean canBeCompleted(int i, List<List<Integer>> list, boolean[] visited) {
        if (visited[i]) return false;
        
        if (list.get(i).isEmpty()) return true;
     
        visited[i] = true;
        
        for (int course : list.get(i)) {
            if (!canBeCompleted(course, list, visited)) return false;
        }
        
        visited[i] = false;
        list.get(i).clear();
        
        return true;
    }
}
