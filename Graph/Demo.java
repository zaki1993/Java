
public class Demo {
	public static void main(String[] args) {
		Graph x = new Graph();
		for (int i = 0; i < 10; i++) {
			x.addVertex(i);
		}
		x.addEdge(1, 2);
		x.addEdge(3, 2);
		x.addEdge(2, 4);
		x.addEdge(3, 5);
		x.addEdge(4, 5);
		
		System.out.println("BFS: ");
		x.BFS(3);
		
		System.out.println("DFS: ");
		x.DFS(3);
		
		System.out.println("DLS: ");
		x.DLS(3, 2);
	}
}
