package br.ce.qxm.calculatorService.interfaces;

import br.ce.qxm.calculatorService.util.MyException;

public interface CalculatorServiceInterface {

	public String sum(double number, double number2);

	public String subtract(double number, double number2);

	public String multiply(double number, double number2);

	public String division(double dividend, double divisor) throws MyException;

}
