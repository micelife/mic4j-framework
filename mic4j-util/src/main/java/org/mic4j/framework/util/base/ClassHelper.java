package org.mic4j.framework.util.base;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassHelper {
	private final static String BASE_PACKAGE_FRAMEWORK = "org.mic4j.framework";
	private final static Map<String, List<Class<?>>> classMapCache = new ConcurrentHashMap<String, List<Class<?>>>();

	static {
		getClass(BASE_PACKAGE_FRAMEWORK);
	}

	public static List<Class<?>> getClass(String pckPath) {
		return null;
	}

	public static List<Class<?>> getSubClass(String pckPath, Class<?> superClass) {
		return null;
	}
}
