class Customer
{
	private String name;
	private String email;

	public Customer(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public static void main()
	{
		Customer jackson = new Customer("Jackson", "jackson@gmail.com");
	}
}