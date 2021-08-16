package com.techment.util;

import java.util.HashMap;
import java.util.Map;

import com.techment.models.Train;

public class TrainCollection {

	static Map<Integer, Train> trainsMap = new HashMap<Integer, Train>();
	
	static {
		trainsMap.put(1001, new Train(1001,"Shatabdi Express","Bangalore","Delhi",2500));
		trainsMap.put(1002, new Train(1002,"Shatabdi Express","Delhi","Bangalore",2500));
		trainsMap.put(1003, new Train(1003,"Udyan Express","Bangalore","Mumbai",1500));
		trainsMap.put(1004, new Train(1004,"Udyan Express","Mumbai","Bangalore",1500));
		trainsMap.put(1005, new Train(1005,"Brindavan Express","Bangalore","Chennai",1000));
		trainsMap.put(1006, new Train(1006,"Brindavan Express","Chennai","Bangalore",1000));
	}
	
	public static Map<Integer, Train> getTrainsMap(){
		return trainsMap;
	}
	
}
