package calculator;

public class Calculator {

	private IState _state;
	
	public Calculator() {
		_state = new StateInitA(this, 0);
	}

	public void pressDigitKey(int digit) {
		_state.pressDigitKey(digit);
	}

	public void pressPlusKey() {
		_state.pressPlusKey();
	}

	public void pressMinusKey() {
		_state.pressMinusKey();
	}

	public void pressTimesKey() {
		_state.pressTimesKey();
	}

	public void pressDivideKey() {
		_state.pressDivideKey();
	}

	public void pressEqualsKey() {
		_state.pressEqualsKey();
	}

	public void pressClearKey() {
		_state.pressClearKey();
	}

	public int getValue() {
		return _state.getValue();
	}

	public void setState(IState newState) {
		_state = newState;
	}
}
