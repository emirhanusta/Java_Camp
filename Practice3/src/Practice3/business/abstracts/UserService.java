package Practice3.business.abstracts;

import Practice3.entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	
}
