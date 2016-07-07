package com.niit.shoppingcart;

public class Product {
	
	private String prodID;
	
	private String Prodname;
	
	private double prodprice;

	public String getProdID() {
		return prodID;
	}

	public void setProdID(String prodID) {
		this.prodID = prodID;
	}

	public String getProdname() {
		return Prodname;
	}

	public void setProdname(String prodname) {
		Prodname = prodname;
	}

	public double getProdprice() {
		   return prodprice;
			
			}

	public void setProdprice(double prodprice) {
		if(prodprice<0)
		{
		System.out.println("you can't enter negative value");
		this.prodprice=1000;
		} 
	else
	{
		this.prodprice = prodprice;
	}
		}
	
	
}
