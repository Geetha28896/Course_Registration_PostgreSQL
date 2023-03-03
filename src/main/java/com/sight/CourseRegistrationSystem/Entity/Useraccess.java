package com.sight.CourseRegistrationSystem.Entity;

public class Useraccess {

	public Integer id;
    public String role;
    public String password;
    public boolean isverified;
    public boolean isenabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isIsverified() {
		return isverified;
	}
	public void setIsverified(boolean isverified) {
		this.isverified = isverified;
	}
	public boolean isIsenabled() {
		return isenabled;
	}
	public void setIsenabled(boolean isenabled) {
		this.isenabled = isenabled;
	}
    
    
    
}
