package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessAnnotationMockTest {

	@Mock
	DataService mockService;
	
	@InjectMocks
	SomeBusinessImpl impl;
	
	@Test
	public void testGetHighestFromData() {
		Mockito.when(mockService.retrieveAllData()).thenReturn(new int[] {24,12,15});
		assertEquals(24, impl.getHighestFromData());
	}
	
	@Test
	public void testGetHighestOneFromData() {
		Mockito.when(mockService.retrieveAllData()).thenReturn(new int[] {15});
		assertEquals(15, impl.getHighestFromData());
	}
	
	@Test
	public void testGetHighestNoValues() {
		Mockito.when(mockService.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, impl.getHighestFromData());
	}
}
