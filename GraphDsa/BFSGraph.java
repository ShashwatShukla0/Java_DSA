package GraphDsa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Go to immediate neighbour
//indirect level-order traversal
//implemented using queue
//visited array- 1) print curr 2) vis[curr] = true 3)  curr node add neighbours
//O(V+E)

public class BFSGraph {

    static class Edge{
        int src;
        int dist;

        Edge(int s,int d){
            this.src = s;
            this.dist = d;

        }
    }

        public static void createGraph( ArrayList<Edge> graph[]){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<Edge>();
            }
    
            //adding elements in graph array in arrayList
            graph[0].add(new Edge(0, 2));
    
            graph[1].add(new Edge(1, 2));
            graph[1].add(new Edge(1, 3));
    
            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 1));
            graph[2].add( new Edge(2, 3));
    
            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 2));
        }

    public static void bfs(ArrayList<Edge> graph[],int V,boolean vis[],int start){

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(vis[curr] == false) {
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }

    public static void main(String[] args){

        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                bfs(graph,V,vis,i);
            }
        }

        System.out.println();

    }
    
}
