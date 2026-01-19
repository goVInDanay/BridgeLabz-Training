package review.library_management_system;

class Member extends User {
	private String role;

	Member(String name, String role) {
		super(name);
		this.role = role;
	}

	public String getRole() {
		return role;
	}
	
	
}
