package java_session_12thNovember_2022;

public class Student {

	String name;
	int student_id;
	int age;
	String hobby;

	public static void main(String[] args) {

		Student S1 = new Student("Aman", 101, 9);
		System.out.println(S1.name + " " + S1.student_id + " " + S1.age);

		Student S2 = new Student("Rahul", 102, 9);
		System.out.println(S2.name + " " + S2.student_id + " " + S2.age);

		Student S3 = new Student("Mona", 103, 9);
		System.out.println(S3.name + " " + S3.student_id + " " + S3.age);
		
		Student S4 = new Student("Singing");
		System.out.println(S4.hobby);
	}

	public Student(String name, int student_id, int age) {
		this.name = name;
		this.student_id = student_id;
		this.age = age;
		
	}

	public Student(String hobby) {
		this.hobby = hobby;
	}
	
	Student(){
		
	}

}
