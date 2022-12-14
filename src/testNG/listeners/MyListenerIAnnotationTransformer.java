package testNG.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IExecutionListener;
import org.testng.annotations.ITestAnnotation;

public class MyListenerIAnnotationTransformer implements IAnnotationTransformer, IExecutionListener {

	public int counter = 3;

	@Override
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor,
			Method testMethod) {
		if (testMethod.getName().equals("changeInvocationCountOfMethod")) {
			System.out.println("Changing invocation for the following method: " + testMethod.getName());
			testAnnotation.setInvocationCount(counter);
		}
	}

	@Override
	public void onExecutionFinish() {
		long endTime = System.currentTimeMillis();
		System.out.println("Inform all the suite have finished execution at" + endTime);

	}

	@Override
	public void onExecutionStart() {
		long startTime = System.currentTimeMillis();
		System.out.println("Inform all the suite have started execution at" + startTime);

	}
}
