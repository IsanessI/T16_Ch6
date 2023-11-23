package light;

public class TableLamp extends Lamp {
	Integer degree;
	
	public TableLamp()
	{
		
	}
	
	public TableLamp(int dgr)
	{
		degree = dgr;
	}
	
	public TableLamp(int pwr, int dgr)
	{
		super.power = pwr;
		degree = dgr;
	}
	
	
	public String toString()
	{
		return super.works ? super.toString() + " with degree: " + degree.toString() : super.toString();
	}
	public int hashCode()
	{
		return super.hashCode() + degree;
	}
	public boolean equals(Object obj)
	{
		if (!obj.getClass().equals(TableLamp.class) || obj == null)
			return false;
		
		TableLamp TLobj = (TableLamp)obj;
		
		if (!TLobj.power.equals(super.power) || !TLobj.degree.equals(degree))
			return false;
		
		return true;
	}
}
