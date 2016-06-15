package org.mic4j.framework.bean;

import java.util.Set;

public class BeanInfo<T> {

	private Class<T> beanClass;
	private Set<T> beanObjects;
	private T defaultInstance;

	public Class<T> getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class<T> beanClass) {
		this.beanClass = beanClass;
	}

	public T getDefaultInstance() {
		return defaultInstance;
	}

	public void setDefaultInstance(T defaultInstance) {
		this.defaultInstance = defaultInstance;
	}

	public Set<T> getBeanObjects() {
		return beanObjects;
	}

	public void setBeanObjects(Set<T> beanObjects) {
		this.beanObjects = beanObjects;
	}

}
