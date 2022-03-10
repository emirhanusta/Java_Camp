package Practice2.entities.concretes;

import Practice2.entities.abstracts.Entity;

public class Campaign implements Entity{
	private String campaignId;
	private String name;
	private double discount;
	
	public Campaign(String campaignId, String name, double discount) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.discount = discount;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
