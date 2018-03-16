package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @Name: Custom
 * @Description:
 * @author: Olliween
 * @date: 2018/3/16 9:53
 */
@Entity
public class Custom {
    private int id;
    private String name;
    private String password;
    private String mobile;
    private String email;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "mobile", nullable = false, length = 45)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "Email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Custom custom = (Custom) o;
        return id == custom.id &&
                Objects.equals(name, custom.name) &&
                Objects.equals(password, custom.password) &&
                Objects.equals(mobile, custom.mobile) &&
                Objects.equals(email, custom.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, password, mobile, email);
    }
}
