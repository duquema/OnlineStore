class Customer
{
	private String name;
	private String email;
	private Order order;

	public Customer(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public String getName()
	{
		return this.name;
	}

	public String getEmail()
	{
		return this.email;
	}

}
