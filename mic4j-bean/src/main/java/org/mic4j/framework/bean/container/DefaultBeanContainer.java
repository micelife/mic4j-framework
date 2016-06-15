package org.mic4j.framework.bean.container;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.mic4j.framework.bean.BeanInfo;
import org.mic4j.framework.core.itf.BeanContainer;
import org.mic4j.framework.core.util.LoadClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 默认的bean容器实现
 * 
 * @since 1.0.0
 * @version 1.0.0
 * @author MiceLife
 * @time 2016年6月15日 下午4:57:09
 */
@SuppressWarnings("unchecked")
public class DefaultBeanContainer implements BeanContainer {
	private Logger logger = LoggerFactory.getLogger(DefaultBeanContainer.class);

	/**
	 * key:class full path<br>
	 * val:class
	 */
	private final static ConcurrentHashMap<String, BeanInfo<?>> classMap = new ConcurrentHashMap<String, BeanInfo<?>>();

	public <T> T getBean(Class<T> type) {
		BeanInfo<?> beanInfo = classMap.get(type.getName());
		if (beanInfo == null) {
			beanInfo = tryLoadClass(type);
			if (beanInfo != null) {
				classMap.putIfAbsent(type.getName(), beanInfo);
			}
		}
		if (beanInfo == null) {
			logger.warn("Can not find instance by type [{}]", type);
			return null;
		}
		return (T) beanInfo.getDefaultInstance();
	}

	public Object getBean(String name) {
		Set<String> keySet = classMap.keySet();
		for (String key : keySet) {
			// key.toLowerCase().indexOf(str)
		}
		return null;
	}

	private <T> BeanInfo<T> tryLoadClass(Class<T> type) {
		T t = (T) LoadClassUtil.loadClass(type.getName(), Boolean.TRUE);
		if (t == null)
			return null;
		Set<T> beanSet = new HashSet<T>();
		beanSet.add(t);
		BeanInfo<T> beanInfo = new BeanInfo<T>();
		beanInfo.setBeanClass(type);
		beanInfo.setBeanObjects(beanSet);
		beanInfo.setDefaultInstance(t);
		return beanInfo;
	}

}
