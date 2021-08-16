package com.techment.dao;

import java.util.Map;

import com.techment.models.Train;
import com.techment.util.TrainCollection;

public class TrainDaoImpl implements ITrainDao{

//	TrainCollection trainCollection = new TrainCollection();
	Map<Integer , Train> trains = TrainCollection.getTrainsMap();
	@Override
	public Train findTrain(int trainNo) {
		for(Integer trainkeys : trains.keySet()) {
			if(trainkeys.equals(trainNo))
				return trains.get(trainNo);
		}
		return null;
	}
}
