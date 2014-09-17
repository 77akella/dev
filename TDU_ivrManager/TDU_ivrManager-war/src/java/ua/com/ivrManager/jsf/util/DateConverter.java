package ua.com.ivrManager.jsf.util;

import java.util.TimeZone;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = java.util.Date.class)
public class DateConverter extends DateTimeConverter {

    public DateConverter() {
        super();
        setTimeZone(TimeZone.getDefault());
        // here you can set your custom date pattern for your project
        setPattern("yyyy.MM.dd HH:mm");
    }
}