package dsa_practice.gcr_codebase.linked_list;

class Process {
	int pid;
	int burstTime;
	int remainingTime;
	int waitingTime;
	int turnaroundTime;
	int priority;

	Process next;

	Process(int pid, int burstTime, int priority) {
		this.pid = pid;
		this.burstTime = burstTime;
		this.remainingTime = burstTime;
		this.priority = priority;
		this.waitingTime = 0;
		this.turnaroundTime = 0;
		this.next = null;
	}
}

class RoundRobinScheduler {
	Process head = null;
	Process tail = null;
	int count = 0;

	public void addProcess(int pid, int burstTime, int priority) {
		Process pNode = new Process(pid, burstTime, priority);
		if (head == null) {
			head = tail = pNode;
			pNode.next = pNode;
		} else {
			pNode.next = head;
			tail.next = pNode;
			tail = pNode;
		}
		count++;
	}

	public void removeProcess(int pid) {
		if (head == null) {
			return;
		}
		Process curr = tail.next;
		Process prev = tail;
		do {
			if (curr.pid == pid) {
				if (curr == tail && curr.next == tail) {
					tail = null;
				} else {
					prev.next = curr.next;
					if (curr == tail) {
						tail = prev;
					}
				}
				count--;
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
	}

	public void schedule(int timeQuantum) {
		if (head == null) {
			System.out.println("No processes to schedule.");
			return;
		}
		int time = 0;
		Process curr = tail.next;
		while (count > 0) {
			System.out.println("\nProcess: " + curr.pid);

			if (curr.remainingTime > timeQuantum) {
				curr.remainingTime -= timeQuantum;
				time += timeQuantum;
			} else {
				time += curr.remainingTime;
				curr.remainingTime = 0;
				curr.turnaroundTime = time;
				curr.waitingTime = curr.turnaroundTime - curr.burstTime;
				int completedPid = curr.pid;
				curr = curr.next;
				removeProcess(completedPid);
				display();
				continue;
			}
			curr = curr.next;
			display();
		}
	}

	void display() {
		if (head == null) {
			System.out.println("Queue Empty");
			return;
		}

		Process temp = head;
		do {
			System.out.print("\n" + temp.pid + " Remaining Time: " + temp.remainingTime);
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	static void calculateAverages(Process[] processes) {
		double waitTime = 0;
		double turnAroundTime = 0;

		for (Process p : processes) {
			waitTime += p.waitingTime;
			turnAroundTime += p.turnaroundTime;
		}

		System.out.println("\nAverage Waiting Time: " + (waitTime / processes.length));
		System.out.println("Average Turnaround Time: " + (turnAroundTime / processes.length));
	}
}

public class RoundRobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundRobinScheduler scheduler = new RoundRobinScheduler();
		int timeQuantum = 2;

		Process[] processes = new Process[3];
		processes[0] = new Process(1, 10, 1);
		processes[1] = new Process(2, 5, 2);
		processes[2] = new Process(3, 8, 1);

		for (Process p : processes) {
			scheduler.addProcess(p.pid, p.burstTime, p.priority);
		}
		scheduler.schedule(timeQuantum);
		RoundRobinScheduler.calculateAverages(processes);
	}

}
