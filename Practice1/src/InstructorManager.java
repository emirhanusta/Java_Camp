
public  class InstructorManager extends UserManager{
	public  void createCourse() {
		System.out.println("Course created successfully");
	};

	@Override
	public void login() {
		System.out.println("Instructor login successfully");
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Instructor deleted successfully done");
		
	};
}
