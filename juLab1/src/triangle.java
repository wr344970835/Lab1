import static org.junit.Assert.assertEquals;


public class triangle {
	private static int result;

	public boolean check(int a,int b,int c)
	{
		if(a+b>c||a+c>b||b+c>a){
			result = 1;	
			return true;
		}
		else{
			result = 0;	
			return false;
			}
	}
	
		public void longest(int a,int b,int c){
			if(check(a,b,c))
			{
				if( a>b && a>c)
					result = a;
				else if(b>a && b>c)
					result = b;
				else
					result = c;	
			}
			else 
				result = -1	;
		}
		
		public void equilateral(int a,int b,int c){
			if(check(a,b,c)){
				if(a==b||a==c||b==c)
					result = 1;	
				else 
					result = 0;	
			}
			else 
				result = 0;	
		}
		
		public void isosceles(int a,int b,int c){
			if(check(a,b,c)){
				if(a==b&&a==c)
					result = 1;	
				else 
					result = 0;
			}
			else 
				result = 0;	
		}
		
		public void scalene(int a,int b,int c){
			if(check(a,b,c)){
				if(a==b&&a==c)
					result = 0;	
				else
					result = 1;	
			}
			else 
				result = 0;	
		}
		
		public int getResult(){
			return result;
		}
}
