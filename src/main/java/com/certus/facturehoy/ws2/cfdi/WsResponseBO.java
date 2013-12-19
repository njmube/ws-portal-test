
package com.certus.facturehoy.ws2.cfdi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsResponseBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsResponseBO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrayFolios" type="{http://cfdi.ws2.facturehoy.certus.com/}wsCancelacionObj" minOccurs="0"/>
 *         &lt;element name="acuse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="arregloAcuse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cadenaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraTimbrado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="folioUDDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="rutaDescargaPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rutaDescargaXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selloDigitalEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selloDigitalTimbreSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsResponseBO", propOrder = {
    "arrayFolios",
    "acuse",
    "arregloAcuse",
    "cadenaOriginal",
    "fechaHoraTimbrado",
    "folioUDDI",
    "isError",
    "message",
    "pdf",
    "rutaDescargaPDF",
    "rutaDescargaXML",
    "selloDigitalEmisor",
    "selloDigitalTimbreSAT",
    "xml"
})
public class WsResponseBO {

    protected WsCancelacionObj arrayFolios;
    protected byte[] acuse;
    @XmlElement(nillable = true)
    protected List<byte[]> arregloAcuse;
    protected String cadenaOriginal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraTimbrado;
    protected String folioUDDI;
    protected Boolean isError;
    protected String message;
    @XmlElement(name = "PDF")
    protected byte[] pdf;
    protected String rutaDescargaPDF;
    protected String rutaDescargaXML;
    protected String selloDigitalEmisor;
    protected String selloDigitalTimbreSAT;
    @XmlElement(name = "XML")
    protected byte[] xml;

    /**
     * Gets the value of the arrayFolios property.
     * 
     * @return
     *     possible object is
     *     {@link WsCancelacionObj }
     *     
     */
    public WsCancelacionObj getArrayFolios() {
        return arrayFolios;
    }

    /**
     * Sets the value of the arrayFolios property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCancelacionObj }
     *     
     */
    public void setArrayFolios(WsCancelacionObj value) {
        this.arrayFolios = value;
    }

    /**
     * Gets the value of the acuse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAcuse() {
        return acuse;
    }

    /**
     * Sets the value of the acuse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAcuse(byte[] value) {
        this.acuse = value;
    }

    /**
     * Gets the value of the arregloAcuse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arregloAcuse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArregloAcuse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getArregloAcuse() {
        if (arregloAcuse == null) {
            arregloAcuse = new ArrayList<byte[]>();
        }
        return this.arregloAcuse;
    }

    /**
     * Gets the value of the cadenaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    /**
     * Sets the value of the cadenaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaOriginal(String value) {
        this.cadenaOriginal = value;
    }

    /**
     * Gets the value of the fechaHoraTimbrado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraTimbrado() {
        return fechaHoraTimbrado;
    }

    /**
     * Sets the value of the fechaHoraTimbrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraTimbrado(XMLGregorianCalendar value) {
        this.fechaHoraTimbrado = value;
    }

    /**
     * Gets the value of the folioUDDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioUDDI() {
        return folioUDDI;
    }

    /**
     * Sets the value of the folioUDDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioUDDI(String value) {
        this.folioUDDI = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPDF() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPDF(byte[] value) {
        this.pdf = value;
    }

    /**
     * Gets the value of the rutaDescargaPDF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaDescargaPDF() {
        return rutaDescargaPDF;
    }

    /**
     * Sets the value of the rutaDescargaPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaDescargaPDF(String value) {
        this.rutaDescargaPDF = value;
    }

    /**
     * Gets the value of the rutaDescargaXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaDescargaXML() {
        return rutaDescargaXML;
    }

    /**
     * Sets the value of the rutaDescargaXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaDescargaXML(String value) {
        this.rutaDescargaXML = value;
    }

    /**
     * Gets the value of the selloDigitalEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloDigitalEmisor() {
        return selloDigitalEmisor;
    }

    /**
     * Sets the value of the selloDigitalEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloDigitalEmisor(String value) {
        this.selloDigitalEmisor = value;
    }

    /**
     * Gets the value of the selloDigitalTimbreSAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloDigitalTimbreSAT() {
        return selloDigitalTimbreSAT;
    }

    /**
     * Sets the value of the selloDigitalTimbreSAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloDigitalTimbreSAT(String value) {
        this.selloDigitalTimbreSAT = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXML() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXML(byte[] value) {
        this.xml = value;
    }

}
