package classman.immutable;

public class User {
	private String name;
	private String age;

	public User(String name, String password) {
		this.name = name;
		this.age = password;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}



	public User() {
	}

	public void validation(User user) {
		System.out.println("userManageMent()1.hashCode() = " + user.hashCode());
	}
}
