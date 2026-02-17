package collections.scenario_based.ev_charging_management_system;

interface PricingStrategy {
	double calculateBill(double units);
}
