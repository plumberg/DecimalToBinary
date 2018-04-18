//----------------------------------------------------------------
// ArrayBoundedStack.java    by Dale/Joyce/Weems         Chapter 2
//
// Implements StackInterface using an array to hold the 
// stack elements.
//
// Two constructors are provided: one that creates an array of a 
// default size and one that allows the calling program to 
// specify the size.
//----------------------------------------------------------------

package decimalToBinary;

public class ArrayBoundedStack<T> implements StackInterface<T> {
	protected final int DEFCAP = 100; // default capacity
	protected T[] elements; // holds stack elements
	protected int topIndex = -1; // index of top element in stack

	public ArrayBoundedStack() {
		elements = (T[]) new Object[DEFCAP];
	}

	public ArrayBoundedStack(int maxSize) {
		elements = (T[]) new Object[maxSize];
	}

	public void push(T element)throws StackOverflowException
	// Throws StackOverflowException if this stack is full,
	// otherwise places element at the top of this stack.
	{
		if (isFull()) {
			throw new StackOverflowException();
		} else {
			elements[++topIndex] = element;
		}
	}

	public void pop() throws StackUnderflowException
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{
		if (isEmpty()) {
			throw new StackUnderflowException();
		} else {
			topIndex--;
		}
	}

	public T top()throws StackUnderflowException
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element of this stack.
	{
		if (isEmpty()) {
			throw new StackUnderflowException();
		} else {
			return elements[topIndex];
		}
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{
		if (topIndex == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull()
	// Returns true if this stack is full, otherwise returns false.
	{
		if (topIndex == DEFCAP - 1) {
			return true;
		}
		return false;
	}
}
