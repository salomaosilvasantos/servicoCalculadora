package br.ce.qxm.calculatorService.logic;

import br.ce.qxm.calculatorService.interfaces.CalculatorInterface;
import br.ce.qxm.calculatorService.util.MyException;

public class Calculator implements CalculatorInterface {

	public double sum(double number, double number2) {
		// TODO Auto-generated method stub
		return number + number2;
	}

	public double subtract(double number, double number2) {
		// TODO Auto-generated method stub
		return number - number2;
	}

	public double multiply(double number, double number2) {
		// TODO Auto-generated method stub
		return number * number2;
	}

	public double division(double dividend, double divisor) throws MyException {
		// TODO Auto-generated method stub
		if (divisor != 0) {
			return dividend / divisor;
		}else{
			throw new MyException("Não é possivel realizar divisão por 0");
		}
		
	}

}
