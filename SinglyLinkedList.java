import java.util.Iterator;
import java.util.List;

/**
 * @author Wenzhe
 * 
 */
public class SinglyLinkedList {

	protected int count; // List size
	protected SinglyLinkedListElement head; // ref to first element

	public SinglyLinkedList() {
		head = null;
		count = 0;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void addToHead(Object value) {
		head = new SinglyLinkedListElement(value, head);
		count++;
	}

	public Object removeFromHead() {
		SinglyLinkedListElement temp = head;
		head = head.next();
		count--;
		return temp;
	}

	public Object peek() {
		return head.value();
	}

	public void add(Object value) {
		addToHead(value);
	}

	public void addToTail(Object value) {
		SinglyLinkedListElement temp = new SinglyLinkedListElement(value, null);
		if (head != null) {
			SinglyLinkedListElement finger = head;
			while (finger.next() != null) {
				finger = finger.next();
			}
			finger.setNext(temp);
		} else
			head = temp;
		count++;
	}

	public Object removeFromTail() {
		SinglyLinkedListElement finger = head;
		SinglyLinkedListElement previous = null;
		// Assert.pre(head!=null,"List is not empty!");
		while (finger.next() != null) {
			previous = finger;
			finger = finger.next();
		}
		if (previous == null) {
			// The List only has one element
			head = null;
		} else {
			previous.setNext(null);
		}
		count--;
		return finger.next();
	}

	public boolean contains(Object value) {
		SinglyLinkedListElement finger = head;
		while (finger.next() != null && !finger.value().equals(value)) {
			finger = finger.next();
		}
		return finger != null;
	}

	public Object remove(Object value) {
		SinglyLinkedListElement finger = head;
		SinglyLinkedListElement previous = null;
		while (finger != null && !finger.value().equals(value)) {
			previous = finger;
			finger = finger.next();
		}
		if (finger != null) {
			if (previous == null) {
				head = finger.next();
			} else {
				previous.setNext(finger.next());
			}
			count--;
			return finger.value();
		}
		return null; // didnot find the matching value in list
	}

	public void clear() {
		head = null;
		count = 0;
	}

}
