package dsa_practice.gcr_codebase.linked_list;

class FriendNode {
	int friendId;
	String friendName;
	FriendNode next;

	public FriendNode(int friendId, String friendName) {
		// TODO Auto-generated constructor stub
		this.friendId = friendId;
		this.friendName = friendName;
		this.next = null;
	}
}

class User {
	int userId;
	String name;
	int age;
	FriendNode friend;
	User next;

	User(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friend = null;
		this.next = null;
	}
}

class SocialMedia {
	User head;

	public void addUser(User user) {
		user.next = head;
		head = user;
	}

	User findUserById(int userId) {
		User temp = head;
		while (temp != null) {
			if (temp.userId == userId) {
				displayUser(temp);
				return temp;
			}
			temp = temp.next;
		}
		System.out.println("User Not Found");
		return null;
	}

	public void findUserByName(String name) {
		User temp = head;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				displayUser(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("User Not Found");
	}

	public void addFriend(int userId, int friendId) {
		User u1 = findUserById(userId);
		User u2 = findUserById(friendId);

		if (u1 == null || u2 == null) {
			System.out.println(u1 == null && u2 == null ? "Users" : u2 == null ? u1.name : u2.name + " not found");
			return;
		}
		FriendNode node = new FriendNode(friendId, u2.name);
		node.next = u1.friend;
		u1.friend = node;

		FriendNode node2 = new FriendNode(userId, u1.name);
		node2.next = u2.friend;
		u2.friend = node2;

		System.out.println("Added as Friend");
	}

	public void removeFriend(int userId, int friendId) {
		User u1 = findUserById(userId);
		User u2 = findUserById(friendId);

		if (u1 == null || u2 == null) {
			System.out.println(u1 == null && u2 == null ? "Users" : u2 == null ? u1.name : u2.name + " not found");
			return;
		}

		u1.friend = removeFriendNode(u1.friend, friendId);
		u2.friend = removeFriendNode(u2.friend, userId);
	}

	private FriendNode removeFriendNode(FriendNode friends, int friendId) {
		if (friends == null) {
			return null;
		}
		if (friends.friendId == friendId) {
			return friends.next;
		}
		boolean flag = false;
		FriendNode temp = friends;
		while (temp.next != null) {
			if (temp.next.friendId == friendId) {
				temp.next = temp.next.next;
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (!flag) {
			System.out.println("This user is not listed in friends");
		}
		return friends;
	}

	public void findMutualFriends(int userId, int friendId) {
		User u1 = findUserById(userId);
		User u2 = findUserById(friendId);

		if (u1 == null || u2 == null) {
			System.out.println(u1 == null && u2 == null ? "Users" : u2 == null ? u1.name : u2.name + " not found");
			return;
		}
		System.out.println("Mutual Friends: ");
		FriendNode friends = u1.friend;

		boolean flag = false;
		while (friends != null) {
			if (isFriend(friends.friendId, u2.friend)) {
				System.out.println("ID: " + friends.friendId + " : " + friends.friendName);
				flag = true;
			}
			friends = friends.next;
		}
		if (!flag) {
			System.out.println("No Mutual Friends");
		}
		System.out.println();
	}

	private boolean isFriend(int friendId, FriendNode friends) {
		while (friends != null) {
			if (friends.friendId == friendId) {
				return true;
			}
			friends = friends.next;
		}
		return false;
	}

	public void countAllUserFriends() {
		User temp = head;
		while (temp != null) {
			int count = 0;
			FriendNode friends = temp.friend;
			while (friends != null) {
				count++;
				friends = friends.next;
			}
			System.out.println(temp.name + " : " + count + " Friends");
			temp = temp.next;
		}
	}

	public void displayFriends(int userId) {
		User user = findUserById(userId);

		if (user == null) {
			return;
		}

		System.out.println("Friends: ");
		FriendNode temp = user.friend;
		if (temp == null) {
			System.out.println("No Friends");
		}
		while (temp != null) {
			System.out.println("ID: " + temp.friendId + " : " + temp.friendName);
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayUser(User user) {
		System.out.println("ID: " + user.userId + " Name: " + user.name + " Age: " + user.age);
	}

}

public class SocialMediaFriends {
	public static void main(String[] args) {
		SocialMedia users = new SocialMedia();

		users.addUser(new User(1, "Govind", 21));
		users.addUser(new User(2, "Akash", 22));
		users.addUser(new User(3, "Aman", 23));
		users.addUser(new User(4, "Nitai", 24));

		users.addFriend(1, 2);
		users.addFriend(1, 3);
		users.addFriend(2, 3);
		users.addFriend(3, 4);

		users.displayFriends(1);
		users.findMutualFriends(1, 2);

		users.removeFriend(1, 3);
		users.displayFriends(1);

		users.findUserByName("Charlie");
		users.countAllUserFriends();
	}

}
