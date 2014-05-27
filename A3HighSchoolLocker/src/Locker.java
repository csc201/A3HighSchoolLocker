public class Locker {
	int lockerNumber;
	String studentName;
	int numberOfBooks;
	private CombinationLock aCombLock = new CombinationLock();

	public Locker() {
		lockerNumber = 0;
		studentName = "No Name";
		numberOfBooks = 0;
		aCombLock.reset();
	}

	public Locker(int lockerNumber, String studentName, int numberOfBooks,
			CombinationLock aCombLock) {
		super();
		this.lockerNumber = lockerNumber;
		this.studentName = studentName;
		this.numberOfBooks = numberOfBooks;
		this.aCombLock = aCombLock;
	}

	public int getLockerNumber() {
		return lockerNumber;
	}

	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getaCombLock() {
		return aCombLock.toString();
	}

	public void setaCombLock(int number1, int number2, int number3) {
		this.aCombLock.setNumber1(number1); 
		this.aCombLock.setNumber1(number2); 
		this.aCombLock.setNumber1(number3); 
	}

	@Override
	public String toString() {
		return "Locker [lockerNumber=" + lockerNumber + ", studentName="
				+ studentName + ", numberOfBooks=" + numberOfBooks
				+ ", aCombLock=" + aCombLock + "]";
	}

}
