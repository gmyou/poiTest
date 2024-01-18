package org.example.vo;

public class CustomerVo {
    private String cusId;
    private String cusName;
    private String cusAge;
    private String cusEmail;

    public CustomerVo(String cusId, String cusName, String cusAge, String cusEmail) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusEmail = cusEmail;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAge() {
        return cusAge;
    }

    public void setCusAge(String cusAge) {
        this.cusAge = cusAge;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("ID : " + cusId);
        sb.append(" ,Name : " + cusName);
        sb.append(" ,Age : " + cusAge);
        sb.append(" ,Email : " + cusEmail);

        return sb.toString();
    }
}
