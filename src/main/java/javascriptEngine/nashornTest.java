package javascriptEngine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class nashornTest {
    public static void main(String[] args) throws Exception {


        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
//        scriptEngine.eval("print(\"Hello world\");");

//        File file = new File("NWruleTest.js");
        scriptEngine.eval(new FileReader("E:\\workspace_NEW\\workspace_190516\\mavenP\\src\\main\\java\\javascriptEngine\\NWruleTest.js"));

        Invocable invocable = (Invocable) scriptEngine;


        File file = new File("E:\\workspace_NEW\\workspace_190516\\mavenP\\src\\main\\java\\javascriptEngine\\BR-S08-0303-1-7-154_Cisco3000_1.cfg");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String lineS = "";
        ArrayList<String> lines = new ArrayList<>();
        int cnt = 0;
        while((lineS = br.readLine()) != null){
            lines.add(lineS);
        }

        for (int line = 0; line <= lines.size()-1; ++line) {
            invocable.invokeFunction("push_text", lines.get(line));
        }
        Object result = invocable.invokeFunction("main");
        System.out.println(result);

    }
}
