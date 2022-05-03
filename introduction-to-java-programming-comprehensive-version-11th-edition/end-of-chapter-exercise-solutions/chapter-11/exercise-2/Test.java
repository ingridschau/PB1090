public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Garry Barryman");
		Student student = new Student(Student.SENIOR);
		student.setName("Jingle PB&J");
		Employee employee = new Employee("Delray Beach,FL", 45_750.00, new MyDate());
		employee.setName("Sarah Stodenbyer");
		Faculty faculty = new Faculty(new double[]{9.0, 5.0}, 5);
		faculty.setName("Milly Millyman");
		Staff staff = new Staff("Boston,MA", 750_000.00, new MyDate(), "CEO");
		staff.setName("Madonna Firehat");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}