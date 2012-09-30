/**
 * 
 */
package calculator;

/**
 * @author Mohammed Makda
 *
 */
public class StateInitB implements IState {

	private Calculator _calculator;
	private int _value;

	/**
	 * 
	 */
	public StateInitB(Calculator calculator, int value) {
		_value = value;
		_calculator = calculator;
	}

	@Override
	public void pressClearKey() {
		_value = 0;
		// remain in this state
	}

	@Override
	public void pressDigitKey(int digit) {
		_value = _value * 10 + digit;
		// remain in this state
	}

	@Override
	public void pressDivideKey() {
		_calculator.setState(new StateDivideA(_calculator,_value));
	}

	@Override
	public void pressEqualsKey() {
		_calculator.setState(new StateInitA(_calculator,_value));
	}

	@Override
	public void pressMinusKey() {
		_calculator.setState(new StateSubA(_calculator,_value));
	}

	@Override
	public void pressPlusKey() {
		_calculator.setState(new StateAddA(_calculator,_value));
	}

	@Override
	public void pressTimesKey() {
		_calculator.setState(new StateTimesA(_calculator,_value));
	}

	@Override
	public int getValue() {
		return _value;
	}
}
