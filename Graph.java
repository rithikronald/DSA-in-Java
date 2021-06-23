import java.util.*;

public class Graph {

    LinkedList<Integer> adj[];

    int V;

    void addEdge(int a, int c) {
        adj[a].add(c);
    }

    Graph(int n) {
        V = n;
        adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList();
        }
    }

    void dfsUtil(int start, boolean visited[]) {
        visited[start] = true;
        System.out.print(start + " ");
        Iterator<Integer> i = adj[start].listIterator();

        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    void dfs(int start) {
        boolean visited[] = new boolean[V];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(1, 0);
        graph.addEdge(1, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);

        for (int i = 0; i < 5; i++) {
            System.out.println("Vertex" + " " + i + " " + "Edge" + graph.adj[i]);
        }

        graph.dfs(2);
    }
}
