package wyc.test;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class SpringTest {


	public static void main(String[] args) throws InterruptedException {
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		AnnotatedBeanDefinition definition = new AnnotatedGenericBeanDefinition(SpringTest.class);
		factory.registerBeanDefinition("test", definition);

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		String[] names = factory.getBeanDefinitionNames();
		Iterator<String> it = factory.getBeanNamesIterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			System.out.println(factory.getBean(name));
		}

		System.out.println(factory);*/

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();


		while (true) {
			synchronized (SpringTest.class) {
				SpringTest.class.wait();

			}
		}

	}
}