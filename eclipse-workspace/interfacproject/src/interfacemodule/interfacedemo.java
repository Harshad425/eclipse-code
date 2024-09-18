package interfacemodule;


interface shape
{
	int legnth=10; // final and static 
	int width=20;  // final and static
	
	void circle(); // abstaract method
	 
	default void sqare() // defalut method
	{
		System.out.println("defalut sqare method");
	}
	
	
	static void rectangle() // rectangle method
	{
		System.out.println("static retangle method");
	}
	
	
	}
	
		
	


  public class interfacedemo implements shape
  {
	public void circle()
	{
		System.out.println("implements of inteface abstarct method");
	}
	
   void cornter()
	{
		System.out.println("contr method");
	}

    public void sqare() // defalut method
	{
		System.out.println("dfdg gg qare methodg sg");
	}
	
	
	static void rectangle() // rectangle method
	{
		System.out.println("stgfdg d atic add retangle methoddsa f ");
	}
   
   int legnth=10; // final and static 
	int width=20;  // final and static
	
   
	public static void main(String[] args) {
	
		/*interfacedemo  in= new interfacedemo();
		
		in.circle();
		in.sqare(
		);
		
		shape.rectangle();
		in.cornter();
		System.out.println(in.a * in.b);*/
		
		shape inter=new interfacedemo();
		
		inter.circle();
		inter.sqare();
		shape.rectangle();
		
		System.out.println(shape.legnth * shape.width);
	}

}
