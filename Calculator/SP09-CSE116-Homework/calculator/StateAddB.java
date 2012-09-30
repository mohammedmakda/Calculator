/**
 * 
 */
package calculator;

/**
 * @author Mohammed Makda
 *
 */
public class StateAddB implements IState {

	private Calculator _calculator;
	private int _rightArg;
	private int _leftArg;

	/**
	 * 
	 */
	public StateAddB(Calculator calculator, int left, int right) {
		_calculator = calculator;
		_leftArg = left;
		_rightArg = right;
	}

	@Override
	public void pressClearKey() {
		_calculator.setState(new StateInitA(_calculator, 0));
	}

	@Override
	public void pressDigitKey(int digit) {
		_rightArg = _rightArg * 10 + digit;
	}

	@Override
	public void pressDivideKey() {
		_calculator.setState(new StateAddDivideA(_calculator,_leftArg,_rightArg));
	}

	@Override
	public void pressEqualsKey() {
		_calculator.setState(new StateInitA(_calculator, _leftArg + _rightArg));
	}

	@Override
	public void pressMinusKey() {
		_calculator.setState(new StateSubA(_calculator,_leftArg+_rightArg));
	}

	@Override
	public void pressPlusKey() {
		_calculator.setState(new StateAddA(_calculator, _leftArg + _rightArg));
	}

	@Override
	public void pressTimesKey() {
		_calculator.setState(new StateAddTimesA(_calculator,_leftArg,_rightArg));
	}

	@Override
	public int getValue() {
		return _rightArg;
	}
}
