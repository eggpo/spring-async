package com.cware.sample;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;

@Controller
public class AsyncController {

	@Async
	public void asyncMethod(int callNo) throws InterruptedException {
		String name = Thread.currentThread().getName();
	    System.out.println(callNo + " Execute method asynchronously. "
	      + name);
	    Thread.sleep(3000);
	    System.out.println(callNo + "Complete method asynchronously. "+ name);
	}
}
