/**
 * 
 */
package calculator;

/**
 * @author Mohammed Makda
 *
 */
public class StateAddA implements IState {

	private Calculator _calculator;
	private int _value;

	/**
	 * 
	 */
	public StateAddA(Calculator calculator, int leftArgument) {
		_calculator = calculator;
		_value = leftArgument;
	}

	@Override
	public void pressClearKey() {
		_calculator.setState(new StateInitA(_calculator, 0));
	}

	@Override
	public void pressDigitKey(int digit) {
		_calculator.setState(new StateAddB(_calculator, _value, digit));
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
		// ignore - do nothing
	}

	@Override
	public void pressTimesKey() {
		// Double Operand
		_calculator.setState(new StateError(_calculator));
	}

	@Override
	public int getValue() {
		return _value;
	}

}
