package BeanTest;


import org.springframework.stereotype.Component;

@Component
public class BeanTest1 {
    public BeanTest1(){
        hello();
    }

    public void hello(){
        System.out.println("hello Bean1");
    }

}
