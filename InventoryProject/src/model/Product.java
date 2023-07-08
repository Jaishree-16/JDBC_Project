package model;

public class Product
{
  private int productId;
  private String productName;
  private int minSellQunatity;
  private int price;
  private int quantity;
public int getProductId()
{
	return productId;
}
public void setProductId(int productId)
{
	this.productId = productId;
}
public String getProductName() 
{
	return productName;
}
public void setProductName(String productName)
{
	this.productName = productName;
}
public int getMinSellQunatity()
{
	return minSellQunatity;
}
public void setMinSellQunatity(int minSellQunatity) 
{
	this.minSellQunatity = minSellQunatity;
}
public int getPrice()
{
	return price;
}
public void setPrice(int price)
{
	this.price = price;
}
public int getQuantity()
{
	return quantity;
}
public void setQuantity(int quantity)
{
	this.quantity = quantity;
}
  
}
