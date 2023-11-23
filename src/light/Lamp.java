package light;

public class Lamp implements LightSource {
	public Integer power;
	boolean works;
	
	
	public Lamp()
	{
		
	}
	
	public Lamp(Integer pwr)
	{
		power = pwr;
	}
	
	public boolean LightsOn()
	{
		if (power.equals(0) || works)
			return false;
		works = true;
		return true;
	}
	
	public boolean LightsOff()
	{
		if (!works)
			return false;
		
		works = false;
		return true;
	}
	
	public boolean State()
	{
		return works;
	}
	
	public String toString()
	{
		return works ? "Lamp is working, power: " + power.toString() : "Lamp doesn't working";
	}
	public int hashCode()
	{
		return power + (works ? 1 : 0);
	}
	public boolean equals(Object obj)
	{
		 if (!obj.getClass().equals(Lamp.class) || obj == null)
			 return false;
		 
		 Lamp l_obj = (Lamp)obj;
		 if (power != l_obj.power)
			 return false;
		 
		 return true;
	}
}
