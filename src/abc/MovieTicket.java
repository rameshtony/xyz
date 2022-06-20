package abc;

public class MovieTicket {

	public static void main(String[] args) {
	MovieTicket rrr=new MovieTicket();
	int rc=rrr.ramesh(5,200);
	System.out.print(rc);

	}
 int ramesh(int tickets,int ticketprice){
int	total=tickets*ticketprice;
	return total;
}
}
