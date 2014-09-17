package ua.com.aacc.webChat.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Artem Murashov
 */
//@EntityListeners(ModDateListener.class)
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate;
    private boolean disabled;
    @ManyToOne
    private Administrator modBy;
    private String modByName;

    protected AbstractEntity() {
    }

    public abstract String getId();

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean deleted) {
        this.disabled = deleted;
    }

    public void setModBy(Administrator modBy) {
//        this.modBy = modBy;
        if (modBy != null)
            this.modByName = modBy.getUserName();
    }

    public String getModByName() {
        if (modBy != null) {
            return modBy.getUserName();
        }
        return modByName;
    }
}
