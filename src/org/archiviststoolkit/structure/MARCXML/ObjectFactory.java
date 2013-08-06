//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.08.29 at 12:19:51 PM EDT 
//


package org.archiviststoolkit.structure.MARCXML;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.archiviststoolkit.structure.MARCXML.CollectionType;
import org.archiviststoolkit.structure.MARCXML.ControlFieldType;
import org.archiviststoolkit.structure.MARCXML.DataFieldType;
import org.archiviststoolkit.structure.MARCXML.LeaderFieldType;
//import org.archivistsToolkit.structure.MARCXML.ObjectFactory;
import org.archiviststoolkit.structure.MARCXML.RecordType;
import org.archiviststoolkit.structure.MARCXML.SubfieldatafieldType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.archivistsToolkit.structure.MARCXML package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups. Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Record_QNAME = new QName("http://www.loc.gov/MARC21/slim", "record");
    private final static QName _Collection_QNAME = new QName("http://www.loc.gov/MARC21/slim", "collection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.archivistsToolkit.structure.MARCXML
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubfieldatafieldType }
     * 
     */
    public SubfieldatafieldType createSubfieldatafieldType() {
        return new SubfieldatafieldType();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link DataFieldType }
     * 
     */
    public DataFieldType createDataFieldType() {
        return new DataFieldType();
    }

    /**
     * Create an instance of {@link ControlFieldType }
     * 
     */
    public ControlFieldType createControlFieldType() {
        return new ControlFieldType();
    }

    /**
     * Create an instance of {@link LeaderFieldType }
     * 
     */
    public LeaderFieldType createLeaderFieldType() {
        return new LeaderFieldType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/MARC21/slim", name = "record")
    public JAXBElement<RecordType> createRecord(RecordType value) {
        return new JAXBElement<RecordType>(_Record_QNAME, RecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/MARC21/slim", name = "collection")
    public JAXBElement<CollectionType> createCollection(CollectionType value) {
        return new JAXBElement<CollectionType>(_Collection_QNAME, CollectionType.class, null, value);
    }

}
