package zhan.pojo;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
@Table(name="t_clazz")
public class Clazz {
    private Long id;

    private String name;

    private String info;

    private Date deadline;

    private Date birth;

    private Long tid;
    @Transient
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date both) {
        this.birth = both;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}