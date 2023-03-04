package model;

public class RegisterSales {

	private int id;
	private String InvoiceDate;
	private String nameCustomer;
	private int discount;
	private double valueTotal;

	public RegisterSales(int id, String invoiceDate, String nameCustomer, int discount, double valueTotal) {
		this.id = id;
		this.InvoiceDate = invoiceDate;
		this.nameCustomer = nameCustomer;
		this.discount = discount;
		this.valueTotal = valueTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvoiceDate() {
		return InvoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(double valueTotal) {
		this.valueTotal = valueTotal;
	}
	
	@Override
	public String toString() {
	   return id + ", " + InvoiceDate + ", " + nameCustomer + ", " + discount + ", " + valueTotal + ".";
	}
	
	
	
}
