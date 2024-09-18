package array;

public class arrayproject {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int search_element=30;
		
		boolean status=false
		for (int i=0;i<a.lenth;i++)
		{
		if(a[i]=search_element)
		{
			System.out.pritnln("element found")
			status=true;
			break;
		}
	}
         if (status==false)
         {
        	 System.out.println("element not found")
         }
}
