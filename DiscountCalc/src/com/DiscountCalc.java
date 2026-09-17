package com;

public class DiscountCalc 
{
	int unitPrice;//商品單價
	int quantity;//購買數量
	int Amount;//應付金額
	double finalTotal;//折扣後金額
	int gift;//贈品
	static double totalSales;//總營業額
	
	
	public DiscountCalc(int unitPrice, int quantity) 
	{
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		
		Amount=this.unitPrice*this.quantity;
		
		//1000九折
		if(Amount>=1000)
		{
			finalTotal=Amount*0.9;
		}
		else
		{
			finalTotal=Amount;
		}
		//500贈品加一
		gift=(int)(finalTotal/500);
		
		totalSales=totalSales+this.finalTotal;
	
	}
	
	

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public double getFinalTotal() {
		return finalTotal;
	}

	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}

	public int getGift() {
		return gift;
	}

	public void setGift(int gift) {
		this.gift = gift;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	public String show()
	{
		return ("==訂單結帳明細=="+
				"\n應付金額："+Amount+"元"+
				"\n折扣後金額："+finalTotal+"元"+
				"\n滿一千打九折"+
				"\n贈品："+gift+"份"+
				"\n消費滿500贈送贈品一個"+
				"\n全店總營業額："+totalSales+"元");
	}
	
	
}
