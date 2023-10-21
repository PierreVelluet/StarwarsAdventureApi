package com.peyo.StarwarsAdventureApi.entity;

import java.util.ArrayList;
import java.util.List;

public class StarwarsApiTypeResponse {

	public StarwarsApiTypeResponse(StarwarsEntity starwarsEntity) {
		this.data.add(starwarsEntity);
	}

	private List<StarwarsEntity> data = new ArrayList<StarwarsEntity>();

	public List<StarwarsEntity> getData() {
		return data;
	}

	public void setData(List<StarwarsEntity> data) {
		this.data = data;
	}

	public void setType(String type) {
		for (StarwarsEntity swEntity : data)
			swEntity.setType(type);
	}
}
