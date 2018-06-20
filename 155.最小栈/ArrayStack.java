import java.util.*;
public class ArrayStack<Item> implements Iterable<Item> {
	int min;
	private Item[] a = (Item[])new Object[1];
	private int N = 0;
	public boolean isEmpty() {
		return N == 0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {
		Item[] temp = (Item[])new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	public void push(Item item) {
		if (N == a.length) {
			resize(2 * a.length);
		}
		a[N] = item;
		N++;
	}
	public Item pop() {
		Item temp = a[N];
		a[N] = null;
		N--;
		if (N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}
		return temp;
	}
	public Iterator<Item> iterator() {
		return new ReverseIterator();
	}
	private class ReverseIterator implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() {
			return i > 0;
		}
		public Item next() {
			i--;
			return a[i];
		}
		public void remove() {}
	}
}