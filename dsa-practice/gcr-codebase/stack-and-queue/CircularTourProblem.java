package dsa_practice.gcr_codebase.stack_and_queue;
import java.util.*;

public class CircularTourProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int distances[] = new int[n];
		Queue<PetrolPump> queue = new LinkedList<PetrolPump>();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			distances[i] = sc.nextInt();
			sum += distances[i];
		}
		int petrol[] = new int[n];
		for(int i = 0; i < n; i++) {
			petrol[i] = sc.nextInt();
			sum -= petrol[i];
		}
		if(sum > 0) {
			System.out.println("Cannot tour");
		}
		else {
			for(int i = 0; i < n; i++) {
				queue.offer(new PetrolPump(distances[i], petrol[i]));
			}
			int startPoint = findStartingPoint(queue);
			System.out.println("Start from index " + startPoint);
		}
	}
	
	public static int findStartingPoint(Queue<PetrolPump> queue) {
		int currPetrol = 0;
		int start = 0;
		while(!queue.isEmpty()) {
			PetrolPump data = queue.poll();
			if(currPetrol + data.petrol < data.distance) {
				start++;
				continue;
			}
			currPetrol = data.petrol - data.distance;
		}
		return start;
	}
}

class PetrolPump {
	int distance;
	int petrol;
	PetrolPump(int distance, int petrol) {
		this.distance = distance;
		this.petrol = petrol;
	}
}
