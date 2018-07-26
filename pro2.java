class Product
{
	private int product_id,category_id,unit_price;
	private String product_name;
	public void setProductId(int a)
	{
		product_id=a;		
	}
	public void getproduct_id()
	{
		return product_id;
	}
	public void setProductName(String  a)
	{
		product_name=a;		
	}
	public void getProduct_Name()
	{
		return product_name;
	}
	public void setCategoryId(int a)
	{
		category_id=a;		
	}
	public String getProduct_Name()
	{
		return category_id;
	}
	public void setUnitPrice(int a)
	{
		unit_price=a;		
	}
	public int  getProduct_Price()
	{
		return product_price;
	}
	
}
class ElectricalProduct extends Product
{
	private float voltage_range,wattage;
	public void setvoltage_range(int a)
	{
		voltage_range=a;		
	}
	public float getVoltage_Range()
	{
		return voltage_range;
	}
	public void setwattage(int a)
	{
		 wattage=a;
	}
	public float getWattage()
	{
		
		return wattage;
	}
	
}