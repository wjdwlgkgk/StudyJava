package nvd.Vo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class cve extends Object {

    @JsonProperty("data_format")
    private String data_format;

    @JsonProperty("data_version")
    private String data_version;

    @JsonProperty("data_type")
    private String data_type;

    @JsonProperty("references")
    private References references;

    @JsonProperty("description")
    private HashMap description;

    @JsonProperty("problemtype")
    private HashMap problemtype;

    @JsonProperty("CVE_data_meta")
    private HashMap CVE_data_meta;


    public String getData_format() {
        return data_format;
    }

    public void setData_format(String data_format) {
        this.data_format = data_format;
    }

    public String getData_version() {
        return data_version;
    }

    public void setData_version(String data_version) {
        this.data_version = data_version;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public HashMap getDescription() {
        return description;
    }

    public void setDescription(HashMap description) {
        this.description = description;
    }

    public HashMap getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(HashMap problemtype) {
        this.problemtype = problemtype;
    }

    public HashMap getCVE_data_meta() {
        return CVE_data_meta;
    }

    public void setCVE_data_meta(HashMap CVE_data_meta) {
        this.CVE_data_meta = CVE_data_meta;
    }
}
