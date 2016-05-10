package edison;

public class Config
{
	protected int SLEEP_TIME = 5000;
	
	// Sensors
	protected int PIN_TEMP = 0;
	protected int PIN_LIGHT = 1;
	
	// MQTT
	protected String BROKER = "tcp://iot.eclipse.org:1883";
	protected String TOPIC = "thunder10/msg";
	protected int QOS = 1;
	protected String CLIENTID = "thunder10";
	
	public void readConfig()
	{
		// TODO not yet implemented
	}
}
