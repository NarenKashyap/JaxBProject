package org.testlist;

public class Address {
	// require to add an id
	private String id; // gette/setter-- modified again
	private String name;// set name -- modified  
	private String city;//set city-- city is modified -- modified again due to country
	private String country; // set country again
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
