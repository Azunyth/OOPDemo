
public class Student extends Person implements Studentable {

	@Override
	public void studying(String course) {
		// TODO Auto-generated method stub
		System.out.println("J'�tudie " + course);
	}

	@Override
	public void sayName() {
		// TODO Auto-generated method stub
		System.out.println(this.firstname + " " + this.lastname);
	}

}
