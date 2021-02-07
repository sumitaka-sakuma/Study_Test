package test_practice;

import java.util.Date;

public class DelegateObjectExample {

	public DateFactory dateFactory = new DateFactory();
	public Date date = new Date();

	public void doSomething(){
		this.date = dateFactory.newDate();
	}

}
