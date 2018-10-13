import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

/**
 * Unoriented graph with no cost on the edges
 */
public class Graph {
	
	private Map<Integer, List<Integer>> vertices;
	
	public Graph(){
		this.vertices = new HashMap<>();
	}
	
	public void addVertex(int number){
		
		if(!vertices.containsKey(number)){
			vertices.put(number, new ArrayList<>());
		}
	}
	
	public void addEdge(int from, int to){
		
		if(!vertices.containsKey(from)){
			addVertex(from);
		}
		if(!vertices.containsKey(to)){
			addVertex(to);
		}
		
		if(!vertices.get(from).contains(to) && !vertices.get(to).contains(from)){
			vertices.get(from).add(to);
			vertices.get(to).add(from);
		}
	}
	
	public void BFS(int start){
		
		if(vertices.containsKey(start)){
			Map<Integer, Boolean> visited = new HashMap<>();
			for(Entry<Integer, List<Integer>> i : vertices.entrySet()){
				visited.put(i.getKey(), false);
			}
			
			Queue<Integer> queue = new LinkedList<>();
			queue.add(start);
	
			visited.put(start, true);
			
			while(!queue.isEmpty()){
				int top = queue.poll();
				System.out.println(top);
				for(int i : vertices.get(top)){
					if(!visited.get(i)){
						visited.put(i, true);
						queue.add(i);
					}
				}
			}	
		}
	}
	
	public void DFS(int start) {
		
		if (vertices.containsKey(start)) {
			Map<Integer, Boolean> visited = new HashMap<>();
			for(Entry<Integer, List<Integer>> i : vertices.entrySet()){
				visited.put(i.getKey(), false);
			}
			
			dfs_do(start, visited, new Stack<Integer>());
		}
	}
	
	private void dfs_do(int start, Map<Integer, Boolean> visited, Stack<Integer> stack) {

		stack.push(start);
		visited.put(start, true);
		while (!stack.isEmpty()) {
			int top = stack.pop();
			System.out.println(top);
			for (int i : vertices.get(top)) {
				if (!visited.get(i)) {
					visited.put(i, true);
					dfs_do(i, visited, stack);
				}
			}
		}
	}
}