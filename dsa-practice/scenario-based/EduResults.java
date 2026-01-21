package dsa_practice.scenario_based;

import java.util.*;

class Student {
	String name;
	int rollNo;
	int score;

	Student(String name, int rollNo, int score) {
		this.name = name;
		this.rollNo = rollNo;
		this.score = score;
	}
}

public class EduResults {

	public static List<Student> stateRank(List<List<Student>> districtLists) {
		if (districtLists.isEmpty()) {
			return new ArrayList<Student>();
		}

		List<Student> finalList = new ArrayList<Student>();
		for (List<Student> district : districtLists) {
			finalList.addAll(district);
		}

		mergeSort(finalList);
		return finalList;
	}

	public static void mergeSort(List<Student> students) {
		if (students.size() <= 1) {
			return;
		}

		int mid = students.size() / 2;
		List<Student> left = new ArrayList<Student>(students.subList(0, mid));
		List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

		mergeSort(left);
		mergeSort(right);

		merge(left, right, students);
	}

	private static void merge(List<Student> left, List<Student> right, List<Student> ans) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.size() && j < right.size()) {
			if (left.get(i).score > right.get(j).score) {
				ans.set(k++, left.get(i++));
			} else if (left.get(i).score < right.get(j).score) {
				ans.set(k++, right.get(j++));
			} else {
				if (left.get(i).rollNo < right.get(j).rollNo) {
					ans.set(k++, left.get(i++));
				} else {
					ans.set(k++, right.get(j++));
				}
			}
		}
		while (i < left.size()) {
			ans.set(k++, left.get(i++));
		}
		while (j < right.size()) {
			ans.set(k++, right.get(j++));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> d1 = Arrays.asList(new Student("Akash", 101, 94), new Student("Govind", 102, 84));
		List<Student> d2 = Arrays.asList(new Student("Aman", 103, 94), new Student("Nitai", 104, 86));
		List<Student> d3 = Arrays.asList(new Student("Hariom", 105, 91), new Student("Nitin", 106, 90));
		List<List<Student>> districts = Arrays.asList(d1, d2, d3);
		List<Student> rank = stateRank(districts);

		System.out.println("Rank");
		for (Student s : rank) {
			System.out.println(s.rollNo + " " + s.name + " " + s.score);
		}
	}

}
