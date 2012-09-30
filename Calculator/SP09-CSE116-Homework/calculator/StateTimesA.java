package calculator;

public class StateTimesA implements IState {
	
	private Calculator _calculator;
	private int _value;
		
	public StateTimesA(Calculator calculator, int left) {
		_calculator = calculator;
		_value = left;
	}

	@Override
	public void pressClearKey() {
		_calculator.setState(new StateInitA(_calculator,0));
	}

	@Override
	public void pressDigitKey(int digit) {
		_calculator.setState(new StateTimesB(_calculator, digit,_value));
	}

	@Override
	public void pressDivideKey() {
		// Double Operand
		_calculator.setState(new StateError(_calculator));

	}

	@Override
	public void pressEqualsKey() {
		// Double Operand
		_calculator.setState(new StateError(_calculator));
	}

	@Override
	public void pressMinusKey() {
		// Double Operand
		_calculator.setState(new StateError(_calculator));
	}

	@Override
	public void pressPlusKey() {
		// Double Operand
		_calculator.setState(new StateError(_calculator));
	}

	@Override
	public void pressTimesKey() {
		// Repeated Operator - Do nothing
	}

	@Override
	public int getValue() {
		return _value;
	}

}
