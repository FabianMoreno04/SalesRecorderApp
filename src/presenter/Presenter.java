package presenter;

import fileOperationsImpl.FileOperationsImpl;
import model.*;
import view.View;

public class Presenter {
	private FileOperationsImpl fileOperationsImpl;
	private Customers customers;
    private Products products;
    private Suppliers suppliers;
    private Category category;
    private RegisterSales registerSales;
    private View view;
	static final String CUSTOMERS = "./data/customers.txt";
	static final String PRODUCTS = "./data/products.txt";
	static final String SUPPLIERS = "./data/suppliers.txt";
	static final String CATEGORIES = "./data/categories.txt";
	static final String BILLS = "./data/bills.txt";

    public Presenter() {
        customers = new Customers(null,null,null,null);
        suppliers = new Suppliers(null,null,null,null,null);
        products = new Products(0, null, null, null);
        category = new Category(0, null, null);
        registerSales = new RegisterSales(0, null, null, 0, 0);
        fileOperationsImpl = new FileOperationsImpl();
        view = new View();
    }
    
    public void run() {
        this.menu();
    }

    public void menu() {
        int option = 0;
        while (option != 7) {
            option = showMenu();
            switch (option) {
                case 1:
                    addSuppliers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    addCategories();
                    break;    
                case 5:
                    registerSale();
                    break;
                case 6:
                    addInvoice();
                    break;
                case 7:
                    exit();
                    break;
            }
        }
    }


	

	private int showMenu() {
		int option = view.readInt("-----MENU PRINCIPAL----- "
				+ "\n1. Crear proveedor"
				+ "\n2. Crear cliente"
				+ "\n3. Crear producto"
				+ "\n4. Crear categoria"
				+ "\n5. Registrar venta"
				+ "\n6. Ventas totales"
				+ "\n7. Salir"
				+ "\nSeleccione...");
		return option;
	}


	  public void addCustomer() {
	        String name = view.readString("Nombres:");
	        String rut = view.readString("RUT:");
	        String address = view.readString("Direccion:");
	        String phone = view.readString("Telefono:");
	        customers = new Customers(name, rut, address, phone);
	        
	        fileOperationsImpl.write(CUSTOMERS, customers);
	        view.showMessage("\n!!!USUARIO CREADO!!!\n");

	    }

    public void addProduct() {
        int idProduct = view.readInt("Id del producto:");
        String nameProduct = view.readString("Nombre del producto:");
        String price = view.readString("Precio");
        String stock = view.readString("Stock");
        products = new Products(idProduct, nameProduct, price, stock);
        fileOperationsImpl.write(PRODUCTS, products);
        view.showMessage("\n!!!PRODUCTO CREADO!!!\n");
    }
    
    public void addSuppliers() {
        String name = view.readString("Nombres:");
        String rut = view.readString("RUT:");
        String address = view.readString("Direccion:");
        String phone = view.readString("Telefono:");
        String pageWeb= view.readString("Pagina web:");
        
        suppliers = new Suppliers(name, rut, address, phone, pageWeb);
        fileOperationsImpl.write(SUPPLIERS, suppliers);
        view.showMessage("\n!!!USUARIO CREADO!!!\n");

    }
    
    private void addCategories() {
    	int idCategory = view.readInt("Id de categoria:");
        String nameCategory = view.readString("Nombre de la categoria:");
        String description = view.readString("Descripcion:");
		category = new Category(idCategory, nameCategory, description);
		fileOperationsImpl.write(CATEGORIES, category);
		view.showMessage("\n!!!CATEGORIA CREADA!!!\n");
	}
    

	
	public void addInvoice(){
			
	}

	private void registerSale() {
		int id = view.readInt("Codigo de la factura:");
		String invoiceDate = view.readString("Fecha:");
		String nameCustomer = view.readString("Nombre del cliente:");
		int discount = view.readInt("descuento:");
		double valueTotal = view.readDouble("Valor total:");
		registerSales = new RegisterSales(id, invoiceDate, nameCustomer, discount, valueTotal);
		fileOperationsImpl.write(BILLS, registerSales);
		 view.showMessage("\n!!! FACTURA REGISTRADA!!!\n");

	}
	
	
    public void exit() {
        System.exit(0);
    }
    
    
    
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.run();
    }

}
