package org.mic4j.framework.core.itf;

/**
 * bean container
 * 
 * @since 1.0.0
 * @version 1.0.0
 * @author MiceLife
 * @time 2016年6月15日 下午4:50:39
 */
public interface BeanContainer extends Container {

	/**
	 * get by beanType
	 * 
	 * @param type
	 * @return T
	 */
	public <T> T getBean(Class<T> type);

	/**
	 * get by name
	 * 
	 * @param name
	 * @return object
	 */
	public Object getBean(String name);

}
