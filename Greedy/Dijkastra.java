import java.util.Arrays;
/*
 * Given a graph and a source vertex in the graph, find shortest paths from source to all vertices in the given graph.
 */
public class Dijkastra {
	public static void main(String[] args) {
		int graph[][] = {
						{ 0, 4, 0, 0, 0, 0, 0, 8,  0 },
		                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
		                { 0, 8, 0, 7, 0, 4, 0,  0, 2 },
		                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
		                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
		                { 0, 0, 4, 14,10, 0, 2, 0, 0 },
		                { 0, 0, 0, 0, 0,  2, 0, 1, 6 },
		                { 8, 11,0, 0, 0,  0, 1, 0, 7 },
		                { 0, 0, 2, 0, 0,  0, 6, 7, 0 }
		                };
		getShortestPath(graph,0);//graph and staring source
	}
	private static void getShortestPath(int[][] graph, int source) {
		int distance[] = new int[graph.length]; //solution array
		Arrays.fill(distance, Integer.MAX_VALUE); //shortest distance is maximum at beginning
		Boolean visited[] = new Boolean[graph.length]; //to check if vertex is visited
		Arrays.fill(visited, false);//no vertex is visited at start
		distance[source] = 0 ;//distance of source is zero
		int[]shortestPath = new int[graph.length];//to store path in parent-child relation
		shortestPath[source] = -1;//source has no parent
		for (int i = 0; i < graph.length-1; i++) {
			//get the vertex which is not visited and has minimum distance
			int u = getMinDistance(distance,visited);
			visited[u] = true; //mark the vertex visited
			
			//update the shortest path for all the linked verticesfrom selected vertex
			for (int v = 0; v < visited.length; v++) {
				//update the shortest path if
				//1.vertex is not visited 2.linked to selected vertex 3.don't have infinite distance 4.have less dist.link available
				if(!visited[v] && graph[u][v]!=0 && distance[u]!=Integer.MAX_VALUE && distance[u]+graph[u][v] < distance[v]) {
					distance[v] = distance[u]+graph[u][v];
					shortestPath[v] = u;
				}
			}
		}	
		print(distance,shortestPath);
	}
	private static void print(int[] distance, int[] shortestPath) {
		System.out.println("Shortest path");
		for (int i = 0; i < shortestPath.length; i++) {
			System.out.println(shortestPath[i]+" -> "+i);
		}
		
		System.out.println("vertex - dist. from source");
		for (int i = 0; i < distance.length; i++) {
			System.out.println(i+" - "+distance[i]);
		}
	}
	private static int getMinDistance(int[] distance, Boolean[] visited) {
		int index = -1;
		int min = Integer.MAX_VALUE;
		//get the vertex which is not visited and have minimum distance path
		for (int i = 0; i < visited.length; i++) {
			if(visited[i] == false && distance[i]<min)
				{
					min = distance[i];
					index = i;
				}
		}
		return index;
	}
}