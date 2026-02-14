package collections.scenario_based.file_backup_scheduler;

public class FileBackupScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackupScheduler scheduler = new BackupScheduler();

		try {
			BackupTask task1 = new BackupTask("/documents/user", 10);
			BackupTask task2 = new BackupTask("/downloads", 5);
			BackupTask task3 = new BackupTask("/pictures", 7);
			scheduler.scheduleBackup(task1);
			scheduler.scheduleBackup(task2);
			scheduler.scheduleBackup(task3);
			BackupTask task4 = new BackupTask(null, 3);
			scheduler.scheduleBackup(task4);
		} catch (InvalidBackupPathException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scheduler.executeBackups();
	}

}
