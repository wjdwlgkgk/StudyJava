package nvd.Vo;

import java.util.ArrayList;
import java.util.HashMap;

public class Reference_data {
    String refsource;
    String name;
    String url;
    ArrayList<String> tags;

    public String getRefsource() {
        return refsource;
    }

    public void setRefsource(String refsource) {
        this.refsource = refsource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
