package model;

public class EmailSetting {
    private String language;
    private String pageSize;
    private String spam = "false";
    private String signature;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpam() {
        return spam;
    }

    public void setSpam(String spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public EmailSetting(String language, String pageSize, String spam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spam = spam;
        this.signature = signature;
    }

    public EmailSetting() {

    }

}
