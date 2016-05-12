//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.applicationmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.tibco.com/xmlns/ApplicationManagement}httpRepoInstance" minOccurs="0"/>
 *         &lt;element ref="{http://www.tibco.com/xmlns/ApplicationManagement}rvRepoInstance" minOccurs="0"/>
 *         &lt;element ref="{http://www.tibco.com/xmlns/ApplicationManagement}localRepoInstance" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="selected" type="{http://www.tibco.com/xmlns/ApplicationManagement}repoType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "repoInstances")
public class RepoInstances {

    protected HttpRepoInstance httpRepoInstance;
    protected RvRepoInstance rvRepoInstance;
    protected LocalRepoInstance localRepoInstance;
    @XmlAttribute
    protected RepoType selected;

    /**
     * Gets the value of the httpRepoInstance property.
     * 
     * @return
     *     possible object is
     *     {@link HttpRepoInstance }
     *     
     */
    public HttpRepoInstance getHttpRepoInstance() {
        return httpRepoInstance;
    }

    /**
     * Sets the value of the httpRepoInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpRepoInstance }
     *     
     */
    public void setHttpRepoInstance(HttpRepoInstance value) {
        this.httpRepoInstance = value;
    }

    /**
     * Gets the value of the rvRepoInstance property.
     * 
     * @return
     *     possible object is
     *     {@link RvRepoInstance }
     *     
     */
    public RvRepoInstance getRvRepoInstance() {
        return rvRepoInstance;
    }

    /**
     * Sets the value of the rvRepoInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RvRepoInstance }
     *     
     */
    public void setRvRepoInstance(RvRepoInstance value) {
        this.rvRepoInstance = value;
    }

    /**
     * Gets the value of the localRepoInstance property.
     * 
     * @return
     *     possible object is
     *     {@link LocalRepoInstance }
     *     
     */
    public LocalRepoInstance getLocalRepoInstance() {
        return localRepoInstance;
    }

    /**
     * Sets the value of the localRepoInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalRepoInstance }
     *     
     */
    public void setLocalRepoInstance(LocalRepoInstance value) {
        this.localRepoInstance = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link RepoType }
     *     
     */
    public RepoType getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoType }
     *     
     */
    public void setSelected(RepoType value) {
        this.selected = value;
    }

}
