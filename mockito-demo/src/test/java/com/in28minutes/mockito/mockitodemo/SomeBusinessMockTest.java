package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.xmlunit.input.WhitespaceNormalizedSource;

public class SomeBusinessMockTest {

	@Test
	public void testGetHighestFromData() {
		
		DataService mockService = Mockito.mock(DataService.class);
		Mockito.when(mockService.retrieveAllData()).thenReturn(new int[] {24,12,15});
		SomeBusinessImpl impl = new SomeBusinessImpl(mockService);
		int result = impl.getHighestFromData();
		assertEquals(24, result);
	}
	
	@Test
	public void testGetHighestOneFromData() {
		
		DataService mockService = Mockito.mock(DataService.class);
		Mockito.when(mockService.retrieveAllData()).thenReturn(new int[] {15,24});
		SomeBusinessImpl impl = new SomeBusinessImpl(mockService);
		int result = impl.getHighestFromData();
		assertEquals(15, result);
	}
}
