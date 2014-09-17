package org.hh.users.bp;

import java.util.List;

import org.hh.users.dao.UserExistsException;
import org.hh.users.dao.UserNotFoundException;
import org.hh.users.dto.Role;
import org.hh.users.dto.User;

/**
 * Главный интерфейс для модуля управления пользователями и безопасностью.
 */
public interface UserManagementBP {

    /**
     * Возвращает пользователя по строке с адресом эл. почты
     * 
     * @param email адрес пользователя
     * @return объект User
     * @throws UserNotFoundException если пользователя с таким адресом не существует
     */
    public User getUserByEmail(String email) throws UserNotFoundException;

    /**
     * Проверяет пароль пользователя с заданым адресом.
     * 
     * @param email адрес пользователя
     * @param password пароль пользователя
     * @return объект User в случае, когда адрес и пароль соответствуют пользователю в системе
     * @throws InvalidLoginOrPasswordException в случае, когда логин и пароль не совпадают
     */
    public User login(String email, String password) throws InvalidLoginOrPasswordException;

    /**
     * Создает пользователя с заданым адресом почты.
     * 
     * @param email адрес пользователя
     * @return созданного пользователя
     * @throws UserExistsException в случае, когда уже существует пользователь с таким адресом
     */
    public User createUser(String email, String name, boolean craftsman) throws UserExistsException;

    /**
     * Возвращает всех пользователей в системе
     * 
     * @return List&lt;User&gt; - список всех пользователей
     * @throws UserNotFoundException
     */
    public List<User> getAllUsers() throws UserNotFoundException;
    
    public User changePassword(String email, String password);
    
    public User changeStatusToBlocked (String email, boolean blocked);
    
    public User overwriteUser(User user);
    
}
