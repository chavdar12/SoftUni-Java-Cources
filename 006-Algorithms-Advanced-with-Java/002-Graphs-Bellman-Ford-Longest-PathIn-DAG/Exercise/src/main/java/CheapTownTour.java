import java.util.*;
import java.util.stream.Collectors;

public class CheapTownTour {

    public static Map<Integer, List<Edge>> graph = new LinkedHashMap<>();

    public static class Edge implements Comparable<Edge> {
        public int from;
        public int to;
        public int weight;

        public Edge(int from, int to, int weight) {

            this.from = from;
            this.to = to;
            this.weight = weight;
        }


        @Override
        public int compareTo(Edge other) {

            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nodes = Integer.parseInt(sc.nextLine());
        int edgeCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < edgeCount; i++) {

            String[] tokens = sc.nextLine().split(" - ");

            int from = Integer.parseInt(tokens[0]);
            int to = Integer.parseInt(tokens[1]);
            int weight = Integer.parseInt(tokens[2]);

            Edge edge = new Edge(from, to, weight);

            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(edge);
        }

        sc.close();

        int[] parents = new int[nodes];

        Arrays.fill(parents, -1);

        PriorityQueue<Edge> edges = graph.values().stream().flatMap(List::stream)
                .collect(Collectors.toCollection(PriorityQueue::new));

        int forestWeight = 0;

        for (int i = 0; i < nodes; i++) {
            parents[i] = i;
        }

        while (!edges.isEmpty()) {

            Edge minEdge = edges.poll();

            int firstRoot = findRoot(minEdge.from, parents);
            int secondRoot = findRoot(minEdge.to, parents);

            if (firstRoot != secondRoot) {

                forestWeight += minEdge.weight;
                parents[secondRoot] = firstRoot;

                for (int i = 0; i < parents.length; i++) {

                    if (parents[i] == secondRoot) {

                        parents[i] = firstRoot;
                    }
                }
            }
        }

        System.out.println("Total cost: " + forestWeight);
    }

    private static int findRoot(int node, int[] parents) {

        int root = parents[node];

        while (parents[node] != root) {

            root = parents[root];
        }

        return root;
    }
}