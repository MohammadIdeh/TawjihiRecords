package application;

public class Tawjihi {

	private int seat_number;
	private String branch;
	private double avg;

	public Tawjihi(int seat_number, String branch, double avg) {
		super();
		this.seat_number = seat_number;
		this.branch = branch;
		this.avg = avg;
	}

	public int getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "[seat_number=" + seat_number + ", branch=" + branch + ", avg=" + avg + "]";
	}

}