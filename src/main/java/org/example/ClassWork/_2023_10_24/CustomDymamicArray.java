package orgc.example.ClassWork._2023_10_24;

public class CustomDymamicArray {
    private int[] data;
    private int size;
    private int count;

    public CustomDymamicArray() {
        data = new int[1];
        size = 1;
        count = 0;
    }

    public CustomDymamicArray(int capacity) {
        data = new int[capacity];
        size = capacity;
        count = 0;
    }

    public void add(int element) {
        if (count >= size) {
            growSize();
        }
        data[count++] = element;
    }

    public void addAt(int index, int element){
        if (index >= count) throw new IndexOutOfBoundsException("Input index is out of bounds");
        if (count >= size) {
            growSize();
        }
        for (int i = count-1; i >index; i--) {
            data[i]=data[i-1];
        }

    }

    private void growSize() {
        int[] newData = new int[2 * size];
        for (int i = 0; i < count; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = 2 * size;
    }

    public static void main(String[] args) {
        CustomDymamicArray array = new CustomDymamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < count; i++) {
            result = result + data[i] + ", ";
        }
        result = result + "]";
        return ;
    }
}
