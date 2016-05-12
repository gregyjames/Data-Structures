public class List<T> {
	Node<T> root;
	
	public List(T val){
		root = new Node<T>(val);
	}
	
	public void Add(Node<T> head, T value){
		if(head.next != null){
			Add(head.next, value);
		}
		else{
			head.next = new Node<T>(value);
		}
	}
	
	public void Traverse(Node<T> head){
		System.out.print(head.value + ",");
		if(head.next != null){
			Traverse(head.next);
		}
	}
}
