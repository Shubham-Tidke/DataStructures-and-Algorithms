/*
 * Find Intersection of 2 linked lists
 */
class IntersectionNode
{
	static class Node
	{
		int data;
		Node next;
	};
static int Intesection(Node head1, Node head2)
{
	Node temp1 = head1;
	Node temp2 = head2;

	if (temp1 == null || temp2 == null )
		return -1;

	while (temp1 != null && temp2 != null
		&& temp1 != temp2)
	{
		temp1 = temp1.next;
		temp2 = temp2.next;

		if (temp1 == temp2)
			return temp1.data;

		if (temp1 == null )
			temp1 = head2;
		if (temp2 == null )
			temp2 = head1;
	}

	return temp1.data;
}


public static void main(String[] args)
{
	Node newNode;
	Node head1 = new Node();
	head1.data = 4;

	newNode = new Node();
	newNode.data = 1;
	head1.next = newNode;
	
	Node head2 = new Node();
	head2.data = 5;

	newNode = new Node();
	newNode.data = 6;
	head2.next = newNode;

	newNode = new Node();
	newNode.data = 1;
	head2.next.next = newNode;

	newNode = new Node();
	newNode.data = 8;
	head1.next.next = newNode;
	head2.next.next.next = newNode;

	newNode = new Node();
	newNode.data = 4;
	head1.next.next.next = newNode;

	head1.next.next.next.next = null;

	System.out.print(Intesection(head1, head2));
}
}

// This code is contributed by 29AjayKumar
