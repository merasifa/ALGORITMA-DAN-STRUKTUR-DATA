public class mergeSort27Main {
    public static void main(String[] args) {
        int data[] ={10,40,30,50,70,20,100,90};
        System.out.println("Sorting dgn merge sort");
        mergeSort27 mSort = new mergeSort27();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.sort(data, 0, data.length - 1); 

        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
