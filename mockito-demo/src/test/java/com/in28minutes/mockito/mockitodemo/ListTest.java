package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void test() {
	
	List list = Mockito.mock(List.class);
	assertEquals(10, list.size());
	}

}
