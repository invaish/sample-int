package week3.day1;

public class Students {


	public void getStudentInfo(int id) {
		System.out.println("My ID number :" +id);

	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("My ID number :" + id);
		System.out.println("My Name is :" + name);
	}
	
	public void getStudentInfo(String mail , long phonenumber)
	{
		System.out.println("My Email id : " + mail);
		System.out.println("My Phonenumber :" +phonenumber);
	}
	
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(2345);
		s.getStudentInfo(2345, "Vaishali");
		s.getStudentInfo("Test@gmail.com" , 987654321);
		
			
	}

}
