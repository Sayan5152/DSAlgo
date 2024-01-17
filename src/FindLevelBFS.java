import java.util.*;

public class FindLevelBFS {
    public static void main(String args[]) {
        int V = 5;
        int X = 3;
        int[][] edges = new int[][] {{0,1}, {0,2} , {1,3} , {2,4}};

        int level = findLevel(V,X,edges);
        System.out.println(level);

    }

    private static int findLevel(int v, int x, int[][] edges) {
        int level = -1;

        // find max level
        int maxLevel = 0;
        for(int[] edge : edges) {
            maxLevel = Math.max(maxLevel, Math.max(edge[0], edge[1]));
        }

        // create adjacency list
        List<Integer> adj[] = new ArrayList[maxLevel+1];

        // initialise adjacency list
        for(int i=0 ; i<=maxLevel ; i++) {
            adj[i] = new ArrayList<>();
        }

        // instantiate the lists
        for(int i=0 ; i<edges.length ; i++) {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }

        if(x > maxLevel || adj[x].size() == 0) {
            return level;
        }
        // create the queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        boolean[] visited = new boolean[maxLevel+1];
        visited[0] = true;
        level = 0;
        while(!queue.isEmpty()) {
            int sz = queue.size();
            while (sz-- > 0) {
                int current = queue.poll();

                if(current == x) {
                    return level;
                }
//                Iterator<Integer> iter = adj[current].listIterator();
                for (int it : adj[current]) {
                    if (!visited[it]) {
                        queue.offer(it);
                        visited[it] = true;
                    }
                }
            }
            level++;
        }

//        while (!queue.isEmpty()) {
//            int sz = queue.size();
//            while (sz-- > 0) {
//                int currentNode = queue.poll();
//
//                if (currentNode == x)
//                    return level;
//
//                for (int it : adj[currentNode]) {
//                    if (!visited[it]) {
//                        queue.offer(it);
//                        visited[it] = true;
//                    }
//                }
//            }
//            level++;
//        }

        return level;
    }
}
