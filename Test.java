class MyArray1
{
	int arr[];
	int table[];
	

	int size;
	public MyArray1(int size)
	{
		arr=new int [size];
		table=new int[size];
		this.size=size;
		 for (int i = 0; i < size; i++) {
	            arr[i] = -1;
	        }
	}
	public int hash(int x)
	{
		return x%size;
	}
	  public void hashing(int data) {




	int hv = hash(data);

	if (arr[hv] == -1)
		arr[hv] = data;
	else {

     for (int j = 0; j < size; j++) {

         int t = (hv + j * j) % size;
         if (arr[t] == -1) {

            arr[t] = data;
             break;
         }
     	}
	    
 
	}
	  }
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
		
				System.out.println(i+")"+arr[i]);
					}
		
	}
}
public class Test {

	public static void main(String[] args) {
		
		MyArray1 arr1=new MyArray1(10);
		arr1.hashing(6);;
		arr1.hashing(6);;
		arr1.hashing(6);;
		
		arr1.display();
		
		
		
		
		
		
		
	}
}
