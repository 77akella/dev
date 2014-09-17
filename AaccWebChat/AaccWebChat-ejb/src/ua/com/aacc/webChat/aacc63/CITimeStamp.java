/**
 * CITimeStamp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CITimeStamp implements java.io.Serializable {
    private int day;

    private int month;

    private int year;

    private int hour;

    private int minute;

    private int second;

    private int UTCOffsetMins;

    public CITimeStamp() {
    }

    public CITimeStamp(
            int day,
            int month,
            int year,
            int hour,
            int minute,
            int second,
            int UTCOffsetMins) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.UTCOffsetMins = UTCOffsetMins;
    }


    /**
     * Gets the day value for this CITimeStamp.
     *
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this CITimeStamp.
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the month value for this CITimeStamp.
     *
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this CITimeStamp.
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the year value for this CITimeStamp.
     *
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this CITimeStamp.
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the hour value for this CITimeStamp.
     *
     * @return hour
     */
    public int getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this CITimeStamp.
     *
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this CITimeStamp.
     *
     * @return minute
     */
    public int getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this CITimeStamp.
     *
     * @param minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this CITimeStamp.
     *
     * @return second
     */
    public int getSecond() {
        return second;
    }


    /**
     * Sets the second value for this CITimeStamp.
     *
     * @param second
     */
    public void setSecond(int second) {
        this.second = second;
    }


    /**
     * Gets the UTCOffsetMins value for this CITimeStamp.
     *
     * @return UTCOffsetMins
     */
    public int getUTCOffsetMins() {
        return UTCOffsetMins;
    }


    /**
     * Sets the UTCOffsetMins value for this CITimeStamp.
     *
     * @param UTCOffsetMins
     */
    public void setUTCOffsetMins(int UTCOffsetMins) {
        this.UTCOffsetMins = UTCOffsetMins;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CITimeStamp)) return false;
        CITimeStamp other = (CITimeStamp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.day == other.getDay() &&
                this.month == other.getMonth() &&
                this.year == other.getYear() &&
                this.hour == other.getHour() &&
                this.minute == other.getMinute() &&
                this.second == other.getSecond() &&
                this.UTCOffsetMins == other.getUTCOffsetMins();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getDay();
        _hashCode += getMonth();
        _hashCode += getYear();
        _hashCode += getHour();
        _hashCode += getMinute();
        _hashCode += getSecond();
        _hashCode += getUTCOffsetMins();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CITimeStamp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CITimeStamp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UTCOffsetMins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "UTCOffsetMins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
