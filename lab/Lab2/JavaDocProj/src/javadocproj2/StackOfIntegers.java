public class StackOfIntegers {
    int[] _elements;
    int _size;

    public StackOfIntegers() {
        _elements = new int[0];
    }

    public StackOfIntegers(int size) {
        _elements = new int[size];
    }

    public int getSize() {
        return _size;
    }

    public boolean isEmpty() {
        return _size == 0 ? true : false;
    }

    public int peek() {
        if (isEmpty() == false) {
            return _elements[0];
        }
        return -8888;
    }

    public int push(int value) {
        if (_elements.length == _size) {
            return -8888;
        }
        return  _elements[_size++] = value;
    }

    public int pop(int value) {
        if (_elements.length == 0) {
            return -8888;
        }
        return _elements[_size--] = value;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = _size - 1; i >= 0; i--) {
            s += _elements[i] + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        StackOfIntegers SOI = new StackOfIntegers(5);
        SOI.push(10);
        SOI.push(20);
        SOI.push(30);
        SOI.push(40);
        SOI.push(50);
        System.out.println(SOI);
    }
}