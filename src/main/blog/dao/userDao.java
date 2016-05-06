package blog.dao;

import blog.pojo.User;

/**
 * Created by ENVY HP on 2016/5/1.
 */
public interface userDao {
    public User selectById(int id);
    public User selectByName(String username);
}
