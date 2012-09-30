package calculator;

public class StateTimesB implements IState {

	private Calculator _calculator;
	private int _leftArg;
	private int _rightArg;

	public StateTimesB(Calculator calculator, int digit, int left) {
		_calculator = calculator;
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
		_calculator.setState(new StateDivideA(_calculator,_leftArg*_rightArg));
	}

	@Override
	public void pressEqualsKey() {
		_calculator.setState(new StateInitA(_calculator,_leftArg*_rightArg));
	}

	@Override
	public void pressMinusKey() {
		_calculator.setState(new StateSubA(_calculator,_leftArg*_rightArg));
	}

	@Override
	public void pressPlusKey() {
		_calculator.setState(new StateAddA(_calculator,_leftArg*_rightArg));
	}

	@Override
	public void pressTimesKey() {
		_calculator.setState(new StateTimesA(_calculator,_leftArg*_rightArg));
	}

}
