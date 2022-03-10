package Practice2.business.concretes;

import Practice2.business.abstracts.CustomerService;
import Practice2.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Customer updated-> "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer updated-> "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated-> "+customer.getFirstName());
		
	}

}
