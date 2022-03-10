package Practice2.business.concretes;

import Practice2.business.abstracts.GameService;
import Practice2.entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game updated-> "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game updated-> "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated-> "+game.getName());
		
	}

}
