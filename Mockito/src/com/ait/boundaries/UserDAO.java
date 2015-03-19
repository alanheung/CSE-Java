package com.ait.boundaries;

import com.ait.users.User;

public interface UserDAO {
	
	User findUser(final String userName);

}
