public class Main {
    public void main() {
        MyArrayList arrayList = new MyArrayList(4);

        arrayList.Add(10);
        arrayList.Add(20);
        arrayList.Add(36);
        arrayList.Add(44);
        arrayList.Add(89);

        System.out.println("Value at Index 2: " + arrayList.Get(2));
        arrayList.Remove(44);
        arrayList.Add(787);
        arrayList.Set(4, -123);
        System.out.println("Size: " + arrayList.Size());
    }
}
