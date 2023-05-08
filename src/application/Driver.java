package application;

public class Driver {

	public static void main(String[] args) {
		LinkedList L1 = new LinkedList();
		Tawjihi x = new Tawjihi(123, "mohammad", 22);
		Tawjihi x1 = new Tawjihi(1234, "mohammad", 22);
		Tawjihi x2 = new Tawjihi(1235, "mohammad", 22);
		Tawjihi x3 = new Tawjihi(1236, "mohammad", 20);
		Tawjihi x4 = new Tawjihi(1237, "mohammad", 99);

		L1.insert(x);
		L1.insert(x1);
		L1.insert(x2);
		L1.insert(x3);
		L1.insert(x4);
		System.out.println(L1.mode());

L1.delte(1237);
		System.out.println(L1.avgabovespec(30));

System.out.println(L1.print());
	}

}