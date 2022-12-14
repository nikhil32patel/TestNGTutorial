package test;

import org.testng.annotations.Test;
import testNG.listeners.*;

import testNG.listeners.MyListenerIAnnotationTransformer;

public class IAnnotationTransformerWithExample {
	
	MyListenerIAnnotationTransformer objMylistener = new MyListenerIAnnotationTransformer();
	@Test(invocationCount=5)
	public void changeInvocationCountOfMethod()
	{
		System.out.println("This method have invocation count set to 5 but at run time it shall become "+ objMylistener.counter);
	}
}
