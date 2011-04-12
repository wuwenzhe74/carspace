

/**
 * @author Wenzhe
 * 
 */
public class SinglyLinkedListElement {

	protected Object data;
	protected SinglyLinkedListElement nextElement; // ref to next

	public SinglyLinkedListElement(Object v, SinglyLinkedListElement next) {
		data = v;
		nextElement = next;
	}

	public SinglyLinkedListElement(Object v) {
		this(v, null);
	}

	public SinglyLinkedListElement next() {
		return nextElement;
	}

	public void setNext(SinglyLinkedListElement next) {
		this.nextElement = next;
	}

	public Object value() {
		return data;
	}

	public void setValue(Object value) {
		data = value;
	}
}
