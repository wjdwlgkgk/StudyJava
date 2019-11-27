package javascriptEngine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;

public class nashornTest {
    public static void main(String[] args) throws Exception {


        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        scriptEngine.eval("print(\"Hello world\");");

        File file = new File("test.js");
        scriptEngine.eval(new FileReader("E:\\workspace_NEW\\workspace_190516\\mavenP\\src\\main\\java\\javascriptEngine\\test.js"));

        Invocable invocable = (Invocable)scriptEngine;

        Object result = invocable.invokeFunction("func1", "Peter Parker");
        System.out.println(result);
        System.out.println(result.getClass());



    }
}
