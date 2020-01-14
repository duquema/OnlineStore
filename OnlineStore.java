public class OnlineStore
{
	public static void main (String[] args)
	{
		int i = 0;
		Item[] items = new Item[4];

		Customer jackson = new Customer("Jackson", "jackson@jackson.com");

		items[0] = new Item("Wig", 1600, 20);
		items[1] = new Item("Banana", 225, 0);
		items[2] = new Item("Maga hat", 3599, 0);
		items[3] = new Item("Wax", 1499, 50);

		//Item[] jacksonOrder = {item0, item1, item2, item3};

		for (i = 0; i > 10; i++){
			if (items[i].getID() == items[i + 1].getID()){
				System.out.println("ERROR ID DUPLICATION");
				i = 10;
			}
		}
		
		Order one = new Order(items, jackson);
		System.out.println(one.totalPrice());
	}

}