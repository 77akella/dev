
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResourcePropertyValueChangeNotification_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "ResourcePropertyValueChangeNotification");
    private final static QName _QueryExpression_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "QueryExpression");
    private final static QName _ResourcePropertyValueChangeNotificationTypeOldValue_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", "OldValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourcePropertyValueChangeNotificationType }
     * 
     */
    public ResourcePropertyValueChangeNotificationType createResourcePropertyValueChangeNotificationType() {
        return new ResourcePropertyValueChangeNotificationType();
    }

    /**
     * Create an instance of {@link QueryExpressionType }
     * 
     */
    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    /**
     * Create an instance of {@link ResourcePropertyValueChangeNotificationType.OldValue }
     * 
     */
    public ResourcePropertyValueChangeNotificationType.OldValue createResourcePropertyValueChangeNotificationTypeOldValue() {
        return new ResourcePropertyValueChangeNotificationType.OldValue();
    }

    /**
     * Create an instance of {@link ResourcePropertyValueChangeNotificationType.NewValue }
     * 
     */
    public ResourcePropertyValueChangeNotificationType.NewValue createResourcePropertyValueChangeNotificationTypeNewValue() {
        return new ResourcePropertyValueChangeNotificationType.NewValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcePropertyValueChangeNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", name = "ResourcePropertyValueChangeNotification")
    public JAXBElement<ResourcePropertyValueChangeNotificationType> createResourcePropertyValueChangeNotification(ResourcePropertyValueChangeNotificationType value) {
        return new JAXBElement<ResourcePropertyValueChangeNotificationType>(_ResourcePropertyValueChangeNotification_QNAME, ResourcePropertyValueChangeNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", name = "QueryExpression")
    public JAXBElement<QueryExpressionType> createQueryExpression(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_QueryExpression_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourcePropertyValueChangeNotificationType.OldValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", name = "OldValue", scope = ResourcePropertyValueChangeNotificationType.class)
    public JAXBElement<ResourcePropertyValueChangeNotificationType.OldValue> createResourcePropertyValueChangeNotificationTypeOldValue(ResourcePropertyValueChangeNotificationType.OldValue value) {
        return new JAXBElement<ResourcePropertyValueChangeNotificationType.OldValue>(_ResourcePropertyValueChangeNotificationTypeOldValue_QNAME, ResourcePropertyValueChangeNotificationType.OldValue.class, ResourcePropertyValueChangeNotificationType.class, value);
    }

}
