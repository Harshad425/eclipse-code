package inheritanceconcept;

class A
{
    int a=100;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b=200;

    void show() {
        System.out.println(b);

    }
}

class C extends B {
    int c=300;

    void print() {
        System.out.println(c);

    }
}

public class inheritancectypes {

	public static void main(String[] args) {
		 C bobj=new C();
System.out.println(bobj.a);
System.out.println(bobj.b);
System.out.println(bobj.c);
		  bobj.display();
		  bobj.show();
		  bobj.print();
			}

	}


