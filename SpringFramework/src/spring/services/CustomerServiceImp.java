package spring.services;

public  class CustomerServiceImp implements CustomerService{
	

	@Override
	public double dispaly(int id, String name, double salary) {
		
		salary=salary+10;
		name=name+"sasikumar";
		id=id+1;
		System.out.println("CustomerServiceImplementation is working"+salary+name+id );
		return (salary);
		
	}
}
