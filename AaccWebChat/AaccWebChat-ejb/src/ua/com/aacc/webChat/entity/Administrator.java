package ua.com.aacc.webChat.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Artem Murashov
 */
@Entity
@GenericGenerator(name = "ADMIN_ID_GEN", strategy = "uuid")
public class Administrator extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "ADMIN_ID_GEN")
//    @Column(columnDefinition = "UUID")
    private String id;
    private String userName;
    private String password;
    private String styleTheme;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStyleTheme() {
        return styleTheme;
    }

    public void setStyleTheme(String styleTheme) {
        this.styleTheme = styleTheme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Administrator[ id=" + id + ", userName='" + userName + "' ]";
    }
}
