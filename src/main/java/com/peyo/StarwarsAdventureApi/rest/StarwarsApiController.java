package com.peyo.StarwarsAdventureApi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.peyo.StarwarsAdventureApi.entity.StarwarsEntity;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class StarwarsApiController {

	private static String apiBaseUri = "https://starwars-databank-server.vercel.app/api/v1/";

	@GetMapping(path = "/entity/{entityType}")
	public static @ResponseBody List<StarwarsEntity> getEntitiesByType(@PathVariable("entityType") String entityType) {

		return StarwarsEntity.fetchEntities(apiBaseUri, entityType);
	}

	@GetMapping(path = "/entity/{entityType}/{entityId}")
	public static @ResponseBody List<StarwarsEntity> getEntityByTypeAndId(
			@PathVariable("entityType") String entityType, @PathVariable("entityId") String entityId) {
		
		return StarwarsEntity.fetchEntities(apiBaseUri, entityType, entityId);
	}
}
