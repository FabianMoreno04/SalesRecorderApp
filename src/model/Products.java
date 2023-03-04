package model;

public class Products {
    
        private int idProduct;
        private String nameProduct;
        private String price;
        private String stock;

    public Products(int IdProduct, String NameProduct, String Price, String Stock) {
        this.idProduct = IdProduct;
        this.nameProduct = NameProduct;
        this.price = Price;
        this.stock = Stock;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int IdProduct) {
        this.idProduct = IdProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String NameProduct) {
        this.nameProduct = NameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String Stock) {
        this.stock = Stock;
    }
    @Override
    public String toString() {
    	return idProduct+ ", " + nameProduct + ", " + price + ", " + stock + ".";
    }
}
