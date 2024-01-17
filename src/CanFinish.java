import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CanFinish {
    public static void main(String args[]) {
        int numCourses = 2;
        int prerequisites[][] = new int[][]{{0,1}};

        System.out.println(canFinish(numCourses, prerequisites));
    }

    private static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0 || prerequisites == null || prerequisites.length == 0) return true;

        // prepare the adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        // create the graph data
        for(int i=0 ; i<prerequisites.length ; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int visited[] = new int[numCourses];

        // dfs visit each course
        for(int i=0 ; i<numCourses ; i++) {
            if(!dfs(adj, i, visited))
                return false;
        }

        return true;
    }

    private static boolean dfs(List<List<Integer>> adj, int i, int[] visited) {
        visited[i] = 1;

        List<Integer> clist = adj.get(i);

        for(int k=0 ; k<clist.size() ; k++) {
            int eligibleCourse = clist.get(k).intValue();
            if(visited[eligibleCourse] == 1) return false;
            if(visited[eligibleCourse] == 0) {
                if(!dfs(adj, eligibleCourse, visited)) return false;
            }
        }

        visited[i] = 2;
        return true;
    }


}
