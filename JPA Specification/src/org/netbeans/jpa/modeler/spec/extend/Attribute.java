/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jpa.modeler.spec.extend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.netbeans.jpa.modeler.spec.extend.annotation.Annotation;
import org.netbeans.jpa.modeler.spec.jaxb.JaxbVariableType;
import org.netbeans.jpa.modeler.spec.jaxb.JaxbVariableTypeHandler;
import org.netbeans.jpa.modeler.spec.jaxb.JaxbXmlAttribute;
import org.netbeans.jpa.modeler.spec.jaxb.JaxbXmlElement;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class Attribute extends FlowPin implements JaxbVariableTypeHandler {

//    private List<String> annotation;
    private List<Annotation> annotation;
    @XmlAttribute
    private boolean visibile = true;

    @XmlAttribute(name = "xvt", required = true)//(name = "jaxb-variable-type", required = true)
    private JaxbVariableType jaxbVariableType;
    @XmlElement(name = "xa")//(name = "jaxb-xml-attribute")
    private JaxbXmlAttribute jaxbXmlAttribute;
    @XmlElement(name = "xe")//(name = "jaxb-xml-element")
    private JaxbXmlElement jaxbXmlElement;
    @XmlElement(name="xe")//(name = "jaxb-xml-element")
    @XmlElementWrapper(name = "xel")//(name = "jaxb-xml-element-list")
    private List<JaxbXmlElement> jaxbXmlElementList;
//    @XmlAttribute(name = "jaxb-xml-list")
//    private Boolean jaxbXmlList;

       
    @XmlAttribute(name = "name", required = true)
    protected String name;
   
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
    /**
     * @return the annotation
     */
    public List<Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        return annotation;
    }

    /**
     * @param annotation the annotation to set
     */
    public void setAnnotation(List<Annotation> annotation) {
        this.annotation = annotation;
    }

    public void addAnnotation(Annotation annotation_In) {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        this.annotation.add(annotation_In);
    }

    public void removeAnnotation(Annotation annotation_In) {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        this.annotation.remove(annotation_In);
    }

    /**
     * @return the visibile
     */
    public boolean isVisibile() {
        return visibile;
    }

    /**
     * @param visibile the visibile to set
     */
    public void setVisibile(boolean visibile) {
        this.visibile = visibile;
    }

    /**
     * @return the jaxbVariableType
     */
    public JaxbVariableType getJaxbVariableType() {
        return jaxbVariableType;
    }

    /**
     * @param jaxbVariableType the jaxbVariableType to set
     */
    public void setJaxbVariableType(JaxbVariableType jaxbVariableType) {
        this.jaxbVariableType = jaxbVariableType;
    }

    /**
     * @return the jaxbXmlAttribute
     */
    public JaxbXmlAttribute getJaxbXmlAttribute() {
        return jaxbXmlAttribute;
    }

    /**
     * @param jaxbXmlAttribute the jaxbXmlAttribute to set
     */
    public void setJaxbXmlAttribute(JaxbXmlAttribute jaxbXmlAttribute) {
        this.jaxbXmlAttribute = jaxbXmlAttribute;
    }

    /**
     * @return the jaxbXmlElement
     */
    public JaxbXmlElement getJaxbXmlElement() {
        return jaxbXmlElement;
    }

    /**
     * @param jaxbXmlElement the jaxbXmlElement to set
     */
    public void setJaxbXmlElement(JaxbXmlElement jaxbXmlElement) {
        this.jaxbXmlElement = jaxbXmlElement;
    }

    /**
     * @return the jaxbXmlElementList
     */
    public List<JaxbXmlElement> getJaxbXmlElementList() {
        return jaxbXmlElementList;
    }

    /**
     * @param jaxbXmlElementList the jaxbXmlElementList to set
     */
    public void setJaxbXmlElementList(List<JaxbXmlElement> jaxbXmlElementList) {
        this.jaxbXmlElementList = jaxbXmlElementList;
    }

//    /**
//     * @return the jaxbXmlList
//     */
//    public Boolean getJaxbXmlList() {
//        return jaxbXmlList;
//    }
//
//    /**
//     * @param jaxbXmlList the jaxbXmlList to set
//     */
//    public void setJaxbXmlList(Boolean jaxbXmlList) {
//        this.jaxbXmlList = jaxbXmlList;
//    }
    
    
    @Override
    public List<JaxbVariableType> getJaxbVariableList(){
        return Arrays.asList(JaxbVariableType.values());
    }
}