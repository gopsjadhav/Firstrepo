
public class Calculation {
	
	//method overloading assignment
	int x  ;
	int y ;

	int z ;

	int sum(int x, int y) {
		return x+y;
	

	}

	int sum(int x, int y, int z) {

		return x + y + z;
	}

	double sum(double x, double y) {

		return x + y;
	}

	double sum(double x, double y, double z) {

		return x + y + z;

	}

	public static void main(String[] args) {
		Calculation obj = new Calculation();
		System.out.println(obj.sum(10, 40));
		System.out.println(obj.sum(10.5, 9.78, 8.97));

	}

}
