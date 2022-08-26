package ThursdayLab;

public class StudentDetail {
	class Student{
		private String name;
		protected int id;
		double grade;
		public int age;

		public Boolean isPassed(double grade){
			return null;
		}

		public void setName(String name){
			this.name = name;
		}
		public void setId(int id){
			this.id = id;
		}
		public String getName(){
			return this.name;
		}
		public int getId(){
			return this.id;
		}
	}
	class Undergrad extends Student{
		@Override
		public Boolean isPassed(double grade){
			if(grade>70.0)
				return true;
			return false;
		}
	}
	class Grad extends Student{
		@Override
		public Boolean isPassed(double grade){
			if(grade>80.0)
				return true;
			return false;
		}
	}

	public class Studentdetail{
		public static void main(String args[]){

			Undergrad ud = new Undergrad();
			Grad g = new Grad();

			//For undergraduate student
			ud.setName("Anurag");
			ud.setId(100);
			ud.grade = 94;
			ud.age = 19;
			System.out.println("Student name: "+ud.getName() +" Id: "+ ud.getId() +" Age: "+ ud.age +" Grade "+ ud.grade);
			if(ud.isPassed(ud.grade))
				System.out.println("Passed");
			else
				System.out.println("Failed");


			//For Graduate student
			g.setName("Abhishek");
			g.setId(193);
			g.age = 21;
			g.grade=86;
			System.out.println("Student name: "+g.getName() +" Id: "+ g.getId() +" Age: "+ g.age +" Grade "+ g.grade);
			if(g.isPassed(g.grade))
				System.out.println("Passed");
			else
				System.out.println("Failed");
		}
	}

}
