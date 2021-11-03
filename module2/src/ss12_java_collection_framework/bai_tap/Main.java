package ss12_java_collection_framework.bai_tap;

public class Main {

    public static void main(String[] args) {
	    Product product1= new Product(1,"Nokia", 20);
		Product product2= new Product(2,"Samsung", 10);
		Product product3= new Product(3,"Iphone", 50);
		Product product4= new Product(4,"TV", 60);
		Product product5= new Product(5,"LG", 40);
		Product product6= new Product(6,"LG", 80);
	    ProductManager productManager= new ProductManager();

	    productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		productManager.add(product4);
		productManager.add(product5);
		productManager.add(product6);

		System.out.println("Before update:");
		productManager.display();

		System.out.println("After update:");
		productManager.updateById(3, "New Iphone", 300);
		productManager.display();

//		productManager.update(product3, "Iphone 13", 500);
//		productManager.delete(product1);

//	    boolean res= productManager.searchByName("Samsung123");
//
//		System.out.println(res);
//
//		System.out.println(productManager.seaarch(product3));
    }
}
