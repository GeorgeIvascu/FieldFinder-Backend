package com.george.fieldfinder.FieldFinder.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TerenModel {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String sport;
	@Column
	private int sector;
	@Column
	private String adress;
	@Column
	private String description;
	@Column
	private String img;
	
	public TerenModel() {}
	
	
	
	public TerenModel(int id, String name, int sector, String adress, String description, String img) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.adress = adress;
		this.description = description;
		this.img = img;
	}
	
	



	public TerenModel(int id, String name, String sport, int sector, String adress, String description, String img) {
		super();
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.sector = sector;
		this.adress = adress;
		this.description = description;
		this.img = img;
	}



	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}



	@Override
	public String toString() {
		return "TerenModel [id=" + id + ", name=" + name + ", sport=" + sport + ", sector=" + sector + ", adress="
				+ adress + ", description=" + description + ", img=" + img + "]";
	}


	
	
	
	
	
}
