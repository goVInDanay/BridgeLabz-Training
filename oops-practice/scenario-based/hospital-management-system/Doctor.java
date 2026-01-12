package oops_practice.scenario_based.hospital_management_system;

class Doctor extends Person {
	private double consulationFee;

	Doctor(int id, String name, int age, double consulationFee) {
		super(id, name, age);
		this.consulationFee = consulationFee;
	}

	public double getConsultationFee() {
		return consulationFee;
	}

}
