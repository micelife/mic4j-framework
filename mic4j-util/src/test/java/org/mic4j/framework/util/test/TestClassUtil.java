package org.mic4j.framework.util.test;

import org.mic4j.framework.exception.Mic4jException;
import org.mic4j.framework.util.base.ClassUtil;

public class TestClassUtil {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<Mic4jException> theDateClass = (Class<Mic4jException>) ClassUtil.loadClass("org.mic4j.framework.exception.Mic4jException");
		System.out.println(theDateClass.getName());
	}
}
