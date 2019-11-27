package Study.Car_ex.Collection;

public class MyArray {
    private Object[] data;
    private int count;

    public MyArray(int maxSize){
        if(maxSize < 0 ){
            throw new IllegalArgumentException();
        }
        this.data = new Object[maxSize];
        this.count = 0;
    }

    public void add(Object obj){
        if(count >= data.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        data[count++] = obj;
    }

    public void remove(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException();
        } else if(index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = index; i < count -1; i++){
            data[i] = data[i + 1];
        }
        count--;
        data[count] = null;
    }

    public Object get(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    public String toString(){
        StringBuffer str = new StringBuffer("[");
        if(count > 0){
            str.append(data[0]);
        }
        for(int i=1; i< count; i++){
            str.append(", ").append(data[i]);
        }
        str.append("]");
        return str.toString();
    }
    public static void main(String[] args) {
        MyArray arr = new MyArray(5);
        for(int i = 1; i<=5; i++){
            arr.add("데이터 - " + i);
        }
        System.out.println("저장된 요소");
        System.out.println(arr.toString());
        System.out.println("0번째 index");
        System.out.println(arr.get(0));
        System.out.println("3번째 index");
        System.out.println(arr.get(3));

        arr.remove(3);
        System.out.println("삭제 후 전체");
        System.out.println(arr.toString());

        arr.add("데이터 -4 ");
        System.out.println("데이터 -4 저장 후");
        System.out.println(arr);
    }

}
