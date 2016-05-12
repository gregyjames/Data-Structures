
public class Tester {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>(10); 
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		while (!s.isEmpty()) {
	         Integer value = s.pop();
	         System.out.print(value);
	         System.out.print(" ");
	    }
	}

}
