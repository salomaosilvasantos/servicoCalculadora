package br.ce.qxm.calculatorService.interfaces;

import br.ce.qxm.calculatorService.util.MyException;

public interface CalculatorInterface {

	public double sum(double number, double number2);

	public double subtract(double number, double number2);

	public double multiply(double number, double number2);

	public double division(double dividend, double divisor) throws MyException;

}
