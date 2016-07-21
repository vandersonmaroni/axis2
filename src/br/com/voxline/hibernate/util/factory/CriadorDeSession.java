package br.com.voxline.hibernate.util.factory;

import java.net.URL;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.AxisService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class CriadorDeSession {

	public static Session getSession() {
		Session session = getSessionFactory().openSession();
		return session;
	}

	private static SessionFactory getSessionFactory() {
		AxisService axisService = MessageContext.getCurrentMessageContext().getAxisService();
		ClassLoader serviceClassLoader = axisService.getClassLoader();
		URL configURL = serviceClassLoader.getResource("hibernate.cfg.xml");
		Configuration conf = new Configuration();
		conf.configure(configURL);
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties())
				.buildServiceRegistry();
		return conf.buildSessionFactory(serviceRegistry);
	}
}
