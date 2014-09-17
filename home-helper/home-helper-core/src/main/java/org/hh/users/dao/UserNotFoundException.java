package org.hh.users.dao;

/**
 * Бросается в случае, когда запрашиваемый пользователь не найден.
 */
public class UserNotFoundException extends Exception {

    private static final long serialVersionUID = 5940190815656240023L;

    public UserNotFoundException(Throwable ex) {
        super(ex);
    }

}
