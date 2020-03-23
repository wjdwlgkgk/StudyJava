package XMLTest;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class User {

    private String name;
    private int age;
    private List<String> messages;


    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    @XmlElementWrapper(name = "messages")
    @XmlElement(name = "message")
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String toString() {
        String result = "";
        result = "[name : " + name + ", age : " + age + ", messages : " + messages + "]";

        return result;
    }


}
