package ua.com.aacc.webChat.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Artem Murashov
 */
//@ObjectTypeConverter(name = "authConv", objectType = AuthTypeEnum.class, dataType = String.class, conversionValues = {
//    @ConversionValue(objectValue = "AACC_SKILLSET_PREFIX_AUTH", dataValue = "AACC_SKILLSET"),
//    @ConversionValue(objectValue = "NO_AUTH", dataValue = "NO")})
@Entity
@GenericGenerator(name = "WTR_CONF_ID_GEN", strategy = "uuid")
public class WorkTimeRange extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "WTR_CONF_ID_GEN")
//    @Column(columnDefinition = "UUID")
    private String id;

    private String name;

    private Date monStart;
    private Date monEnd;

    private Date tueStart;
    private Date tueEnd;

    private Date wedStart;
    private Date wedEnd;

    private Date thuStart;
    private Date thuEnd;

    private Date friStart;
    private Date friEnd;

    private Date satStart;
    private Date satEnd;

    private Date sunStart;
    private Date sunEnd;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMonStart() {
        return monStart;
    }

    public void setMonStart(Date monStart) {
        this.monStart = monStart;
    }

    public Date getMonEnd() {
        return monEnd;
    }

    public void setMonEnd(Date monEnd) {
        this.monEnd = monEnd;
    }

    public Date getTueStart() {
        return tueStart;
    }

    public void setTueStart(Date tueStart) {
        this.tueStart = tueStart;
    }

    public Date getTueEnd() {
        return tueEnd;
    }

    public void setTueEnd(Date tueEnd) {
        this.tueEnd = tueEnd;
    }

    public Date getWedStart() {
        return wedStart;
    }

    public void setWedStart(Date wedStart) {
        this.wedStart = wedStart;
    }

    public Date getWedEnd() {
        return wedEnd;
    }

    public void setWedEnd(Date wedEnd) {
        this.wedEnd = wedEnd;
    }

    public Date getThuStart() {
        return thuStart;
    }

    public void setThuStart(Date thuStart) {
        this.thuStart = thuStart;
    }

    public Date getThuEnd() {
        return thuEnd;
    }

    public void setThuEnd(Date thuEnd) {
        this.thuEnd = thuEnd;
    }

    public Date getFriStart() {
        return friStart;
    }

    public void setFriStart(Date friStart) {
        this.friStart = friStart;
    }

    public Date getFriEnd() {
        return friEnd;
    }

    public void setFriEnd(Date friEnd) {
        this.friEnd = friEnd;
    }

    public Date getSatStart() {
        return satStart;
    }

    public void setSatStart(Date satStart) {
        this.satStart = satStart;
    }

    public Date getSatEnd() {
        return satEnd;
    }

    public void setSatEnd(Date satEnd) {
        this.satEnd = satEnd;
    }

    public Date getSunStart() {
        return sunStart;
    }

    public void setSunStart(Date sunStart) {
        this.sunStart = sunStart;
    }

    public Date getSunEnd() {
        return sunEnd;
    }

    public void setSunEnd(Date sunEnd) {
        this.sunEnd = sunEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkTimeRange)) return false;

        WorkTimeRange that = (WorkTimeRange) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WorkTimeRange{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Checking is working hours for specified time.
     * @param milliseconds - time to check.
     * @return true if working hours
     */
    public boolean isWorkingTime(long milliseconds) {
        Calendar calendar = new GregorianCalendar();
        //for round floor to minute
        milliseconds=milliseconds-(milliseconds % 60000);
        calendar.setTimeInMillis(milliseconds);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(1970, 0, 1);

        switch (day) {
            case Calendar.MONDAY:
                return calendar.getTime().after(monStart) && calendar.getTime().before(monEnd);
            case Calendar.TUESDAY:
                return calendar.getTime().after(tueStart) && calendar.getTime().before(tueEnd);
            case Calendar.WEDNESDAY:
                return calendar.getTime().after(wedStart) && calendar.getTime().before(wedEnd);
            case Calendar.THURSDAY:
                return calendar.getTime().after(thuStart) && calendar.getTime().before(thuEnd);
            case Calendar.FRIDAY:
                return calendar.getTime().after(friStart) && calendar.getTime().before(friEnd);
            case Calendar.SATURDAY:
                return calendar.getTime().after(satStart) && calendar.getTime().before(satEnd);
            case Calendar.SUNDAY:
                return calendar.getTime().after(sunStart) && calendar.getTime().before(sunEnd);
            default:
                return false;
        }
    }
}
