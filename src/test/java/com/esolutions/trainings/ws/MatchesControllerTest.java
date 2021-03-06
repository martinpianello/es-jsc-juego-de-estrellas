package com.esolutions.trainings.ws;

import org.junit.Assert;
import org.junit.Test;

public class MatchesControllerTest {
	
	@Test
	public void test_solve_Gregorian_Leap() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(2016, 256);
		Assert.assertEquals("12-09-2016", date);
	}
	
	@Test
	public void test_solve_Gregorian_NotLeap() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(2017, 256);
		Assert.assertEquals("13-09-2017", date);
	}
	
	@Test
	public void test_solve_Julian_Leap() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(1900, 60);
		Assert.assertEquals("29-02-1900", date);
	}
	
	@Test
	public void test_solve_Julian_NotLeap() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(1947, 256);
		Assert.assertEquals("13-09-1947", date);
	}
	
	@Test
	public void test_solve_Transition() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(1950, 40);
		Assert.assertEquals("22-02-1950", date);
	}
	
	@Test
	public void test_solve_Gregorian_LastDayOfMonth() {
		MatchesController controller = new MatchesController(null);
		String date = controller.solve(2016, 366);
		Assert.assertEquals("31-12-2016", date);
	}
}
