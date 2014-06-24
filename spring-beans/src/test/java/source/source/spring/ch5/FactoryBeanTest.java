package source.source.spring.ch5;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class FactoryBeanTest {

	@Test
	public void test() {
		ClassPathResource classPathResource = new ClassPathResource("ch5.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
		Car f = (Car) xmlBeanFactory.getBean("car");
		System.out.println(f.getBrand());
	}

}
