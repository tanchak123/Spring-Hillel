# My homeWork description
* Create abstract entity KeyBoard with getters and setters,with usual void type and ine abstract void.
* Create two classes extenders which set our keyboardType
* Configuration of springCfg.xml.
* Create class Application with testing of out beans.
* It works. Let's get bean object from AppContext or BeanFactory with our props file.
* Add checkStyle and compile plugins.
### DIFFERENCE beetwen BeanFactory and AppContext:

1. BeanFactory instantiate bean when you call getBean() method while ApplicationContext instantiate Singleton bean when container is started, It doesn't wait for getBean() to be called.

2. BeanFactory doesn't provide support for internationalization but ApplicationContext provides support for it.

3. Another difference between BeanFactory vs ApplicationContext is ability to publish event to beans that are registered as listener.

4. One of the popular implementation of BeanFactory interface is XMLBeanFactory while one of the popular implementation of ApplicationContext interface is ClassPathXmlApplicationContext.

5. If you are using auto wiring and using BeanFactory than you need to register AutoWiredBeanPostProcessor using API which you can configure in XML if you are using ApplicationContext. In summary BeanFactory is OK for testing and non production use but ApplicationContext is more feature rich container implementation and should be favored over BeanFactory

6. BeanFactory by default its support Lazy loading and ApplicationContext by default support Aggresive loading.