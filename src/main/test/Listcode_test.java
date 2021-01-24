package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import test_practice.Listcode;

public class Listcode_test {


	@Test
	public void containsHelloTest() {

		Listcode sut = new Listcode();
		List<String> actual = sut.getList();
		assertThat(actual, hasItems("Hello"));
	}
}