package Practice2.business.abstracts;

import Practice2.entities.concretes.Customer;

public interface CustomerService {
	public void add(Customer customer);
	public void delete(Customer customer);
	public void update(Customer customer);

}
