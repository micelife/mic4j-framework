package org.mic4j.framework.exception;

public class Mic4jException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String msg;

	public Mic4jException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public Mic4jException(String msg, Throwable cause) {
		super(msg, cause);
		this.msg = msg;
	}

}
