package zhan.pojo;

import javax.persistence.Table;

@Table(name="t_teacher")
public class Teacher {
    private Long id;

    private String tnumber;

    private String tname;

    private String tpassword;

    private String tinfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber == null ? null : tnumber.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword == null ? null : tpassword.trim();
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tnumber='" + tnumber + '\'' +
                ", tname='" + tname + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tinfo='" + tinfo + '\'' +
                '}';
    }
}