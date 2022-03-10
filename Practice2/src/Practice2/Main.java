package Practice2;

import Practice2.business.concretes.CampaignManager;
import Practice2.business.concretes.CustomerManager;
import Practice2.entities.concretes.Campaign;
import Practice2.entities.concretes.Customer;

public class Main {
	public static void main(String[] args) {

		CustomerManager customerManager=new CustomerManager();
		Customer customer1=new Customer("12345","emirhan","usta","08/02/2001");
		customerManager.add(customer1);
		
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign1=new Campaign("1", "everything is half price", 50.0);
		campaignManager.add(campaign1);
	}
}
