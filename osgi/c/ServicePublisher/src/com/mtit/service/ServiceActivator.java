package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.mtit.service.CurrencyConverter;
import com.mtit.service.CurrencyConverterImpl;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Currency Converter Start");
		CurrencyConverter publisherService = new CurrencyConverterImpl();
		publishServiceRegistration = context.registerService(CurrencyConverter.class.getName(), publisherService, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Currency Converter Stop");
		publishServiceRegistration.unregister();
	}
}
