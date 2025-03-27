package classman;

public class ClassStart1 {
	public static void main(String[] args) {
		String studentName = "학생1";
		int studentAge = 15;
		int studentGrade = 90;

		String studentName2 = "학생2";
		int studentAge2 = 16;
		int studentGrade2 = 80;

		String studentName3 = "학생2";
		int studentAge3 = 16;
		int studentGrade3 = 80;

		System.out.println("이름: " + studentName + "나이: " + studentAge + "성적: " + studentGrade);
		System.out.println("이름: " + studentName2 + "나이: " + studentAge2 + "성적: " + studentGrade2);
		System.out.println("이름: " + studentName3 + "나이: " + studentAge3 + "성적: " + studentGrade3);

	}

	static class Class2 {
		public static void main(String[] args) {
			String[] studentNames = {"학생1", "학생2"};
			int[] ages = {16, 16};
			int[] grades = {80, 80};

			for (int i = 0; i < studentNames.length; i++) {
				System.out.println("이름: " + studentNames[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
			}
 		}
	}

}
