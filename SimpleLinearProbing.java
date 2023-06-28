


class MyArray
{
	int arr[];
	boolean flag[];
	int size;
	public MyArray(int size)
	{
		arr=new int [size];
		flag=new boolean[size];
		this.size=size;
	}
	public int hash(int x)
	{
		return x%size;
	}
	public void insert(int key)
	{
		int i=0;
		int location=hash(key);
		do
		{
			if(!flag[location])
			{
				arr[location]=key;
				flag[location]=true;
				return;
			}
			else
			{
				i++;
				location=(hash(key)+i)%size;
			}
				
		}while(i<size);
		System.out.println(" Hash Table Is Full !!! ");
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(flag[i])
				System.out.println(i+")"+arr[i]);
			else
				System.out.println(i+")-----");
		}
		
	}
	public int search(int key)
	{
		int location=hash(key);
		int i=0;
		do
		{
			if(arr[location]==key)
				return location;
			else
			{
				i++;
				location=(hash(key)+i)%size;
			}
			
		}while(i<size && flag[location]);
		return -1;
	}
}
public class SimpleLinearProbing {

	public static void main(String[] args) {
		MyArray a1=new MyArray(10);
		a1.insert(50);
		a1.insert(88);
		a1.insert(65);
		System.out.println("   "+a1.search(99));
		a1.insert(54);
		a1.insert(84);
		a1.insert(66);
		a1.display();
				
	}

}
