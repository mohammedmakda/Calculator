package calculator;

public class StateAddDivideB implements IState {

	private Calculator _calculator;
	private int _addArg;
	private int _leftArg;
	private int _rightArg;

	public StateAddDivideB(Calculator calculator, int addArg, int left, int digit) {
		_calculator = calculator;
		_addArg = addArg;
		_leftArg = left;
		_rightArg = digit;
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
		_rightArg = _rightArg*10 + digit;
	}

	@Override
	public void pressDivideKey() {
		_calculator.setState(new StateAddDivideA(_calculator,_addArg,_leftArg/_rightArg));
	}

	@Override
	public void pressEqualsKey() {
		_calculator.setState(new StateInitA(_calculator,(_leftArg/_rightArg)+_addArg));
	}

	@Override
	public void pressMinusKey() {
		_calculator.setState(new StateSubA(_calculator,(_leftArg/_rightArg)+_addArg));
	}

	@Override
	public void pressPlusKey() {
		_calculator.setState(new StateAddA(_calculator,(_leftArg/_rightArg)+_addArg));
	}

	@Override
	public void pressTimesKey() {
		_calculator.setState(new StateAddTimesA(_calculator,_addArg,_leftArg/_rightArg));
	}
	
}
