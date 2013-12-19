
package com.certus.facturehoy.ws2.cfdi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsCancelacionObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsCancelacionObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arreglo" type="{http://cfdi.ws2.facturehoy.certus.com/}wsItemCancelacionObj" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsCancelacionObj", propOrder = {
    "arreglo"
})
public class WsCancelacionObj {

    @XmlElement(nillable = true)
    protected List<WsItemCancelacionObj> arreglo;

    /**
     * Gets the value of the arreglo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arreglo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArreglo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsItemCancelacionObj }
     * 
     * 
     */
    public List<WsItemCancelacionObj> getArreglo() {
        if (arreglo == null) {
            arreglo = new ArrayList<WsItemCancelacionObj>();
        }
        return this.arreglo;
    }

}
