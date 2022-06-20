package abc;

public class Vegtables {


	public static void main(String[] args) {
		Vegtables rv=new Vegtables();
		double carrot=rv.calculate(1,55.5);
		double tomato=rv.calculate(2,80);
		double cabbage=rv.calculate(1.5,40);
		System.out.println(carrot+tomato+cabbage);

	}
double calculate(double kg, double price) {
	double result=(kg*price);
	return result;
}
}
