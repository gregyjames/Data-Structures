import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Tuple<Integer, Integer>> e = new ArrayList<Tuple<Integer, Integer>>();
		
		for(int i = 0; i < 500; i++){
			e.add(new Tuple<Integer, Integer>(i,i));
			System.out.println(e.get(i).first + "," + e.get(i).second);
		}
		
	}

}
