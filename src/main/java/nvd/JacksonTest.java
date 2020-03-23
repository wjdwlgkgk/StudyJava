package nvd;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JacksonTest {

    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person("Nicole", 20);


        String personJson = objectMapper.writeValueAsString(person);

        Person jsonToPerson = objectMapper.readValue(personJson, Person.class);
        System.out.println(jsonToPerson.getName());
        System.out.println(jsonToPerson.getAge());

    }


}
