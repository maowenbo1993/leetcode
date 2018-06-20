import java.util.*;
public class MinStack {
	private int[] a = new int[1];
	private int[] copy = a;
	private int N = 0;
	public MinStack() {}
	private void copy() {
		int[] temp = new int[N];
		for (int i = 0; i < N; i++){
			temp[i] = a[i];
		}
		copy = temp;
	}
	public int getMin() {
		return copy[0];
	}
	public boolean isEmpty() {
		return N == 0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {
		int[] temp = new int[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	public void push(int i) {
		if (N == a.length) {
			resize(2 * a.length);
		}
		a[N] = i;
		N++;
		copy();
		Arrays.sort(copy);
	}
	public int top() {
		return a[N - 1];
	}
	public void pop() {
		a[--N] = 0;
		if (N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}
		copy();
		Arrays.sort(copy);
	}
}