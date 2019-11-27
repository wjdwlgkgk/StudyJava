package XMLTest;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParsing {
    public static void main(String[] args) throws Exception {

        User user = setUser();

        File file = new File("D:\\user.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(user,  file); // ?
        jaxbMarshaller.marshal(user, System.out);


    }

    public static User setUser(){
        User user = new User();
        user.setName("XML");
        user.setAge(22);

        List<String> list = new ArrayList<String>();
        list.add("1. XML은 구조적인 데이터를 위한 것이다.");
        list.add("2. XML은 다소 HTML 같아 보인다.");
        list.add("3. XML은 텍스트이며, 읽히는 것만을 뜻하지 않는다.");
        list.add("4. XML은 크기가 커진다.");
        list.add("5. XML은 기술의 집합이다.");
        list.add("6. XML은 새로운 기술이 아니라 발전한 기술이다.");
        list.add("7. XML은 HTML에서 XHTML로 이끌었다.");
        list.add("8. XML은 모듈식이다.");
        list.add("9. XML은 라이선스 제약이 없으며, 플랫폼이 독립적이고, 많은 지원이 있다.");

        user.setMessages(list);

        return user;
    }

}