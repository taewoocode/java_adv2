package classman.immutable;

import java.util.HashMap;

public class UserTest {

	private void managementUser(User user, int age) { //x001
		HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
		Object putUser = objectObjectHashMap.put(user, age);
		for (Object proxy : objectObjectHashMap.keySet()) {
			System.out.println("user = " + user);
		}
		System.out.println("usermanageMent()1.hashCode() = " + user.hashCode());
		user.validation(user);
	}



	private void managementUser2() {
		User user = new User("sunwoo", "1234");
		HashMap<User, Object> objectObjectHashMap = new HashMap<>();
		objectObjectHashMap.put(user, user.getAge());
		for (User userInfo : objectObjectHashMap.keySet()) {
			System.out.println("userInfo = " + userInfo);
		}
		System.out.println("usermanageMent()2.hashCode() = " + user.hashCode());

	}

	//메서드, 메시지
	public void add(int a, int b) {
		int ret;
		ret = a + b;
	}

	private void 더해라() {
		add(3, 5); // 메시지 // 메서드 호출이 메시지임
	}




	static class Test {
		public static void main(String[] args) {
			User user = new User("taewooooo", "1234");
			UserTest userTest = new UserTest();


			// 참조값 전달
			userTest.managementUser(user, 30);
			System.out.println("usermanageMent()1.hashCode() = " + user.hashCode());


			// 내부에서 생성
			userTest.managementUser2();
		}
	}
}
