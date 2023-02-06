package pavanonlinetraining;

public class Encapsulationaccess {

	public static void main(String[] args) {
	
		EncapsulationEx a = new EncapsulationEx();
		a.setId(2);
		a.setName("Ajit");
		a.setMarks(33);
		
		System.out.println(a.getId() );
		System.out.println(a.getMarks());
		System.out.println(a.getName());

	}

}
