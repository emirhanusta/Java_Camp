package Practice2.business.abstracts;

import Practice2.entities.concretes.Customer;

public interface CustomerCheckService {
	public boolean isCustomerValid(Customer customer);
}
