import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * @author Wenzhe
 * 
 */
public class Space {
	public final static int COMPACT = 0;
	public final static int MINIVAN = 1;
	public final static int TRUCK = 2;
	protected int number; // address in parking lot
	protected int size; // size of space

	public Space(int n, int s) {
		number = n;
		size = s;
	}

	public boolean equals(Object other) {
		Space that = (Space) other;
		return this.size == that.size;
	}
	
	public static String[] commandSplit(String str){
		String[] word = new String[3];
		int i = 0;

		while(str.charAt(i)!=' ') {
			word[0] = word[0] + str.charAt(i);
			i++;
		}
		
		i++;
		
		while(str.charAt(i)!=' ') {
			word[1] = word[1] + str.charAt(i);
			i++;
		}
		
		i++;
		
		while(str.charAt(i)!=' ') {
			word[2] = word[2] + str.charAt(i);
			i++;
		}
		
		return word;
		
	}

	public static void main(String[] args) {
		SinglyLinkedList free = new SinglyLinkedList();
		SinglyLinkedList rental = new SinglyLinkedList();
		for (int number = 0; number < 10; number++) {
			if (number < 3)
				free.add(new Space(number, Space.COMPACT));
			if (number < 9)
				free.add(new Space(number, Space.MINIVAN));
			else
				free.add(new Space(number, Space.TRUCK));
		}

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			System.out.println("Ready?");
			try {
				String command = br.readLine();
				if(command.equals("rent")){
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	}
}
