package review.library_management_system;

class StudentFineCalculation implements FineCalculator {

	@Override
	public void calculateFine(int returnDay) {
		// TODO Auto-generated method stub
		double fine = (returnDay - days) * 10;
		System.out.println("Late by " + Math.max(0, returnDay - days) + " days. Fine: Rs " + fine);
	}

}
