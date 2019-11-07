package Study.Car_ex.util;

import java.util.Stack;

public class StackC {
    public static void main(String[] args) {
        //후입 선출 Last in First out
        //Stack 의 가장 밑 값을 bottom이라하고 0으로 고정되어있다.
        //push -> top값을 하나 증가시킨 후 , 새로운 데이터를 삽입.
        //pop -> top이 가리키고 있는 자료 삭제 후, top값을 하나 감소하도록 구현함.
        //peek -> top이 가르키는 데이터를 읽는 작업. top 값에는 변화 없음.
        Stack stack = new Stack();
        for(int i = 1 ; i<=5; i++){
            stack.push("데이터-"+i);
        }

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //스택에 값이 없으면 EmptyStackException이 발생.
        System.out.println(stack.pop());
        

    }
}
