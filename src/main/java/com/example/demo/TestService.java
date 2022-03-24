package com.example.demo;

import org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TestService {

	Collection<TestInterface> loadServices() {
		ClassLoaderServiceImpl classLoaderService = new ClassLoaderServiceImpl();
		return classLoaderService.loadJavaServices(TestInterface.class);
	}

}
