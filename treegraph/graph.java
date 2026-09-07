package treegraph;
import java.lang.reflect.Array;
import java.util.*;
/*class pair{
        int n;
        int weight;
        pair(int node,int weight){
            n=node;
            this.weight=weight;
        }
        public String toString(){
            return "("+n+","+weight+")";
        }
}
class graph{
    Scanner sc=new Scanner(System.in);
    int node;
    int[][] adjmatrix;
    ArrayList<ArrayList<Integer>> adjlist;
    ArrayList<ArrayList<pair>> weightedadjlist;
    graph(int node){
        this.node=node;
        adjmatrix=new int[node][node];
        adjlist=new ArrayList<>();
        weightedadjlist=new ArrayList<>();
        for(int i=0;i<node;i++){
            adjlist.add(new ArrayList<>());
            weightedadjlist.add(new ArrayList<>());
        }
    }
    public void addedgesinmatrix(int[][] edges,boolean isdirected){
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            if(isdirected){
                adjmatrix[u][v]=1;
            }
            else{
                adjmatrix[u][v]=1;
                adjmatrix[v][u]=1;
            }
        }
    }
    public void addweightededges(int[][] edges,boolean isdirected){
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(isdirected){
                adjmatrix[u][v]=w;
            }
            else{
                adjmatrix[u][v]=w;
                adjmatrix[v][u]=w;
            }
        }
    }
    public void addedgesinlist(int[][] edges,boolean isdirected){
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(isdirected){
                adjlist.get(u).add(v);
            }
            else{
                adjlist.get(u).add(v);
                adjlist.get(v).add(u);
            }
        }
    }
    public void addweightededgesinlist(int[][] edges,boolean isdirected){
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            if(isdirected){
                weightedadjlist.get(u).add(new pair(v, w));
            }
            else{
                weightedadjlist.get(u).add(new pair(v, w));
                weightedadjlist.get(v).add(new pair(u, w));
            }
        }
    }

    public void printmatrix(){
        for(int i=0;i<node;i++){
            for(int j=0;j<node;j++){
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printlist(){
        for(int i=0;i<node;i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.print(adjlist.get(i).get(j));
                if(j!=adjlist.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printweightedlist(){
        for(int i=0;i<weightedadjlist.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<weightedadjlist.get(i).size();j++){
                System.out.print(weightedadjlist.get(i).get(j));
                if(j!=weightedadjlist.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public void degreeinundirectedgraph(int[][] edges,int nodes){
        int[] degree=new int[nodes];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            degree[u]++;
            degree[v]++;
        }
        for(int i=0;i<nodes;i++){
             System.out.println("node-> "+i+" degree-> "+degree[i]);
        }
    }
    public void degreeindirectedgraph(int[][] edges,int nodes){
        int[] indegree=new int[node];
        int[] outdegree=new int[node];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            outdegree[u]++;
            indegree[v]++;
        }
        for(int i=0;i<nodes;i++){
             System.out.println("node-> "+i+" indegree-> "+indegree[i]+" outdegree-> "+outdegree[i]);
        }
    }
    public void degreeusingadjmatrixdirected(){
        int z=adjmatrix.length;
        int [] indegree=new int[z];
        int [] outdegree=new int[z];
        for(int i=0;i<z;i++){
            for(int j=0;j<z;j++){
                if(adjmatrix[i][j]==1){
                    outdegree[i]++;
                    indegree[j]++;
                }
            }
        }
        for(int i=0;i<node;i++){
            System.out.println("Node "+i+" -> indegree "+indegree[i]+" -> outdegree "+outdegree[i]);
        }
    }
    public void degreeadjmatrixundirected(){
        int z=adjmatrix.length;
        int [] degree=new int[z];
        for(int i=0;i<z;i++){
            for(int j=0;j<z;j++){
                if(adjmatrix[i][j]==1){
                    degree[i]++;

                }
            }
        }
        for(int i=0;i<node;i++){
            System.out.println("Node "+i+" ->degree "+degree[i]);
        }
    }
    public void degreelistdirected(){
        int [] indegree=new int[node];
        int [] outdegree=new int[node];
        for(int i=0;i<node;i++){
            outdegree[i]=adjlist.get(i).size();
            for(int j:adjlist.get(i)){
                indegree[j]++;
            }
        }
        for(int i=0;i<node;i++){
            System.out.println("Node "+i+" -> indegree "+indegree[i]+" -> outdegree "+outdegree[i]);
        }
    }
    public void degreeadjlistundirected(){
        for(int i=0;i<node;i++){
            int degree=adjlist.get(i).size();
            System.out.println(
            "Node " + i +
            " -> Degree = " + degree
        );
        }
    }

    //dfs ---- if multiple source/multiple component

    public void dfsofgraph(){
        boolean[] visited=new boolean[node];
        ArrayList<Integer> res=new ArrayList<>();

        //dfs ---- if multiple source/multiple component

        /*for(int i=0;i<node;i++){
            if(!visited[i]){
                dfs(i,visited,adjlist,res);
            }
        }*/

        //if source node is given

        /*int source=sc.nextInt();
        dfs(source,visited,adjlist,res);
        System.out.println(res);
    }
    public void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[node]=true;
        res.add(node);
        for(int neighbour: adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,visited,adj,res);
            }
        }
    }

    public void bfs(){
        boolean[] visited=new boolean[node];
        ArrayList<Integer> res=new ArrayList<>();

        //if source node not given 

        //for(int i=0;i<node;i++){
            //if(!visited[i]){
                
                //if source node given

                int sou=sc.nextInt();
                Queue<Integer> q=new LinkedList<>();
                q.offer(sou);
                visited[sou]=true;
                while(!q.isEmpty()){
                    int c=q.poll();
                    res.add(c);
                    for(int neighbour:adjlist.get(c)){
                        
                        if(!visited[neighbour]){
                            visited[neighbour]=true;
                            q.offer(neighbour);
                        }
                    }
                }
            //}
        //}
        System.out.println(res);
    }

    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nb of node");
        int node=sc.nextInt();
        graph g=new graph(node);
        while(true){
        System.out.println("\n========== GRAPH MENU ==========");
        System.out.println("1. Adjacency Matrix - Directed/undirected - Without Weight");
        System.out.println("2. Adjacency Matrix - Directed/undirected - With Weight");
        System.out.println("3. Adjacency List - Directed/undirected - Without Weight");
        System.out.println("4. Adjacency List - Directed/undirected - With Weight");
        System.out.println("5. find degree in undirected graph");
        System.out.println("6. degree in directed graph");
        System.out.println("7. find degree using adj matrix directed");
        System.out.println("8. degree using adj matrix undirected");
        System.out.println("9. degree using directed adj list");
        System.out.println("10. degree using undirected adj list");
        System.out.println("11. dfs ");
        System.out.println("12. bfs");

        System.out.println("15. exit");
        System.out.println("================================");

        System.out.println("enetr choice ");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("enter nb of edges");
                int e=sc.nextInt();
                int [][] edges=new int[e][2];
                System.out.println("enter edges like (u,v)");
                for(int i=0;i<e;i++){
                    edges[i][0]=sc.nextInt();
                    edges[i][1]=sc.nextInt();
                }
                System.out.println("if directed enter true else enter false");
                boolean b=sc.nextBoolean();
                g.addedgesinmatrix(edges,b);
                g.printmatrix();
                break;
            
            case 2:
                System.out.println("enter the nb of edges");
                int ed=sc.nextInt();
                int[][] edg=new int[ed][3];
                System.out.println("enter the edges with weight like (u,v,w)");
                for(int i=0;i<ed;i++){
                    edg[i][0]=sc.nextInt();
                    edg[i][1]=sc.nextInt();
                    edg[i][2]=sc.nextInt();
                }
                System.out.println("if directed enter true else false");
                boolean bb=sc.nextBoolean();
                g.addweightededges(edg,bb);
                g.printmatrix();
                break;

            case 3:
                System.out.println("enter nb of edges");
                int edd=sc.nextInt();
                int [][] eddg=new int[edd][2];
                System.out.println("enter edges like (u,v)");
                for(int i=0;i<edd;i++){
                    eddg[i][0]=sc.nextInt();
                    eddg[i][1]=sc.nextInt();
                }
                System.out.println("if directed enter true else enter false");
                boolean bbb=sc.nextBoolean();
                g.addedgesinlist(eddg, bbb);
                g.printlist();
                break;

            case 4:
                System.out.println("enter the nb of edges");
                int eed=sc.nextInt();
                int[][] eedg=new int[eed][3];
                System.out.println("enter the edges with weight like (u,v,w)");
                for(int i=0;i<eed;i++){
                    eedg[i][0]=sc.nextInt();
                    eedg[i][1]=sc.nextInt();
                    eedg[i][2]=sc.nextInt();
                }
                System.out.println("if directed enter true else false");
                boolean beb=sc.nextBoolean();
                g.addweightededgesinlist(eedg,beb);
                g.printweightedlist();
                break;
            
            case 5:
                System.out.println("enter the nb of edge ");
                int ee=sc.nextInt();
                int[][] eeed=new int[ee][2];
                for(int i=0;i<ee;i++){
                    eeed[i][0]=sc.nextInt();
                    eeed[i][1]=sc.nextInt();
                }
                g.degreeinundirectedgraph(eeed, node);
                break;

            case 6:
                System.out.println("enter the nb of edge ");
                int eee=sc.nextInt();
                int[][] eeeed=new int[eee][2];
                for(int i=0;i<eee;i++){
                    eeeed[i][0]=sc.nextInt();
                    eeeed[i][1]=sc.nextInt();
                }
                g.degreeindirectedgraph(eeeed, node);
                break;

            case 7:
                g.degreeusingadjmatrixdirected();
                break;

            case 8:
                g.degreeadjmatrixundirected();
                break;

            case 9:
                g.degreelistdirected();
                break;

            case 10:
                g.degreeadjlistundirected();
                break;

            case 11:
                //no source node given 
                g.dfsofgraph();
                break;

            case 12:
                g.bfs();
                break;

            case 15:
                return;

            default:
                break;
        }
        }

    }
}
*/

