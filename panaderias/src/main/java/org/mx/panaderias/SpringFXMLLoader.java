package org.mx.panaderias;

import java.io.InputStream;

import javafx.fxml.FXMLLoader;
import javafx.util.Callback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFXMLLoader {
	ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-config.xml");
	
	public Object load(String url) {
		try {
			InputStream fxmlStream = this.getClass().getResourceAsStream(url);
			FXMLLoader loader = new FXMLLoader();
			loader.setControllerFactory(new Callback<Class<?>, Object>() {
				@Override
				public Object call(Class<?> arg0) {
					return appContext.getBean(arg0);
				}
			});
			return loader.load(fxmlStream);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
