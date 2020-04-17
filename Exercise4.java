/*Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. After making the clone, change the properties of the original employee object and print the properties of both the original and clone object and note down your observation.*/

class Employee implements Cloneable{
	private String name;
	private int age;
	
	public Employee(String name,int age ) {
		this.name=name;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public Employee clone() {
		try {
            return (Employee) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
            return this;
        }
	}
}


public class Exercise4{
	public static void main(String[] args) {
		Employee emp1=new Employee("Rohit", 21);
		Employee emp2;
		System.out.println("Name is "+emp1.getName());
		System.out.println("Age is "+emp1.getAge());
		emp2=emp1.clone();
		System.out.println("Name clone is "+emp2.getName());
		System.out.println("Age cloneis "+emp2.getAge());
		emp1.setAge(29);
		emp1.setName("Virat");
		System.out.println("Name is "+emp1.getName());
		System.out.println("Age is "+emp1.getAge());
		System.out.println("Name clone is "+emp2.getName());
		System.out.println("Age cloneis "+emp2.getAge());
		
	}
}
