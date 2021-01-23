package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sample.Sample;

public class Sample_test {

	@Test
	public void sampleTest(){

		Sample sample = new Sample();
		int test = sample.sum(2, 5);
		assertEquals(7, test);
	}
}
