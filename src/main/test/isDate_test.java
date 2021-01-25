package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import test_practice.IsDate;

public class isDate_test {

	@Test
	public void isTodayTest(){

		IsDate sut = new IsDate(2021, 1, 22);
		assertThat(new Date(), is(sut.dateOf(2021, 1, 22)));

	}
}
