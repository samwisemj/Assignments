public class Distance {
	
	private int feet;
	private float inches;
	
	public void set(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	public void display()
	{
		System.out.println("Feet: "+feet+"ft\nInches: "+inches+"in");
	}
	public Distance add(Distance n)
	{
		Distance distanceNumberSum = new Distance();
		distanceNumberSum.feet =feet+n.feet;
		distanceNumberSum.inches=inches+n.inches;
		return distanceNumberSum;		
	}
}
