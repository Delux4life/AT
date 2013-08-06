//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.11 at 01:13:59 PM EDT 
//


package org.archiviststoolkit.structure.EAD;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{urn:isbn:1-931666-22-9}m.para.content.norefs"/>
 *         &lt;element name="bibref" type="{urn:isbn:1-931666-22-9}bibref"/>
 *         &lt;element name="title" type="{urn:isbn:1-931666-22-9}title"/>
 *         &lt;element name="extref" type="{urn:isbn:1-931666-22-9}extref"/>
 *         &lt;element name="archref" type="{urn:isbn:1-931666-22-9}archref"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.internal.ptr"/>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ref", namespace = "urn:isbn:1-931666-22-9", propOrder = {
    "content"
})
public class Ref {

    @XmlElementRefs({
        @XmlElementRef(name = "origination", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "archref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "geogname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "ptr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "subject", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "extptr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "date", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "function", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "famname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "occupation", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "emph", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "persname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "lb", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "extref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "blockquote", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "num", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "title", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "abbr", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "genreform", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "unittitle", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "bibref", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "address", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "corpname", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "list", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "chronlist", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "table", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "unitdate", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "repository", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "name", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "expan", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class),
        @XmlElementRef(name = "note", namespace = "urn:isbn:1-931666-22-9", type = JAXBElement.class)
    })
    @XmlMixed
    protected java.util.List<Serializable> content;
    @XmlAttribute
    //@XmlIDREF
    @XmlSchemaType(name = "anySimpleType")
    protected String target;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String xpointer;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;
    @XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Origination }{@code >}
     * {@link JAXBElement }{@code <}{@link Archref }{@code >}
     * {@link JAXBElement }{@code <}{@link Geogname }{@code >}
     * {@link JAXBElement }{@code <}{@link Ptr }{@code >}
     * {@link JAXBElement }{@code <}{@link Subject }{@code >}
     * {@link JAXBElement }{@code <}{@link Extptr }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Function }{@code >}
     * {@link JAXBElement }{@code <}{@link Famname }{@code >}
     * {@link JAXBElement }{@code <}{@link Occupation }{@code >}
     * {@link JAXBElement }{@code <}{@link Emph }{@code >}
     * {@link JAXBElement }{@code <}{@link Persname }{@code >}
     * {@link JAXBElement }{@code <}{@link Lb }{@code >}
     * {@link JAXBElement }{@code <}{@link Extref }{@code >}
     * {@link JAXBElement }{@code <}{@link Blockquote }{@code >}
     * {@link JAXBElement }{@code <}{@link Num }{@code >}
     * {@link JAXBElement }{@code <}{@link Title }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbr }{@code >}
     * {@link JAXBElement }{@code <}{@link Genreform }{@code >}
     * {@link JAXBElement }{@code <}{@link Unittitle }{@code >}
     * {@link JAXBElement }{@code <}{@link Bibref }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link Corpname }{@code >}
     * {@link JAXBElement }{@code <}{@link org.archiviststoolkit.structure.EAD.List }{@code >}
     * {@link JAXBElement }{@code <}{@link Chronlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Table }{@code >}
     * {@link JAXBElement }{@code <}{@link Unitdate }{@code >}
     * {@link JAXBElement }{@code <}{@link Repository }{@code >}
     * {@link JAXBElement }{@code <}{@link Name }{@code >}
     * {@link JAXBElement }{@code <}{@link Expan }{@code >}
     * {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     * 
     */
    public java.util.List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the xpointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpointer() {
        return xpointer;
    }

    /**
     * Sets the value of the xpointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpointer(String value) {
        this.xpointer = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

}
