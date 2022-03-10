
public  class StudentManager extends UserManager{
	public  void joinTheCourse() {
		System.out.println("Student successfully attended this course");
	}

	@Override
	public void login() {
		System.out.println("Student login successfully");
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Student -"+user.getFirstName()+"- deleted successfully done");
		
	};
}
