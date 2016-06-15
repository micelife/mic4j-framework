package org.mic4j.framework.bean;

public class BeanDefinition {
	private Class<?> beanClass;
	private String nameAlias;// alias
	private Object boject;// the obj ref
	private Boolean isDefaultInstance = Boolean.FALSE;// is default instance ?

	public Object getBoject() {
		return boject;
	}

	public void setBoject(Object boject) {
		this.boject = boject;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Class<?> getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	public Boolean getIsDefaultInstance() {
		return isDefaultInstance;
	}

	public void setIsDefaultInstance(Boolean isDefaultInstance) {
		this.isDefaultInstance = isDefaultInstance;
	}

}
