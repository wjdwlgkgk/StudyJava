package nvd.Vo;

public class CVE_smObject {
    cve cve;
    String lastModifiedDate;
    String con;

    public nvd.Vo.cve getCve() {
        return cve;
    }

    public void setCve(nvd.Vo.cve cve) {
        this.cve = cve;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
}
