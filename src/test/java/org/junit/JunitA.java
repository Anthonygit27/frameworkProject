package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({JunitAssertSuite.class, JunitPractice.class})
public class JunitA {
	@Test
	public void testCaseSamp() {
		Result rc = JUnitCore.runClasses(QuestionTwo.class);
		System.out.println("RunCount - "+rc.getRunCount());
		System.out.println("Runtime - "+rc.getRunTime());
		System.out.println("Failurecount - "+rc.getFailureCount());
		System.out.println("IgnoreCount - "+rc.getIgnoreCount());

		List<Failure> fl = rc.getFailures();
		for (Failure f : fl) {
			System.out.println(f);
		}
	}

}
