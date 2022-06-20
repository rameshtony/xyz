package abc;

public class BankForm {

	public static void main(String[] args) {
		BankForm bf=new BankForm();
		double fd=bf.depositform(245.3, 5632.15);
		System.out.println(fd);
	}
  double   depositform(double pvb, double curramt){
    	 double total=(pvb+curramt);
    	 return total;
    	 
     }
}
