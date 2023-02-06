package selectorshub;

class Car
{
	void parking()
	{
		System.out.println("Car parking");
	}
}

class BMW extends Car
{
	void parking()
	{
		System.out.println("BMW parking ");
	}
}


public class Stringsplit {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.parking();
		// TODO Auto-generated method stub
		
		/*
		 * String email = "QatestCDuat20411_123050@vmware.com";
		 *  String sEmail[] =email.split("@"); 
		 *  String sLname[] = sEmail[0].split("qa");
		 * 
		 * System.out.println(sEmail); System.out.println(sLname[0]);
		 */
	}

}
