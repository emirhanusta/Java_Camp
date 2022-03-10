package Practice2.entities.concretes;

import Practice2.entities.abstracts.Entity;

public class Game implements Entity{
	private String gameId;
	private String name;
	private String price;
	public Game(String gameId, String name, String price) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.price = price;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
