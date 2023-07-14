
public class Staticvariable {

	static int x=10;
	int y =20;
	
	
	void cal() {
	int y =45;
	
			
		
		int z = x+y;
		System.out.println(z);
		
	}
	 void sal() {
		int z = x+y;
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		Staticvariable obj = new Staticvariable();
		obj.cal();
	}
}
