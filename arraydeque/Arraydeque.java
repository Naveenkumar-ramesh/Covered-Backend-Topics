import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();

		dq.add("a");
		dq.addFirst("b");
		dq.addLast("c");
		dq.add("d");
		dq.removeFirst();

		System.out.println();

//        System.out.println(dq.removeFirst());
//
//        System.out.println(dq.removeLast());

		System.out.println(dq);

		System.out.println(dq.pop());

		System.out.println(dq.poll());

		System.out.println(dq.pollFirst());

		System.out.println(dq.pollLast());

	}
}