package abc;

public class InstaVar {
	int days;
	int price;
	
	public static void main(String[] args) {
	InstaVar abc=new InstaVar() ;
	int finaloutput=abc.total(5,526);
	System.out.println(finaloutput);
		}
		 int total(int days,int price){
			int result=(days*price);
			return result;
			
		}
		

	}

