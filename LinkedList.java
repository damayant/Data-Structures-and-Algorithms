//simple java program to find the n'th node from end of linked list
class LinkedList
{
	Node head ; //head of the list

	/*Linked List node */
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/*function to get the n'th node from end */
	void printNthFromLast(int n)
	{
		int len = 0;
		Node temp = head ;

		//1.count the number of nodes in the linked list
		while(temp!=null)
		{
			temp = temp.next;
			len++ ;
		}

		//check if value of n is not more 
		//than the length of the linked list
		if(len<n)
			return ;
		temp = head;

		//2.get the (n-len+1)th node from the beginning
		for(int i=1;i<len-n+1;i++)
			temp =temp.next;
		System.out.println(temp.data);
	}

	/* inserts a new Node at the fromt of the list*/
	public void push(int new_data)
	{
		//allocate the node and put in the data
		Node new_node = new Node(new_data);
		//make next of the new node as head
		new_node.next = head ;
		//move the head to point to the new node
		head = new_node ;
	}

	/*drier progarm to test above methods*/
	public static void main(String[] args)
	{
		LinkedList llist =new LinkedList;
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		llist.printNthFromLast(4);
	}


}