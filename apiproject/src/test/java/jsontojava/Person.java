package jsontojava;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder ({
	"name",
	"id",
	"gender",
	"age"
		
})

public class Person {
	
			
		String name,gender;
		int age ,id;
		
		public Person(String name,String gender,int age,int id) {
			
			this.name=name;
			this.gender=gender;
			this.id=id;
			this.age=age;
			
		}
		public Person() {
			
		}
		
		public String getName() {
			return name;
			
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getGender() {
			return gender;
			
		}
		
		public void setGender(String gender) {
			this.gender=gender;
		}
		
		
		public int getId() {
			return id;
			
		}
		
		public void setId(int id) {
			this.id=id;
		}
		
		public int getAge() {
			return age;
			
		}
		
		public void setAge(int age) {
			this.age=age;
		}
		
		@Override
		public String toString() {
			
			return "name is : " + name + "\n" + "gender is : " + gender + "\n" + " age is : " + age
					+ "\n" + " id is :" +id;
		}
		
	
	

}
