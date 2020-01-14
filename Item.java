class Item
{
	private String name;
	private int id;
	private int price;
	private int sale;
	private int i = 0;

	public Item(String name, int price, int sale)
	{
		this.name = name;
		this.price = price;
		this.sale = sale;
	}

	public int getPrice()
	{
		if (sale > 0.0){
			price *= (1 - sale * .01);
		}
		return this.price;
	}

	public int getID()
	{
		id = 1000 + i;

		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public int getSale()
	{
		return this.sale;
	}

}
