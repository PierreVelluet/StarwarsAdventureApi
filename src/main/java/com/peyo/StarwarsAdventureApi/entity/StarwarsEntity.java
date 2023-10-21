package com.peyo.StarwarsAdventureApi.entity;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

public class StarwarsEntity {

	private String _id;
	private String name;
	private String description;
	private String image;
	private String type;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static List<StarwarsEntity> fetchEntities(String apiBaseUri, String entityType) {
		RestTemplate restTemplate = new RestTemplate();
		String urlString = String.format("%s%s", apiBaseUri, entityType);
		String json = restTemplate.getForObject(urlString, String.class);
		StarwarsApiTypeResponse response = new Gson().fromJson(json, StarwarsApiTypeResponse.class);
		response.setType(entityType);

		return response.getData();
	}

	public static List<StarwarsEntity> fetchEntities(String apiBaseUri, String entityType, String entityId) {
		RestTemplate restTemplate = new RestTemplate();
		String urlString = String.format("%s%s/%s", apiBaseUri, entityType, entityId);
		String json = restTemplate.getForObject(urlString, String.class);
		StarwarsApiTypeResponse response = new StarwarsApiTypeResponse(new Gson().fromJson(json, StarwarsEntity.class));
		response.setType(entityType);

		return response.getData();
	}

}
