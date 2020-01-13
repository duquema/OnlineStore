class Item
{
	private String name;
	private int id;
	private int price;

	public Item(String name, int id, int price)
	{
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public int getPrice()
	{
		return this.price;
	}

	public String getID()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

}
