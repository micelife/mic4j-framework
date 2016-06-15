package org.mic4j.framework.core.util;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ClassHelper {
	private final static String BASE_PACKAGE_FRAMEWORK = "org.mic4j.framework";
	private final static ConcurrentHashMap<String, List<Class<?>>> classMapCache = new ConcurrentHashMap<String, List<Class<?>>>();

	static {
		getClass(BASE_PACKAGE_FRAMEWORK);
	}

	public static List<Class<?>> getClass(String pckPath) {
		if (classMapCache.containsKey(pckPath))
			return classMapCache.get(pckPath);

		List<Class<?>> theList = null;
		classMapCache.put(pckPath, theList);

		return theList;
	}

	public static List<Class<?>> getSubClass(String pckPath, Class<?> superClass) {
		return null;
	}
}
