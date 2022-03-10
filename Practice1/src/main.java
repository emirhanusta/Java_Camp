
public class main {

	public static void main(String[] args) {

			Student student1=new Student();
			StudentManager student=new StudentManager();
			student1.setEmail("emirhan1usta@gmail.com");
			student1.setFirstName("Emirhan");
			student1.setLastName("Usta");
			student1.setId(123456);	
			
			student.deleteUser(student1);
	}
}
