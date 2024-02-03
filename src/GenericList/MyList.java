package org.example;
import java.util.*;

public class MyList<T> {
    private ArrayList<T> array;
    int size = 0;

    public MyList(int size) {
        // Creating a generic array using reflection
        array = new ArrayList<>(size);
    }
    public MyList() {
        // Creating a generic array using reflection
        array = new ArrayList<>();
    }

public int getCapacity(){
        return array.size();
}
    public void add( T index) {


            array.add(index);
            size++;


    }

    public int size() {
        return size; // Returns the number of elements in the list
    }

    public T get(int index){
        return array.get(index);
    }

    public void remove(int index){
        array.remove(index);
        size--;

//        if(index < size){
//            while(index != size -1){
//                array.set(index, array.get(index+1));
//            }
//
//        }
    }

    public void set(int index, T data){
        array.set(index,data);
    }

    public String toString(){

        return array.toString();
    }

    public int indexOf(T data){
        for (int i = 0; i < array.size(); i++){
            if(array.get(i) == data)
                return i;
        }
        return -1;
    }
    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }

    public void clear(){
        array.clear();
        size =0;
        }

    public boolean contains(T data){
        for (int i = 0; i < array.size(); i++){
            if(array.get(i) == data)
                return true;
        }

        return false;
    }

    public ArrayList<T> sublist(int start, int finish){
        List<T> subList = array.subList(start, finish);

        return new ArrayList<>(subList);
    }


    }




