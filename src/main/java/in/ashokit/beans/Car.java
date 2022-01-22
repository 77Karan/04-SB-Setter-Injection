package in.ashokit.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Car
{

	Car()
	{
		System.out.println("Creating CarClassObject");
	}
	private Engine engine;
	@Autowired
	public void setEngine()
	{
		System.out.println("Calling Setter method os car");
		this.engine=engine;
	}
	
	public void startJourney()
	{
		int n1 = engine.startEngine();
		if(n1>=0)
		{
			System.out.println("I am starting");
		}
		else
		{
			System.out.println("Problem in engine");
		}
	}
}
