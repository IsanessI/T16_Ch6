package light;

public interface LightSource {
	boolean LightsOn(); //returns true when turning on 
	boolean LightsOff(); //return true when turning off
	boolean State();
	
	String toString();
	int hashCode();
	boolean equals(Object obj);
}
