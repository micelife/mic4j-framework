package org.mic4j.framework.core.util;

import org.mic4j.framework.exception.Mic4jException;

/**
 * class load util
 * 
 * @since 1.0.0
 * @version 1.0.0
 * @author MiceLife
 * @time 2016年6月8日 下午3:45:00
 */
public class LoadClassUtil {
	private static final Boolean DEFAULT_INIT_FLAG = Boolean.FALSE;

	/**
	 * load the class with full classPath
	 * 
	 * @param className
	 * @return
	 */
	public static Class<?> loadClass(String className) {
		return loadClass(className, DEFAULT_INIT_FLAG);
	}

	/**
	 * load the class with full classPath
	 * 
	 * @param className
	 * @param isInit
	 * @return
	 */
	public static Class<?> loadClass(String className, Boolean isInit) {
		return loadClass(className, isInit, getDefaultClassLoader());
	}

	/**
	 * load the class with full classPath
	 * 
	 * @param className
	 *            full classPath
	 * @param isInit
	 * @param classLoader
	 * @return
	 */
	public static Class<?> loadClass(String className, Boolean isInit, ClassLoader classLoader) {
		try {
			isInit = isInit == null ? DEFAULT_INIT_FLAG : isInit;
			return Class.forName(className, isInit, classLoader);
		} catch (ClassNotFoundException e) {
			throw new Mic4jException(String.format("Can't Find the Class:[%s]", className), e);
		}
	}

	private static ClassLoader getDefaultClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
}
