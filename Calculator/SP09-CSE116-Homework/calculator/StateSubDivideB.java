package calculator;

public class StateSubDivideB implements IState {

	private Calculator _calculator;
	private int _subArg;
	private int _leftArg;
	private int _rightArg;

	public StateSubDivideB(Calculator calculator, int subArg, int left, int digit) {
		_calculator = calculator;
		_subArg = subArg;
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
		_calculator.setState(new StateSubDivideA(_calculator,_subArg,_leftArg/_rightArg));
	}

	@Override
	public void pressEqualsKey() {
		_calculator.setState(new StateInitA(_calculator,_subArg-(_leftArg/_rightArg)));
	}

	@Override
	public void pressMinusKey() {
		_calculator.setState(new StateSubA(_calculator,_subArg-(_leftArg/_rightArg)));
	}

	@Override
	public void pressPlusKey() {
		_calculator.setState(new StateAddA(_calculator,_subArg-(_leftArg/_rightArg)));
	}

	@Override
	public void pressTimesKey() {
		_calculator.setState(new StateSubTimesA(_calculator,_subArg,_leftArg/_rightArg));
	}
	
}
