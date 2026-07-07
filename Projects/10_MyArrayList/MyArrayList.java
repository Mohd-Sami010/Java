public class MyArrayList {
    int i = -1;
    int[] array = new int[10];

    public MyArrayList(int size) {
        if (size == 0)
            return;
        this.array = new int[size];
    }

    public void Add(int value) {
        if (i + 1 >= array.length) {
            int[] bigArray = new int[array.length + 10];
            for (int j = 0; j <= i; j++) {
                bigArray[j] = array[j];
            }
            array = bigArray;
        }
        array[++i] = value;
        PrintArray();
    }

    public void Remove(int value) {
        for (int j = 0; j <= i; j++) {
            if (array[j] != value)
                continue;
            for (int k = j; k < i; k++) {
                array[k] = array[k + 1];
            }
            i--;
            PrintArray();
            return;
        }
        System.out.println("Value Not Found");
    }

    public int Get(int index) {
        if (index > i) {
            System.out.println("Index Out Of Bound");
            return 0;
        }
        return array[index];
    }

    public void Set(int index, int value) {
        if (index > i) {
            System.out.println("Index Out Of Bound");
            return;
        }
        array[index] = value;
        PrintArray();
    }

    public int Size() {
        return i + 1;
    }

    public void PrintArray() {
        System.out.print("[");
        for (int j = 0; j <= i; j++)
            System.out.print(array[j] + ", ");
        System.out.print("]\n");
    }
}
