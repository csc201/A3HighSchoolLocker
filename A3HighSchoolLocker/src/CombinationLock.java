
public class CombinationLock {
	int number1;
	int number2;
	int number3;
	
	public CombinationLock() {
		this.number1 = 0;
		this.number2 = 0;
		this.number3 = 0;	
	}
	
	public CombinationLock(int number1, int number2, int number3) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	
	public void reset() {
		this.number1 =0;
		this.number2 =0;
		this.number3 =0;
	}

	@Override
	public String toString() {
		return "CombinationLock [number1=" + number1 + ", number2=" + number2
				+ ", number3=" + number3 + "]";
	}
	
}
