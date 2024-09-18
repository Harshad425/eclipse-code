package automation;

public class classobjectmethod {
	// Assuming your class declaration for Student looks something like this:
	public class otherstudent {
	    // Inner class Student definition
	    public static class Student {
	        int sid;
	        String sname;
	        char grad;

	        public void dataentry() {
	            // Implementation of dataentry method
	        }
	    }
	}

	// Your main class
	public class Main {
	    public static void main(String[] args) {
	        otherstudent.Student stu1 = new otherstudent.Student();
	        stu1.sid = 111;
	        stu1.sname = "Smith";
	        stu1.grad = 'A';
	        stu1.dataentry();

	        otherstudent.Student stu2 = new otherstudent.Student();
	        stu2.sid = 222;
	        stu2.sname = "Kat";
	        stu2.grad = 'A';
	        stu2.dataentry();
	    }
	}
}