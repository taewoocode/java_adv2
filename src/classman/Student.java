package classman;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import javax.xml.namespace.QName;

public class Student {
	String name;
	int age;
	int grade;
	private static final Map<String,Integer> map = new HashMap<>();
	private static final List<Integer> list = new ArrayList<>(); // 같은 리스트를 공유
	private List<Integer> list2 = new ArrayList<>();

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public Student() {
	}


	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", age=" + age +
			", grade=" + grade +
			'}';
	}

	static class Test {
		public static void main(String[] args) {

			/**
			 * x001
			 */
			Student student1;
			student1 = new Student();
			student1.name = "student1";
			student1.age = 15;
			student1.grade = 90;

			/**
			 * x002
			 */
			Student student2 = new Student();
			student2.name = "student2";
			student2.age = 16;
			student2.grade = 100;

			Student[] students = new Student[2];
			int[] s = new int[5]; // 0,1,2,3,4
			students[0] = student1;
			students[1] = student2;
			students[0].grade = 120;
			for (Student student : students) {
				System.out.println("studentgood = " + student);
			}

			for (int student = 0; student < students.length; student++) {
				System.out.println("studentMan = " + students[student]);
			}
			for (int i = 0; i < students.length; i++) {
				System.out.println("[i] = " + i + " = " + " students[i]" + " = " + students[i]);

			}




			map.put(student1.name, student1.age);
			map.put(student2.name, student2.age);
			Integer integer = map.get(student1.name);
			System.out.println("integer = " + integer);

			System.out.println("student1 = " + student1);
			System.out.println("student2 = " + student2);

			list.add(10);
			list.add(20);

			Student stu3 = new Student();
			Student stu4 = new Student();
			stu3.list.add(40);
			System.out.println(stu3.list);
			System.out.println(stu4.list);

			Student stu5 = new Student();
			stu5.list2.add(60);
			System.out.println("stu5.list2 = " + stu5.list2);

		}
	}

}
