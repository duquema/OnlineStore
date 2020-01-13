class Order
{
	private int itemNumber;
	private Item[] itemList = 0;
	private int totalCost;

	public Order()
	{
		this.itemNumber = 0;
	}

	public void addItem(Item item)
	{
		this.itemList[numberOfItems] = item;
		this.numberOfItems += 1;
  }

  public int calculateCost()
		{
			this.totalCost = 0;
			int subTotal = 0;
      for (int i = 0; i < this.itemNumber; i++){
				this.subTotal += this.itemList[i].getPrice();
			}
			this.totalCost = subTotal + (int)(subTotal * 0.08);
			return this.totalCost;
		}

  public String summary(){
		String summary ="";
  	for( int x =0; x<this.numberOfItems; x++){
			summary += this.itemList.getName + "\t" + this.itemList.getID + "\t" + this.itemList.getPrice;
        }
    }

}
