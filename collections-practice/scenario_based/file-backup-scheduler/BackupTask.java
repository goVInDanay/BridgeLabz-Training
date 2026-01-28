package collections.scenario_based.file_backup_scheduler;

class BackupTask {
	private String folderPath;
	private int priority;

	public BackupTask(String folderPath, int priority) throws InvalidBackupPathException {
		if (folderPath == null || folderPath.isEmpty()) {
			throw new InvalidBackupPathException("Backup path cannot be empty");
		}
		this.folderPath = folderPath;
		this.priority = priority;
	}

	public String getFolderPath() {
		return folderPath;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "BackupTask " + folderPath + " Priority=" + priority;
	}

}
