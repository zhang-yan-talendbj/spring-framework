package source.source.spring.ch5;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class CircularDependencyTest {

	@Test()
	public void test() throws Throwable {
		ClassPathResource classPathResource = new ClassPathResource("CircularDependency.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
			TestA f = (TestA) xmlBeanFactory.getBean("a");
	}

}
