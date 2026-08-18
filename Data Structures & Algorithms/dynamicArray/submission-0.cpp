class DynamicArray {
public:
    int* arr;
    int len=0;
    int capacity=1;
    DynamicArray(int capacity) {
        arr = new int[capacity];
        this->capacity = capacity;
    }

    int get(int i) {

        return arr[i];
    }

    void set(int i, int n) {
        arr[i] = n;
    }

    void pushback(int n) {
        if (len >= capacity)
            resize();
        arr[len++]=n;
    }

    int popback() {
        len--;
        return arr[len];
    }

    void resize() {
        capacity = 2*capacity;
        int* newArr = new int[capacity];

        for(int i = 0; i< len;i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    int getSize() {
        return len;
    }

    int getCapacity() {
        return capacity;
    }   
};
