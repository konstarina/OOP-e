package task2;

public class Queue {
    private int list[];
    private int elementsNumber = 0;
    private int maxSize;

    public Queue(){
        this.maxSize = 1000;
        list = new int[maxSize];
    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
        list = new int[maxSize];
    }

    public void push(int value){
        if (elementsNumber + 1 > maxSize)
            return;
        list[elementsNumber] = value;
        elementsNumber ++;
    }

    public int pop(){
        if (elementsNumber == 0)
            return 0;

        int value = list[0];

        for (int i = 0; i < elementsNumber - 1; i++){
            list[i] = list[i + 1];
        }
        elementsNumber --;
        return value;
    }

    public void listElements(){
        for (int i = 0; i < elementsNumber; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (elementsNumber == 0)
            return true;

        return false;
    }

    public boolean isFull() {
        if (elementsNumber == maxSize)
            return true;
        else
        return false;
    }

}
