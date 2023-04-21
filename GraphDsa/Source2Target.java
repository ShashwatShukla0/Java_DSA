package GraphDsa;
//O(V+E)
//in bfs we use queue, in DFS we use Stack, to visit the 1st neighbour

import java.util.ArrayList;

public class Source2Target {

    static class Edge{
        int src;
        int dist;

        Edge(int s, int d){
            this.src = s;
            this.dist = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

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

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.println(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dist] == false){
                dfs(graph, e.dist, vis);
            }
        }
    }

    public static void printAllpath(ArrayList<Edge> graph[], boolean vis[], int curr,String path, int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dist]){
                vis[curr] = true;
                printAllpath(graph,vis,e.dist,path+e.dist,tar);
                vis[curr] = false;
            }
        }


    }


    public static void main(String[] args){

        int V = 4;
        ArrayList<Edge> l1[] = new ArrayList[V];
        createGraph(l1);

        boolean vis[] = new boolean[V];
        dfs(l1, 0, vis);
        System.out.println();

        int src=0, dist=1;

        printAllpath(l1, vis, src, null, dist);


    }
    
}
