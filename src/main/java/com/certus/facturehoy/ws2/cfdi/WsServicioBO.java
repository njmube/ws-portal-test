
package com.certus.facturehoy.ws2.cfdi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsServicioBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsServicioBO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="array" type="{http://cfdi.ws2.facturehoy.certus.com/}wsServicioBO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cantidadCFDI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="folioFinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="folioInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProcess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ultimoFolioUsado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsServicioBO", propOrder = {
    "array",
    "cantidadCFDI",
    "folioFinal",
    "folioInicial",
    "idProcess",
    "mensaje",
    "nombreServicio",
    "serie",
    "ultimoFolioUsado"
})
public class WsServicioBO {

    @XmlElement(nillable = true)
    protected List<WsServicioBO> array;
    protected int cantidadCFDI;
    protected int folioFinal;
    protected int folioInicial;
    protected int idProcess;
    protected String mensaje;
    protected String nombreServicio;
    protected String serie;
    protected int ultimoFolioUsado;

    /**
     * Gets the value of the array property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the array property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsServicioBO }
     * 
     * 
     */
    public List<WsServicioBO> getArray() {
        if (array == null) {
            array = new ArrayList<WsServicioBO>();
        }
        return this.array;
    }

    /**
     * Gets the value of the cantidadCFDI property.
     * 
     */
    public int getCantidadCFDI() {
        return cantidadCFDI;
    }

    /**
     * Sets the value of the cantidadCFDI property.
     * 
     */
    public void setCantidadCFDI(int value) {
        this.cantidadCFDI = value;
    }

    /**
     * Gets the value of the folioFinal property.
     * 
     */
    public int getFolioFinal() {
        return folioFinal;
    }

    /**
     * Sets the value of the folioFinal property.
     * 
     */
    public void setFolioFinal(int value) {
        this.folioFinal = value;
    }

    /**
     * Gets the value of the folioInicial property.
     * 
     */
    public int getFolioInicial() {
        return folioInicial;
    }

    /**
     * Sets the value of the folioInicial property.
     * 
     */
    public void setFolioInicial(int value) {
        this.folioInicial = value;
    }

    /**
     * Gets the value of the idProcess property.
     * 
     */
    public int getIdProcess() {
        return idProcess;
    }

    /**
     * Sets the value of the idProcess property.
     * 
     */
    public void setIdProcess(int value) {
        this.idProcess = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the nombreServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreServicio() {
        return nombreServicio;
    }

    /**
     * Sets the value of the nombreServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreServicio(String value) {
        this.nombreServicio = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the ultimoFolioUsado property.
     * 
     */
    public int getUltimoFolioUsado() {
        return ultimoFolioUsado;
    }

    /**
     * Sets the value of the ultimoFolioUsado property.
     * 
     */
    public void setUltimoFolioUsado(int value) {
        this.ultimoFolioUsado = value;
    }

}
