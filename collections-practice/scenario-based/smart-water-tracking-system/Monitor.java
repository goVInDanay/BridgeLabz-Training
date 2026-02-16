package collections.scenario_based.smart_water_tracking_system;

import java.util.*;

class Monitor {
	private List<WaterTank> tanks;

	public Monitor() {
		// TODO Auto-generated constructor stub
		this.tanks = new ArrayList<WaterTank>();
	}

	public void addTank(WaterTank tank) {
		tanks.add(tank);
	}

	public void checkLevel() {
		System.out.println("Checking water level: ");
		for (WaterTank tank : tanks) {
			System.out.println(tank);
			if (tank.isLevelLow()) {
				System.out.println("ALERT: Tank " + tank.getTankId() + " is below 20%");
			}
		}
	}

	public void sortTanksByLevel() {
		tanks.sort(Comparator.comparingDouble(WaterTank::getCurrentLevel));
	}

	public void displayTanks() {
		tanks.forEach(System.out::println);
	}
}
