
public class FindVolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 6378;
		double volume = (4 / 3.0) * Math.PI * radius * radius * radius;
		double volumeMiles = volume / 0.6213712;
		System.out.println("Volume of Earth in kilometers is " + volume + " km and in miles is " + volumeMiles + " miles");
	}

}
