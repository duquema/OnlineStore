class Order
{
	private Customer customer;
	private Item[] itemList;

	public Order(Item[] items, Customer customer)
	{
		this.itemList = items;
		this.customer = customer;
	}

	public String totalPrice()
	{
		int totalPrice = 0;

		for (int i = 0; i < this.itemList.length; i++){
            totalPrice += itemList[i].getPrice();
        }

        return "Total Price: $" + ((totalPrice * 1.08) / 100.0);

	}

}
