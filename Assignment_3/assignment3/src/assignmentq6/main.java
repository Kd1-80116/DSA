package assignmentq6;

import java.util.Stack;

public class main {
	public static void main(String[] args)
	{
		Stack st=new Stack(10);
		
		st.push(20);
		st.push(50);
		st.push(30);
        st.push(10);	
        st.push(40);
        st.display();
      
	    int max = st.peek();
	    while (!st.isEmpty()) {
	        int val = (int) st.pop();
	        if (val > max) {
	            max = val;
	            st.push(max);
	        }
	    }
	    System.out.println("max ele=" + max);

	}
}



