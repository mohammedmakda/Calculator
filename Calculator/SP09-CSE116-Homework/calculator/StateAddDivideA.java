package calculator;

public class StateAddDivideA implements IState {

	private Calculator _calculator;
	private int _leftArg;
	private int _rightArg;

	public StateAddDivideA(Calculator calculator, int left, int right) {
		_calculator = calculator;
		_leftArg = left;
		_rightArg = right;
	}

	@Override
	public int getValue() {
		return _rightArg;
	}

	@Override
	public void pressClearKey() {
		_calculator.setState(new StateInitA(_calculator,0));
	}

	@Override
	public void pressDigitKey(int digit) {
		_calculator.setState(new StateAddDivideB(_calculator,_leftArg,_rightArg,digit));
	}

	@Override
	public void pressDivideKey() {
		// Repeated operator. Do nothing.
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
		// Double Operand
		_calculator.setState(new StateError(_calculator));
	}

}
