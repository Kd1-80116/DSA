import java.util.Scanner;

public class Graph {
	private int vertexcount;
	private int edgecount;
	private boolean adjmat[][];
	public Graph(int vcount) {
		vertexcount = vcount;
		adjmat=new boolean[vertexcount][vertexcount];
   }
	public void acceptgraph() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter edge count=");
		int edge=s.nextInt();
		System.out.println("enter edge:(src,des)");
		for(int i=0;i<edgecount;i++) {
			int src=s.nextInt();
			int des=s.nextInt();
			adjmat[src][des]=true;
			adjmat[des][src]=true;
		}
	}
	public void printgraph() {
		System.out.println("graph:");
		for(int i=0;i<vertexcount;i++) {
			for(int j=0;j<vertexcount;j++) {
				System.out.print(adjmat[i][j] ? 1+" ":0+" ");
				
			}
		}
		System.out.println();
		
		
	}
}
	
	
	


