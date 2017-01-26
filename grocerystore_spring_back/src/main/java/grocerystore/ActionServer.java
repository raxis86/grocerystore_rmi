package grocerystore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by raxis on 26.01.2017.
 */
public class ActionServer {
    private static final Logger logger = LoggerFactory.getLogger(ActionServer.class);

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("appContext.xml");
    }
}
