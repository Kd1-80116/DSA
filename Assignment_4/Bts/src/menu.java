import java.util.Scanner;

public class menu {

	private static int vcount;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.println("enter vertex count");
        int vertexcount=s.nextInt();
        Graph g=new Graph(vcount);
        g.acceptgraph();
        g.printgraph();
	}

}
