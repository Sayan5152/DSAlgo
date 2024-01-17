import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearchGraph {
    public static void main(String args[]) {
        Graph graph = new Graph(6);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(5,2);
        graph.addEdge(2,1);
        graph.addEdge(3,1);
        graph.addEdge(2,4);
        graph.addEdge(4,2);
        graph.addEdge(4,3);
        graph.addEdge(2,5);
        
        DFS(1, graph);
    }
    private static void DFS(int start, Graph graph) {
        boolean visited[] = new boolean[6];
        
        DFSUtil(start, graph, visited);
    }

    private static void DFSUtil(int start, Graph graph, boolean[] visited) {
        // set visited vertex to true
        visited[start] = true;
        // vertex is already visited... print it out and set it to true in array
        System.out.print(start + " ");

        // fetch the linked list from the adjacency List by index start
        Iterator<Integer> iter = graph.adj[start].iterator();
        // if we have adjacent vertices...
        while (iter.hasNext()) {
            int n = iter.next();
            // if the adjacent vertex is not already visited...
            if(!visited[n]) {
                // recursively call method to visit that vertex and repeat the process
                DFSUtil(n, graph, visited);
            }
        }
    }
}

class Graph {
    // V = number of vertices
     int V;
     // adj = adjacency list to define edges
    LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        // for every vertex we need new linked list
        adj = new LinkedList[v];
        for(int i=0 ; i<v ; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int m, int n) {
        // adding new element to list for vertex passed...
        // therefore for every vertex we will have list of vertices where we can travel
        adj[m].add(n);
    }
}
