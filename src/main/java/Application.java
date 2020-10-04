
import java.io.IOException;
import java.util.Properties;
import model.KeyBoard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BeanFactory xmlApplicationContext = new ClassPathXmlApplicationContext("springCfg.xml");
        //        ClassPathXmlApplicationContext xmlApplicationContext =
        //        new ClassPathXmlApplicationContext("springCfg.xml");
        KeyBoard keyBordMeh = (KeyBoard) xmlApplicationContext.getBean("KeyBoardMechanics");
        KeyBoard keyBoardMem = (KeyBoard) xmlApplicationContext.getBean("KeyBoardMembrane");
        keyBoardMem.type("fasd");
        keyBordMeh.type("fdas");
        System.out.println(keyBoardMem.getKeyBoardType());
        System.out.println(keyBordMeh.getKeyBoardType());

        Properties properties = new Properties();
        properties.load(Application.class.getResourceAsStream("props.properties"));
        KeyBoard keyBoard = (KeyBoard) xmlApplicationContext.getBean(
                Class.forName(properties.getProperty("mem"))
        );
        System.out.println(keyBoard.getKeyBoardType());
    }
}
