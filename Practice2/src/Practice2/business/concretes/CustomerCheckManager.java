package Practice2.business.concretes;

import Practice2.business.abstracts.CustomerCheckService;
import Practice2.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean isCustomerValid(Customer customer) {
		
		return true;
	}

}
