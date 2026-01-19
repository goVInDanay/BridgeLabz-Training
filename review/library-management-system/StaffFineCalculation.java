package review.library_management_system;

class StaffFineCalculation implements FineCalculator {

	@Override
	public void calculateFine(int returnDay) {
		// TODO Auto-generated method stub
		double fine = (returnDay - days) * 7.5;
		System.out.println("Late by " + Math.max(0, returnDay - days) + " days. Fine: Rs " + fine);
	}

}
