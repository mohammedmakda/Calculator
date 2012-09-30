package calculator;

public interface IState {

	void pressDigitKey(int digit); // digit key

	void pressPlusKey(); // '+' key

	void pressMinusKey(); // '-' key

	void pressTimesKey(); // '*' key

	void pressDivideKey(); // '/' key

	void pressEqualsKey(); // '=' key

	void pressClearKey(); // 

	int getValue(); 

}
