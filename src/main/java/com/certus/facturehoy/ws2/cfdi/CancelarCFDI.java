
package com.certus.facturehoy.ws2.cfdi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelarCFDI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelarCFDI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasenia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="keyEncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarCFDI", propOrder = {
    "usuario",
    "contrasenia",
    "uuid",
    "keyEncode"
})
public class CancelarCFDI {

    protected String usuario;
    protected String contrasenia;
    @XmlElement(name = "UUID", nillable = true)
    protected List<String> uuid;
    protected String keyEncode;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the contrasenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Sets the value of the contrasenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenia(String value) {
        this.contrasenia = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUUID() {
        if (uuid == null) {
            uuid = new ArrayList<String>();
        }
        return this.uuid;
    }

    /**
     * Gets the value of the keyEncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyEncode() {
        return keyEncode;
    }

    /**
     * Sets the value of the keyEncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyEncode(String value) {
        this.keyEncode = value;
    }

}
