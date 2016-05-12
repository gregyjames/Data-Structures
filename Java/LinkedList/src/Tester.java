public class Tester {
	public static void main(String[] args) {
		List<Integer> l = new List<Integer>(1);
		for(int i = 2; i < 20; i++)
			l.Add(l.root, i);
		l.Traverse(l.root);
	}

}
