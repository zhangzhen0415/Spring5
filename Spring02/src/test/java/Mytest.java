import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class Mytest {
    public static void main(String[] ags) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
