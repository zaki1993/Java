import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private HashMap<Integer, ArrayList<Integer>> vertices;
	
	Graph(){
		
		this.vertices = new HashMap<>();
	}
	
	void addVertex(int number){
		
		if(!vertices.containsKey(number)){
			vertices.put(new Integer(number), new ArrayList<>());
		}
	}
	
	void addEdge(int from, int to){
		
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
	
	void BFS(int start){
		
		if(!vertices.containsKey(start)){
			return;
		}
		
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for(Entry<Integer, ArrayList<Integer>> i : vertices.entrySet()){
			visited.put(i.getKey(), false);
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);

		visited.put(start, true);
		
		while(!queue.isEmpty()){
			Integer top = queue.poll();
			System.out.println(top);
			for(Integer i : vertices.get(top)){
				if(!visited.get(i)){
					visited.put(i, true);
					queue.add(i);
				}
			}
		}	
	}
}
