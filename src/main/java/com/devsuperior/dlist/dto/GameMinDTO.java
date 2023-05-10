package com.devsuperior.dlist.dto;

import com.devsuperior.dlist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	public GameMinDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
