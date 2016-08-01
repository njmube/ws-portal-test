
package com.certus.facturehoy.ws2.cfdi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelaOtroPAC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelaOtroPAC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasenia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PFXPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PFX" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="idServicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelaOtroPAC", propOrder = {
    "usuario",
    "contrasenia",
    "rfc",
    "uuid",
    "pfxPassword",
    "pfx",
    "idServicio"
})
public class CancelaOtroPAC {

    protected String usuario;
    protected String contrasenia;
    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "UUID", nillable = true)
    protected List<String> uuid;
    @XmlElement(name = "PFXPassword")
    protected String pfxPassword;
    @XmlElementRef(name = "PFX", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> pfx;
    protected int idServicio;

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
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
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
     * Gets the value of the pfxPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFXPassword() {
        return pfxPassword;
    }

    /**
     * Sets the value of the pfxPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFXPassword(String value) {
        this.pfxPassword = value;
    }

    /**
     * Gets the value of the pfx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPFX() {
        return pfx;
    }

    /**
     * Sets the value of the pfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPFX(JAXBElement<byte[]> value) {
        this.pfx = value;
    }

    /**
     * Gets the value of the idServicio property.
     * 
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * Sets the value of the idServicio property.
     * 
     */
    public void setIdServicio(int value) {
        this.idServicio = value;
    }

}
