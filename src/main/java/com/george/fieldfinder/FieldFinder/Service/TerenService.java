package com.george.fieldfinder.FieldFinder.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.george.fieldfinder.FieldFinder.Model.TerenModel;

@Service
public class TerenService {

	
	TerenModel teren;
	static List<TerenModel> terenuri;
	Connection con;
	Statement stm;
	
	
	/*
	 * static {
	 * 
	 * terenuri=new ArrayList<TerenModel>();
	 * 
	 * terenuri.add(new TerenModel(1,"Complex Regie", 6,
	 * "str. Splaiul Independentei, nr. 290", "Loc fain de jucat folbal", ""));
	 * terenuri.add(new TerenModel(2,"Belvedere Teren", 6, "str. Jmecherei",
	 * "Blana", "")); terenuri.add(new TerenModel(3,"Complex Obor", 3,
	 * "str. Locatarilor", "100m2", "")); terenuri.add(new
	 * TerenModel(4,"Centru Vechi", 1, "str. Frecatzei de deal", "Multi tigani",
	 * "")); }
	 */
	
	public List<TerenModel> getAll() {
		
		
		try {
			
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:mem:testdb","sa","");
			System.out.println("Connection bines");
			
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM teren_model");
			
			terenuri = new ArrayList<TerenModel>();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				int sector = rs.getInt("SECTOR");
				String adresa = rs.getString("ADRESS");
				String sport = rs.getString("SPORT");
				String description = rs.getString("DESCRIPTION");
				String img = rs.getString("IMG");
				
				terenuri.add(new TerenModel(id, name, sport, sector, adresa, description, img));
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return terenuri;
	}
	
	public List<TerenModel> getTerenBySector(int sector, String sport){
		List<TerenModel> tempList = new ArrayList<>();
		
		for(TerenModel t: terenuri) {
			if(sector == t.getSector() && sport.equals(t.getSport())) {
				tempList.add(t);
			}
		}
		
		return tempList;
	}
	
	
	public TerenModel getTerenById(int id) {
		TerenModel temp = new TerenModel();
		
		for(TerenModel t: terenuri) {
			if(id == t.getId()) {
				temp = t;
			}
		}
		
		return temp;
	}
}
