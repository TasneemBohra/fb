package facebook;

public class ReverseLinkedList {
	class Node {
		char c;
		Node next;
	}
	
	private static Node createLinkedList(ReverseLinkedList obj) {
		Node head = obj.new Node();
		head.c = 'A';
		Node prevNode = head;
		for (int i = 1 ; i < 5; i ++) {
			Node newNode = obj.new Node();
			newNode.c = (char) (i + 'A');
			prevNode.next = newNode;
			prevNode = newNode;
		}
		print(head);
		return head;
	}
	
	private static void print(Node head) {
		Node node = head;
		while (node != null) {
			System.out.print(node.c + " -> ");
			node = node.next;
		}
	}
	
	private static Node findLast(Node head) {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		System.out.println("Last Node : "+node.c);
		return node; 
	}
	
	private static Node reverse(Node head, Node lastNode, ReverseLinkedList obj) {
		if (lastNode == head || lastNode == null) return head;
		Node newNode = obj.new Node();
		newNode.c = head.c;
		lastNode.next = newNode;
		lastNode = newNode;
		System.out.println();
		print(head);
		return reverse(head.next, lastNode, obj);
	}
	
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		Node head = createLinkedList(obj);
		head = reverse(head, findLast(head), obj);
		System.out.println();
		print(head);
	}
}
