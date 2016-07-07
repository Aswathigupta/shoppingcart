package com.niit.shoppingcart;

public class Testproduct {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setProdID("P123");
		product.setProdname("COMPUTER");
		product.setProdprice(-25000);
		
		System.out.println(product.getProdID());
		System.out.println(product.getProdname());
		System.out.println(product.getProdprice());
	}

}
