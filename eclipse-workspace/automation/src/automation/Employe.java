package automation;

public class Employe {
	
		// variables
		
		int eid;
		String ename;
		String job;
		int sal;
		
		// method 
		 
		void display()
		{
			System.out.println(eid);
			System.out.println(ename);
			System.out.println(job);
			System.out.println(sal);
		}
		
		
		
		
		
		
		

		public static void main(String[] args) {
			 Employe emp1 = new Employe();
		        
		        // Assigning values to the attributes of emp1
		        emp1.eid = 101;
		        emp1.ename = "John";
		        emp1.job = "Manager";
		        emp1.sal = 50000;
		        
		        // Calling display method to print employee details
		        emp1.display();
		        
		        
		        
		        
		        
		        
		        Employe emp2 = new Employe();
		        emp2.eid= 202;
		        		emp2.ename="kat";
		        
		       emp2.job="developer";
		        emp2.sal=30000;
		        emp2.display();
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    }
			
			
			
			
			

		








		private static Employee Employee() {
			// TODO Auto-generated method stub
			return null;
		}

	

	

	}


