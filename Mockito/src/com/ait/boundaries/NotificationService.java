package com.ait.boundaries;

import com.ait.users.User;

public interface NotificationService {
	void notifyAdmin(final User user, final String message);
}
