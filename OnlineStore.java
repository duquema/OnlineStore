public class OnlineStore
{
	public static void main (String[] args)
	{
		Customer jackson = new Customer("Jackson", "jackson@jackson.com");

		Item item1 = new Item("Wig", 12345, 1699);
		Item item2 = new Item("Banana", 43215, 225);
		Item item3 = new Item("Maga hat", 85673, 3599);
		Item item4 = new Item("Wax", 97852, 1499);
		
		Item[] jacksonOrder = {item1, item2, item3, item4};
		
		Order one = new Order(jacksonOrder, jackson);

		System.out.println(one);
	}

}