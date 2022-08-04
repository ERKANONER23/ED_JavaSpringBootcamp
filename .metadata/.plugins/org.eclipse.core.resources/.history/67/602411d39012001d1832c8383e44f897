package oop;

public class OopInfo {

	public static void main(String[] args) {

		String[] name = { "lenovo v14", "lenovo v15", "hp gaming 3" };
		int[] unitsInStock = { 10, 5, 7 };

		for (int i = 0; i < name.length; i++) {
			System.out.println("name : " + name[i] + " stok : " + unitsInStock[i]);
		}

		Product product1 = new Product(); // ornek olusutma referans olusturma instance denebilir
		product1.id = 1;
		product1.name = "Lenovo v15";
		product1.detail = "i5 Islemci 16GB ram";
		product1.unitPrice = 15000.4;

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo v14";
		product2.detail = "128 gb ssd";
		product2.unitPrice = 14000;

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "HP 14";
		product3.detail = "Gaming Notebook";

		Product[] products = { product1, product2, product3 };
		System.out.println("product dizi uzunlugu :" + products.length);

		for (Product product : products) {
			System.out.println(product.id);
			System.out.println(product.name);
			System.out.println(product.detail);
			System.out.println(product.unitPrice);
		}

	}

}
