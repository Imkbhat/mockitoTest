package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	
	
	public SomeBusinessImpl(DataService dataService) {
		this.dataService = dataService;
	}

	int getHighestFromData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		if (null != data) {
			for (int num : data) {
				if (num > greatest)
					greatest = num;
			}
		}
		return greatest;
	}
}