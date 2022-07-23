package encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Sano");
		s1.setEmail("sano@gmail.com");
		s1.setPassword("12345");
		s1.setMobile("9962321486");
		s1.setDivision("A");
		s1.setStd("12");
		
		System.out.println("Id:"+s1.getId()+"\nName:"+s1.getName()+"\nEmail:"+s1.getEmail()+"\nPassword:"+s1.getPassword()+"\nMobile:"+s1.getMobile()+"\nDivision:"+s1.getDivision()+"\nStd:"+s1.getStd());
		
	}
}

