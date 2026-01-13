package oops_practice.scenario_based.hotel_reservation_system;

class SeasonalPricing implements PricingSystem {
	private double seasonalInc;
	
	SeasonalPricing(double seasonalInc) {
		this.seasonalInc = seasonalInc;
	}
	
	@Override
	public double calculatePrice(double roomPrice, int days) {
		// TODO Auto-generated method stub
		return roomPrice * days * seasonalInc;
	}
}
