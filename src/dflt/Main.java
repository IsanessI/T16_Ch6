package dflt;

import light.Lamp;
import light.TableLamp;


public class Main {
	public static void main(String arg[])
	{
		Lamp lamp = new Lamp(10);
		TableLamp tbLamp = new TableLamp(2, 10);
		
		lamp.LightsOn();
		tbLamp.LightsOn();
		
		System.out.println("lamp: " + lamp.toString());
		System.out.println("table lamp: " + tbLamp.toString());
		
		lamp.LightsOff();
		tbLamp.LightsOff();
		
		System.out.println("lamp: " + lamp.toString());
		System.out.println("table lamp: " + tbLamp.toString());
	}
}
