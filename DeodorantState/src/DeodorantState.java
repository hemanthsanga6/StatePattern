
class Deodorant {
final static int LOCKED=0;
final static int UNLOCKED=1;
final static int SPRAY=2;
final static int CANNOTSPRAY=3;
int state=LOCKED;
int count;
float volume=4f;

public void lock()
{
	if(state==LOCKED)
	{
		System.out.println("Deodoranrant is already locked");
	}
	if(state == UNLOCKED)
	{
		state = LOCKED;
		System.out.println("Deodorant is locked now");
	}
	if(state==SPRAY)
	{
		System.out.println("Deodorant is locked and cannot be used");
	}
	if(state == CANNOTSPRAY)
	{
		System.out.println(" Deodorant is locked");
	}
}
public void unlock()
{
	if(state == UNLOCKED)
	{
		System.out.println("Deodorant is already unlocked");
	}

	if(state==LOCKED)
	{
		System.out.println("Deodoranrant is unlocked and ready to be used");
		state=UNLOCKED;
	}
	if(state==SPRAY)
	{
		buttonPressed();
	}
	if(state == CANNOTSPRAY)
	{
		System.out.println(" Deodorant is empty and can't be sprayed");
	}
}
public void buttonPressed()
{
	if(state==LOCKED)
	{
		System.out.println("Deodorant is locked and dispenser button cannot be pressed");
	}
	if(state==UNLOCKED)
	{
		System.out.println("Deodorant is ready to use");
		state=SPRAY;
		
	}
	if(state == SPRAY)
	{
		
		if(volume>0)
		{
		volume=volume-0.2f;
		System.out.println("Deodorant is sprayed, Remaining volume is "+volume);
		count++;
		
		}
		else
		{
			state= CANNOTSPRAY;
		}
	}
	if(state==CANNOTSPRAY)
	{
		System.out.println("Deodorant has been sprayed "+count+" times and is empty");
		state=LOCKED;
	}
	
}
public void getState()
{
	System.out.println(state);
}

}
public class DeodorantState
{
	public static void main(String[] args)
	{
		Deodorant d = new Deodorant();
		d.getState();
		d.buttonPressed();
		d.unlock();
		for(int i=0;i<=20;i++)
		{
		d.buttonPressed();
		}
		d.getState();
	
	}
}