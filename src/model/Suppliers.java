package model;

public class Suppliers {
	
	private String name;
    private String rut;
    private String address;
    private String phone;
    private String pageWeb;
    
	public Suppliers(String name, String rut, String address, String phone, String pageWeb) {
		super();
		this.name = name;
		this.rut = rut;
		this.address = address;
		this.phone = phone;
		this.pageWeb = pageWeb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPageWeb() {
		return pageWeb;
	}

	public void setPageWeb(String pageWeb) {
		this.pageWeb = pageWeb;
	}
	
	@Override
	public String toString() {
	    return name+ ", " + rut + ", " + address + ", " + phone + ", "+ pageWeb + ".";
	}
}
