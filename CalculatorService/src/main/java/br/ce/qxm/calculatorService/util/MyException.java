package br.ce.qxm.calculatorService.util;

public class MyException extends Exception {

	private static final long serialVersionUID = -4443743859224602404L;
	String msg;

	public MyException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

}
