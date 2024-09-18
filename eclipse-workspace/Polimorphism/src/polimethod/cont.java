package polimethod;

public class cont {
	
	
    double width, height, depth;
    
    
	cont() // 1
	{
	/*	width=0;
		height=0;
		depth=0;*/
		
		width=height=depth=0;
		
		
		
		cont(double w, double h, double d)
		{
			width=w;
			height=h;
			depth=d;
		}
		cont(double l)
		{
			width=height=depth=l;
		}
		
		
		double volume()
		{
		return(width*height*depth)
	         }
	}
	
}
	
	
	
	
	
	
	
	

