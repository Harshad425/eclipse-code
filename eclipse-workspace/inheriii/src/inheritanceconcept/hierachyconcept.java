package inheritanceconcept;

class parent {
	int x=10;
	void display(int a)
	{
	System.out.println(a);
	}
}

class child1 extends parent
{
	int t=20;
void show(int b)
{
System.out.println(b);
}
}

class child2 extends parent
{
	int w= 30;
void peint(int c)
{
System.out.println(c);
}
}



public class hierachyconcept {

	public static void main(String[] args) {
		child1 cc1=new child1();
		System.out.println(cc1.t);
		cc1.show(22);
		
child2 cc2=new child2();
System.out.println(cc2.w);
		cc2.peint(44);
		
	}

}
