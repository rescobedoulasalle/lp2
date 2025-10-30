package hola;

import java.util.Date;

public class Student {
	
	String names;
	String surnames;
	Boolean gender;
	Date birth;
	
	
	
	public Student(String names, String surnames) {
		super();
		this.names = names;
		this.surnames = surnames;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
	

}
