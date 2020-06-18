package zhan.pojo;

import javax.persistence.Table;

@Table(name="t_student")
public class Student {
    private Long id;

    private String snumber;

    private String sname;

    private String spassword;

    private String email;

    private String phone;

    private Long cid;

    private Long tid;

    private Integer confirm;

    private Long aid;

    private String beginUrl;

    private Integer beginStatus;

    private String beginRemark;

    private Float beginSorces;

    private String midUrl;

    private Integer midStatus;

    private String midRemark;

    private Float midSorces;

    private String endUrl;

    private Integer endStatus;

    private String endRemark;

    private Float endSorces;

    private String tRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber == null ? null : snumber.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getBeginUrl() {
        return beginUrl;
    }

    public void setBeginUrl(String beginUrl) {
        this.beginUrl = beginUrl == null ? null : beginUrl.trim();
    }

    public Integer getBeginStatus() {
        return beginStatus;
    }

    public void setBeginStatus(Integer beginStatus) {
        this.beginStatus = beginStatus;
    }

    public String getBeginRemark() {
        return beginRemark;
    }

    public void setBeginRemark(String beginRemark) {
        this.beginRemark = beginRemark == null ? null : beginRemark.trim();
    }

    public Float getBeginSorces() {
        return beginSorces;
    }

    public void setBeginSorces(Float beginSorces) {
        this.beginSorces = beginSorces;
    }

    public String getMidUrl() {
        return midUrl;
    }

    public void setMidUrl(String midUrl) {
        this.midUrl = midUrl == null ? null : midUrl.trim();
    }

    public Integer getMidStatus() {
        return midStatus;
    }

    public void setMidStatus(Integer midStatus) {
        this.midStatus = midStatus;
    }

    public String getMidRemark() {
        return midRemark;
    }

    public void setMidRemark(String midRemark) {
        this.midRemark = midRemark == null ? null : midRemark.trim();
    }

    public Float getMidSorces() {
        return midSorces;
    }

    public void setMidSorces(Float midSorces) {
        this.midSorces = midSorces;
    }

    public String getEndUrl() {
        return endUrl;
    }

    public void setEndUrl(String endUrl) {
        this.endUrl = endUrl == null ? null : endUrl.trim();
    }

    public Integer getEndStatus() {
        return endStatus;
    }

    public void setEndStatus(Integer endStatus) {
        this.endStatus = endStatus;
    }

    public String getEndRemark() {
        return endRemark;
    }

    public void setEndRemark(String endRemark) {
        this.endRemark = endRemark == null ? null : endRemark.trim();
    }

    public Float getEndSorces() {
        return endSorces;
    }

    public void setEndSorces(Float endSorces) {
        this.endSorces = endSorces;
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark == null ? null : tRemark.trim();
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", snumber='" + snumber + '\'' +
                ", sname='" + sname + '\'' +
                ", spassword='" + spassword + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cid=" + cid +
                ", tid=" + tid +
                ", confirm=" + confirm +
                ", aid=" + aid +
                ", beginUrl='" + beginUrl + '\'' +
                ", beginStatus=" + beginStatus +
                ", beginRemark='" + beginRemark + '\'' +
                ", beginSorces=" + beginSorces +
                ", midUrl='" + midUrl + '\'' +
                ", midStatus=" + midStatus +
                ", midRemark='" + midRemark + '\'' +
                ", midSorces=" + midSorces +
                ", endUrl='" + endUrl + '\'' +
                ", endStatus=" + endStatus +
                ", endRemark='" + endRemark + '\'' +
                ", endSorces=" + endSorces +
                ", tRemark='" + tRemark + '\'' +
                '}';
    }
}