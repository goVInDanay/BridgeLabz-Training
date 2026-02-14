package collections.scenario_based.file_backup_scheduler;

import java.util.*;

class BackupScheduler {
	private PriorityQueue<BackupTask> taskQueue;

	public BackupScheduler() {
		taskQueue = new PriorityQueue<>((a, b) -> Integer.compare(b.getPriority(), a.getPriority()));
	}

	public void scheduleBackup(BackupTask task) {
		taskQueue.offer(task);
		System.out.println("Scheduled: " + task);
		System.out.println();
	}

	public void executeBackups() {
		System.out.println("Executing backup tasks:");
		while (!taskQueue.isEmpty()) {
			BackupTask task = taskQueue.poll();
			System.out.println("Backing up folder: " + task.getFolderPath() + " Priority: " + task.getPriority());
		}
		System.out.println();
	}
}
