package collections.scenario_based.smart_water_tracking_system;

class UserInterface {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		try {
			WaterTank tank1 = new WaterTank("Tank1", 1000, 800);
			WaterTank tank2 = new WaterTank("Tank2", 500, 90);
			WaterTank tank3 = new WaterTank("Tank3", 750, 200);
			WaterTank tank4 = new WaterTank("Tank4", 600, 10);

			monitor.addTank(tank1);
			monitor.addTank(tank2);
			monitor.addTank(tank3);
			monitor.addTank(tank4);

			System.out.println("Before Sorting:");
			monitor.displayTanks();

			monitor.checkLevel();

			monitor.sortTanksByLevel();
			System.out.println("After Sorting by Current Level:");
			monitor.displayTanks();

			tank1.setCurrentLevel(1230);
		} catch (InvalidWaterLevelException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
