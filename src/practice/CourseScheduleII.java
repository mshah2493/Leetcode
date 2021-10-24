package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CourseScheduleII {
	int index = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         HashSet<Integer> completed = new HashSet<>();
         int[] result = new int[numCourses];
         List<List<Integer>> adjacencyList = new ArrayList<>();
        
        for (int i = 0; i < numCourses; ++i) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            adjacencyList.get(prerequisite[0]).add(prerequisite[1]);
        }
        
        boolean[] visited = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; ++i) {
            if (!canBeCompleted(i, adjacencyList, visited, result, completed)) return new int[0];
        }
        
        return result;
    }
    
     private boolean canBeCompleted(int i, List<List<Integer>> list, boolean[] visited, int[] result, HashSet<Integer> completed) {
        if (visited[i]) return false;
        
        if (list.get(i).isEmpty()) {
            if (!completed.contains(i)) {
                completed.add(i);
                result[index++] = i;
            }
            
            return true;
        }
     
        visited[i] = true;
        
        for (int course : list.get(i)) {
            if (!canBeCompleted(course, list, visited, result, completed)) return false;
            if (!completed.contains(course)) {
                completed.add(course);
                result[index++] = course;
            }
        }
        
        visited[i] = false;
        list.get(i).clear();
         
         if (!completed.contains(i)) {
                completed.add(i);
                result[index++] = i;
            }
        
        return true;
    }
}
