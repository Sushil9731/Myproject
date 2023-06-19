
public class LinkedList_Menu {

	Node head;

	public LinkedList_Menu()
	{
		head=null;
	}

	public void modify(int data,int newdata)
	{
		boolean found = false;
		Node move = head;
		while(move!=null)
		{
			if(move.data==data)
			{
				found = true;
				move.data=newdata;
				break;
			}

			move=move.next;

		}
		if(found==false)
			System.out.println("Data not present in List");

	}
	public void addBeg(int data)
	{
		Node record = new Node(data);
		if(head==null)
		{
			head=record;
			return;
		}
		record.next = head;
		head = record;

	}
	public void addEnd(int data)
	{
		Node record = new Node(data);
		if(head==null)
		{
			head = record;
			return;
		}
		Node move = head;
		while(move.next!=null)
		{	
			move=move.next;
			move.next=record;
		}
	}

	public void addmid(int position,int data)
	{
		Node record = new Node(data);
		if(head==null)
		{
			head = record;
			return;
		}
		if(position==1)
		{
			record.next=head;
			head=record;
		}
		else
		{
		Node move = head;
		for(int i=1;i<position-1;i++) 
		{
			move=move.next;
		}
		record.next=move.next;
		move.next=record;
		}
	}

	public void deletebeg()
	{
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
		}
		Node del = head;
		head=head.next; //Assigning new head to linkedlist
		System.out.println("New head is : "+head.data);
		del=null;

	}

	public void deleteEnd()
	{
		if(head==null)
		{
			System.out.println("Linked List is Empty");
			return;
		}
		else
		{
			Node del = null;
			Node move = head;
			while(move.next!=null)
			{
				del=move;
				move=move.next;
			}
			del.next=null;
			move=null;
		}
	}
	
	
	
	public void printFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("First Node is "+head.data);
		}
	}
	
	public void deleteNode(int data)  //Wrong logic
	{	
		boolean found = false;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{	
			Node del=null;
			Node move=head;
			while(move!=null)
			{	
				del=move;
				if(move.data==data)
				{	
					
					found=true;
					break;
				}
				move=move.next;
				del.next=move.next;
				
			}
			if(found==false)
			{
				System.out.println("Entered Data not present in List");
			}
		}
	}

	public void display()
	{
		Node move = head;
		while(move!=null)
		{
			System.out.print("  "+move.data);
			move=move.next;
		}
		System.out.println();
	}
	
	public void display_Reverse(Node move)
	{
		if(move!=null)
		{
			display_Reverse(move.next);
			System.out.print("  "+move.data);
		}
	}
	
	public Node getHead()
	{
		return head;
	}
}
