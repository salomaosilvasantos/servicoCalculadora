package br.ce.qxm.calculatorService.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.ce.qxm.calculatorService.interfaces.CalculatorServiceInterface;
import br.ce.qxm.calculatorService.logic.Calculator;
import br.ce.qxm.calculatorService.util.MyException;

@Path(value = "service/calculator")
public class CalculatorService implements CalculatorServiceInterface {

	private Calculator calculator;

	public CalculatorService() {
		super();
		this.calculator = new Calculator();

	}

	@GET
	@Path("/sum/{number}/{number2}")
	@Produces("application/json")
	public String sum(@PathParam("number") double number,
			@PathParam("number2") double number2) {
		return String.valueOf(this.calculator.sum(number, number2));
	}
	@GET
	@Path("/subtract/{number}/{number2}")
	@Produces("application/json")
	public String subtract(double number, double number2) {
		return String.valueOf(this.calculator.subtract(number, number2));
	}
	@GET
	@Path("/multiply/{number}/{number2}")
	@Produces("application/json")
	public String multiply(@PathParam(value = "number") double number,
			@PathParam(value = "number2") double number2) {
		return String.valueOf(this.calculator.multiply(number, number2));
	}
	@GET
	@Path("/division/{number}/{number2}")
	@Produces("application/json")
	public String division(@PathParam(value = "dividend")double dividend, @PathParam(value = "divisor")double divisor) throws MyException {
		return String.valueOf(this.calculator.division(dividend, divisor));
	}

}
