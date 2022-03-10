package Practice2.business.abstracts;

import Practice2.entities.concretes.Campaign;

public interface CampaignService {
	public void add(Campaign campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);
	public double priceAfterDiscount(double discount);

}
