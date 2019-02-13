package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testGetHighestFromData() {
		SomeBusinessImpl impl = new SomeBusinessImpl(new DataServiceStub());
		int result = impl.getHighestFromData();
		assertEquals(15, result);
	}
	
	class DataServiceStub implements DataService {

		@Override
		public int[] retrieveAllData() {
			return new int[] {24,6,15};
		}
	}
}
