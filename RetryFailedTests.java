package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {
	int maxretry = 0; // starting index

	public boolean retry(ITestResult result) {
		if(maxretry < 1) {
			maxretry++;
			return true; // retry will continue
			
		}
		return false; // false means retry will stop
	}

}
