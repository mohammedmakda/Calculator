package calculator;

public class StateError implements IState {

	private Calculator _calculator;

	public StateError(Calculator calculator) {
		_calculator = calculator;
	}

	@Override
	public int getValue() {
		return -99999999;
	}

	@Override
	public void pressClearKey() {
		_calculator.setState(new StateInitA(_calculator,0));
	}

	@Override
	public void pressDigitKey(int digit) {
		// Do nothing. Remain in this state.
	}

	@Override
	public void pressDivideKey() {
		// Do nothing. Remain in this state.
	}

	@Override
	public void pressEqualsKey() {
		// Do nothing. Remain in this state.
	}

	@Override
	public void pressMinusKey() {
		// Do nothing. Remain in this state.
	}

	@Override
	public void pressPlusKey() {
		// Do nothing. Remain in this state.
	}

	@Override
	public void pressTimesKey() {
		// Do nothing. Remain in this state.
	}

}
