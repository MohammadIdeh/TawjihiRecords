package application;

public class LinkedList {
	Node head;

	public LinkedList() {

	}

	public void insert(Object value) {
		Node newnode = new Node(value);
		Node btr = head;

		if (btr == null) {

			head = newnode;

		} else if (((Tawjihi) value).getAvg() > ((Tawjihi) head.element).getAvg()) {
			newnode.next = head;
			head = newnode;
		} else {
			Node cur = btr.next;
			while (cur != null && ((Tawjihi) cur.element).getAvg() >= ((Tawjihi) value).getAvg()) {
				cur = cur.next;
				btr = btr.next;
			}
			newnode.next = cur;
			btr.next = newnode;

		}

	}

///print metho
	public String print() {
		Node current = head;
		String name = "";

		if (current == null) {
			name = "empty list";

		}

		else {
			while (current != null) {
				name += ((Tawjihi) current.element).toString() + "\n";

				current = current.next;
			}

		}
		return name;

	}

	public boolean delte(int snmu) {
		Node cur = head;
		if (cur == null) {
			return true;
		} else if (((Tawjihi) cur.element).getSeat_number() == snmu) {
			head = head.next;
			cur.next = null;
			return true;
		} else {
			Node cur1 = cur.next;
			while (((Tawjihi) cur1.element).getSeat_number() != snmu) {
				cur1 = cur1.next;
				cur = cur.next;
			}

			cur.next = cur1.next;
			cur1.element = null;
			return true;
		}

	}

	public String search(int seatNumber) {

		Node cr = head;
		String x = "";
		if (head == null) {
			x = "empty list";
		}

		else {
			while (cr != null && ((Tawjihi) cr.element).getSeat_number() != seatNumber) {
				cr = cr.next;

			}

			if (cr != null && ((Tawjihi) cr.element).getSeat_number() == seatNumber) {
				x += cr.element;

			} else
				x = "emptylist";
		}
		return x;
	}

	public String TopTen() {
		Node cr = head;
		String x = "";
		int i = 0;
		if (cr == null) {
			x = "empty list";

		} else {
			while (cr != null && i < 10) {
				if (cr != null) {
					x += cr.element + "\n";

				}
				cr = cr.next;
				i += 1;
			}

		}
		return x;

	}

	public double avg() {
		double x = 0;
		double p = 0;
		Node cur = head;
		double i = 0;
		if (cur == null) {
			return -1;
		} else {
			while (cur != null) {
				p += ((Tawjihi) cur.element).getAvg();
				i += 1;
				cur = cur.next;
			}
			x = p / i;
		}
		return x;

	}

	public String avgabovespec(double avg) {
		String x = "";
		double i = 0;
		double res = 0;
		double r = 0;
		Node cur = head;

		if (cur == null) {
			x = "Empty List";
			return x;
		} else {
			while (cur != null) {
				if (((Tawjihi) cur.element).getAvg() >= avg) {
					i += 1;
				}
				res += 1;
				cur = cur.next;
			}
			r = (i / res) * 100;
			x += r;

		}
		return x = "Number of Students: " + i + " average of them: " + r + "%";

	}
	public double mode() {
		double mod = 0;
		int max = 0;
		Node current = head;
		Node node = current;
		int counter = 1;

		while (current != null) {
			if (((Tawjihi) current.element).getAvg() == ((Tawjihi) node.element).getAvg()) {
				counter++;
				node = current;
				current = current.next;
			} else {
				if (counter > max) {
					max = counter;
					mod = ((Tawjihi) current.element).getAvg();
				}
				counter = 1;

			}
			node = current;
			current = current.next;
		}

		return mod;
	}
}
