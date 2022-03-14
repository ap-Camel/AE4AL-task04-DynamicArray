
public class arrayList<T> {
    
   public T array[];
   public int capacity;
   public int l;

   public arrayList() {

    capacity = 100;
    array = (T[])new Object[capacity];
    l = 0;
   }

   public arrayList(int capacity) {

    array = (T[])new Object[capacity];
    l = 0;
    this.capacity = capacity;
   }

   public void add(T value) {

    if(l >= capacity) {
        capacity = capacity * 2;
        T newArray[] = (T[])new Object[capacity];
        for(int i = 0; i < l; i++) {

            newArray[i] = array[i];
        }
        array = newArray;
    }
    array[l] = value;
    l++;
   }

   public void print() {

    for(int i = 0; i < l; i++) {

        System.out.println(array[i]);
    }
   }

   public void set(T value, int index) {

     if(index > capacity) System.out.println("out of bounds exception");
     else {

        array[index] = value;
     }
   }

   public void clear() {

    for(int i = 0; i < l; i++) {

        array[i] = null;
    }

    l = 0;
   }

}
