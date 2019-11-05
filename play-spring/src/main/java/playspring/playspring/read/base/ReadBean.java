package playspring.playspring.read.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadBean {
    public static void main(String[] args) {
        // 创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    }
}