//find center 

class graph{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter the nb of edge ");
        int eg=sc.nextInt();
        int[][] egs=new int[eg][2];
        for(int i=0;i<eg;i++){
            egs[i][0]=sc.nextInt();
            egs[i][1]=sc.nextInt();
        }*/

        // //find center --leet 1791

        //-------brute force -----  0(n)
        /*Map<Integer,Integer> mp=new HashMap<>();
        int l =egs.length;
        for(int[] edge:egs){
            int u=edge[0];
            int v=edge[1];
            mp.put(u,mp.getOrDefault(u,0)+1);
            mp.put(v,mp.getOrDefault(v,0)+1);
            if(mp.get(u)==l){
                System.out.println("the center "+u);
                break;
            }
            if(mp.get(v)==l){
                System.out.println("the center "+v);
                break;
            }
        }*/
        //-----optimised-------   0(1)
        /*int[] edge1=egs[0];
        int[] edge2=egs[1];
        if(edge1[0]==edge2[1] || edge1[0]==edge2[1]){
            System.out.println("star is "+edge1[0]);
        }
        else{
            System.out.println("star is "+edge1[1]);
        }*/

        //max total imp of roads --leet 2285

        /*System.out.println("enter the nb of city");
        int c=sc.nextInt();
        int [] cities=new int[c];
        for(int[] edge:egs){
            cities[edge[0]]++;
            cities[edge[1]]++;
        }
        Arrays.sort(cities);
        int maximp=0;
        for(int i=0;i<c;i++){
            maximp=maximp+((i+1)*cities[i]);
        }
        System.out.println(maximp);*/

        //flood fill-leet -733

        System.out.println("enter the row of image");
        int r=sc.nextInt();
        System.out.println("enter the col of image");
        int c=sc.nextInt();
        int[][] img=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                img[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the starting coordinate");
        int sr=sc.nextInt();
        int src=sc.nextInt();
        System.out.println("enter the colo to filled");
        int colo=sc.nextInt();
        floodfilldfs(sr,src,colo,img[sr][src],image);
        for(int i=0;i<sr;i++){
            for(int j=0;j<src;j++){
                
            }
        }

    }
    void floodfilldfs()
}

