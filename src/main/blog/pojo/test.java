package blog.pojo;

import blog.dao.userDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ENVY HP on 2016/5/1.
 */
    public class test {
        private static ApplicationContext ac;
        static {
            ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        }

        public static void main(String[] args) {
            userDao mapper = (userDao) ac.getBean("userDao");
            System.out.println("获取");
            User user = mapper.selectByName("sun");

            System.out.println(user.getId()+":"+"username:"+user.getUsername());
            System.out.println("password:"+user.getPassword());

        }
    }
