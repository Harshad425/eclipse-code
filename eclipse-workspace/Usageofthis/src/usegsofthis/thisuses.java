package usegsofthis;

public class thisuses {
	
	int x, y;	// class variable 
	
	/*thisuses(int x, int y)
	{
		this.x=x;
		this.y=y;*/
	
	void toset(int x, int y)
	{
		this.x=x;
		this.y=y;
	
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		 
		thisuses t=new thisuses();
		t.toset(20,44);
        t.display();
	}

}
