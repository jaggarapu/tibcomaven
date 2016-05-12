//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.applicationmanagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="hbInterval" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="activationInterval" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="preparationDelay" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hbInterval",
    "activationInterval",
    "preparationDelay"
})
@XmlRootElement(name = "faultTolerant")
public class FaultTolerant {

    @XmlElement(defaultValue = "10000")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hbInterval;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger activationInterval;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger preparationDelay;

    /**
     * Gets the value of the hbInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHbInterval() {
        return hbInterval;
    }

    /**
     * Sets the value of the hbInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHbInterval(BigInteger value) {
        this.hbInterval = value;
    }

    /**
     * Gets the value of the activationInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActivationInterval() {
        return activationInterval;
    }

    /**
     * Sets the value of the activationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActivationInterval(BigInteger value) {
        this.activationInterval = value;
    }

    /**
     * Gets the value of the preparationDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreparationDelay() {
        return preparationDelay;
    }

    /**
     * Sets the value of the preparationDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreparationDelay(BigInteger value) {
        this.preparationDelay = value;
    }

}
