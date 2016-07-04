//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jpa.modeler.spec.extend.QueryMapping;
import org.netbeans.jpa.source.JavaSourceParserUtil;

/**
 *
 *
 * @Target({TYPE}) @Retention(RUNTIME) public @interface NamedQuery { String
 * name(); String query(); LockModeType lockMode() default NONE; QueryHint[]
 * hints() default {}; }
 *
 *
 *
 * <p>
 * Java class for named-query complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="named-query">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lock-mode" type="{http://java.sun.com/xml/ns/persistence/orm}lock-mode-type" minOccurs="0"/>
 *         &lt;element name="hint" type="{http://java.sun.com/xml/ns/persistence/orm}query-hint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "named-query", propOrder = {
    "description",
    "query",
    "lockMode",
    "hint"
})
public class NamedQuery extends QueryMapping {

    protected String description;
    @XmlElement(required = true)
    protected String query;
    @XmlElement(name = "lock-mode")
    protected LockModeType lockMode;
    protected List<QueryHint> hint;
    @XmlAttribute(required = true)
    protected String name;

    public static NamedQuery load(Element element, AnnotationMirror annotationMirror) {
        NamedQuery namedQuery = null;
        if (annotationMirror != null) {
            namedQuery = new NamedQuery();
            namedQuery.name = (String) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "name");
            namedQuery.query = (String) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "query");

            Object lockModeObj = JavaSourceParserUtil.findAnnotationValue(annotationMirror, "lockMode");
            if (lockModeObj != null) {
                namedQuery.lockMode = LockModeType.valueOf(lockModeObj.toString());
            }
            List hintsAnnot = (List) JavaSourceParserUtil.findAnnotationValue(annotationMirror, "hints");
            if (hintsAnnot != null) {
                for (Object hintObj : hintsAnnot) {
                    namedQuery.getHint().add(QueryHint.load(element, (AnnotationMirror) hintObj));
                }
            }
        }
        return namedQuery;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the query property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the lockMode property.
     *
     * @return possible object is {@link LockModeType }
     *
     */
    public LockModeType getLockMode() {
        return lockMode;
    }

    /**
     * Sets the value of the lockMode property.
     *
     * @param value allowed object is {@link LockModeType }
     *
     */
    public void setLockMode(LockModeType value) {
        this.lockMode = value;
    }

    /**
     * Gets the value of the hint property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the hint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryHint }
     *
     *
     */
    public List<QueryHint> getHint() {
        if (hint == null) {
            hint = new ArrayList<QueryHint>();
        }
        return this.hint;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
