package DataStore;
import Computer.Computer;
public class DataStore {
	public static final int MAX_COMPUTERS = 100;

	private Computer[] computers;
	private int computersNumber;

	public DataStore() {
		computers = new Computer[MAX_COMPUTERS];
		computersNumber = 0;
	}

	public void add(Computer comp) {
		if (computersNumber < MAX_COMPUTERS) {
			computers[computersNumber] = comp;
			computersNumber++;
		}
	}

	public int checkAvailability(Computer find) {
		if (find == null)
			return 0;

		int count = 0;
		for (int i = 0; i < computersNumber; i++) {
			if (find.equals(computers[i])) {
				count++;
			}
		}
		return count;
	}

	public Computer[] getComputers() {
		Computer[] comps = new Computer[computersNumber];
		for (int i = 0; i < computersNumber; i++) {
			comps[i] = computers[i];
		}
		return comps;
	}

	public int getComputersNumber() {
		return computersNumber;
	}

	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}

	public void setComputersNumber(int computersNumber) {
		this.computersNumber = computersNumber;
	}
}
