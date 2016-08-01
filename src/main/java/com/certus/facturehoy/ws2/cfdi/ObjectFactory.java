
package com.certus.facturehoy.ws2.cfdi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.certus.facturehoy.ws2.cfdi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelarCFDIResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "CancelarCFDIResponse");
    private final static QName _CancelarResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "CancelarResponse");
    private final static QName _EmitirTimbrar_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "EmitirTimbrar");
    private final static QName _RecuperarAcuse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "RecuperarAcuse");
    private final static QName _CancelaOtroPACResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "CancelaOtroPACResponse");
    private final static QName _CancelaOtroPAC_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "CancelaOtroPAC");
    private final static QName _KeyStoreException_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "KeyStoreException");
    private final static QName _RecuperarAcuseCancelacion_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "RecuperarAcuseCancelacion");
    private final static QName _RecuperarAcuseCancelacionResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "RecuperarAcuseCancelacionResponse");
    private final static QName _Cancelar_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "Cancelar");
    private final static QName _CancelarCFDI_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "CancelarCFDI");
    private final static QName _RecuperarAcuseResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "RecuperarAcuseResponse");
    private final static QName _EmitirTimbrarResponse_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "EmitirTimbrarResponse");
    private final static QName _EmitirTimbrarXml_QNAME = new QName("", "xml");
    private final static QName _CancelaOtroPACPFX_QNAME = new QName("", "PFX");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.certus.facturehoy.ws2.cfdi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelaOtroPAC }
     * 
     */
    public CancelaOtroPAC createCancelaOtroPAC() {
        return new CancelaOtroPAC();
    }

    /**
     * Create an instance of {@link CancelaOtroPACResponse }
     * 
     */
    public CancelaOtroPACResponse createCancelaOtroPACResponse() {
        return new CancelaOtroPACResponse();
    }

    /**
     * Create an instance of {@link RecuperarAcuse }
     * 
     */
    public RecuperarAcuse createRecuperarAcuse() {
        return new RecuperarAcuse();
    }

    /**
     * Create an instance of {@link Cancelar }
     * 
     */
    public Cancelar createCancelar() {
        return new Cancelar();
    }

    /**
     * Create an instance of {@link CancelarCFDI }
     * 
     */
    public CancelarCFDI createCancelarCFDI() {
        return new CancelarCFDI();
    }

    /**
     * Create an instance of {@link RecuperarAcuseCancelacion }
     * 
     */
    public RecuperarAcuseCancelacion createRecuperarAcuseCancelacion() {
        return new RecuperarAcuseCancelacion();
    }

    /**
     * Create an instance of {@link RecuperarAcuseCancelacionResponse }
     * 
     */
    public RecuperarAcuseCancelacionResponse createRecuperarAcuseCancelacionResponse() {
        return new RecuperarAcuseCancelacionResponse();
    }

    /**
     * Create an instance of {@link KeyStoreException }
     * 
     */
    public KeyStoreException createKeyStoreException() {
        return new KeyStoreException();
    }

    /**
     * Create an instance of {@link EmitirTimbrarResponse }
     * 
     */
    public EmitirTimbrarResponse createEmitirTimbrarResponse() {
        return new EmitirTimbrarResponse();
    }

    /**
     * Create an instance of {@link RecuperarAcuseResponse }
     * 
     */
    public RecuperarAcuseResponse createRecuperarAcuseResponse() {
        return new RecuperarAcuseResponse();
    }

    /**
     * Create an instance of {@link CancelarCFDIResponse }
     * 
     */
    public CancelarCFDIResponse createCancelarCFDIResponse() {
        return new CancelarCFDIResponse();
    }

    /**
     * Create an instance of {@link EmitirTimbrar }
     * 
     */
    public EmitirTimbrar createEmitirTimbrar() {
        return new EmitirTimbrar();
    }

    /**
     * Create an instance of {@link CancelarResponse }
     * 
     */
    public CancelarResponse createCancelarResponse() {
        return new CancelarResponse();
    }

    /**
     * Create an instance of {@link WsCancelacionObj }
     * 
     */
    public WsCancelacionObj createWsCancelacionObj() {
        return new WsCancelacionObj();
    }

    /**
     * Create an instance of {@link WsItemCancelacionObj }
     * 
     */
    public WsItemCancelacionObj createWsItemCancelacionObj() {
        return new WsItemCancelacionObj();
    }

    /**
     * Create an instance of {@link WsResponseBO }
     * 
     */
    public WsResponseBO createWsResponseBO() {
        return new WsResponseBO();
    }

    /**
     * Create an instance of {@link WsResponseCancelacionBO }
     * 
     */
    public WsResponseCancelacionBO createWsResponseCancelacionBO() {
        return new WsResponseCancelacionBO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCFDIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "CancelarCFDIResponse")
    public JAXBElement<CancelarCFDIResponse> createCancelarCFDIResponse(CancelarCFDIResponse value) {
        return new JAXBElement<CancelarCFDIResponse>(_CancelarCFDIResponse_QNAME, CancelarCFDIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "CancelarResponse")
    public JAXBElement<CancelarResponse> createCancelarResponse(CancelarResponse value) {
        return new JAXBElement<CancelarResponse>(_CancelarResponse_QNAME, CancelarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmitirTimbrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "EmitirTimbrar")
    public JAXBElement<EmitirTimbrar> createEmitirTimbrar(EmitirTimbrar value) {
        return new JAXBElement<EmitirTimbrar>(_EmitirTimbrar_QNAME, EmitirTimbrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarAcuse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "RecuperarAcuse")
    public JAXBElement<RecuperarAcuse> createRecuperarAcuse(RecuperarAcuse value) {
        return new JAXBElement<RecuperarAcuse>(_RecuperarAcuse_QNAME, RecuperarAcuse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaOtroPACResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "CancelaOtroPACResponse")
    public JAXBElement<CancelaOtroPACResponse> createCancelaOtroPACResponse(CancelaOtroPACResponse value) {
        return new JAXBElement<CancelaOtroPACResponse>(_CancelaOtroPACResponse_QNAME, CancelaOtroPACResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaOtroPAC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "CancelaOtroPAC")
    public JAXBElement<CancelaOtroPAC> createCancelaOtroPAC(CancelaOtroPAC value) {
        return new JAXBElement<CancelaOtroPAC>(_CancelaOtroPAC_QNAME, CancelaOtroPAC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyStoreException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "KeyStoreException")
    public JAXBElement<KeyStoreException> createKeyStoreException(KeyStoreException value) {
        return new JAXBElement<KeyStoreException>(_KeyStoreException_QNAME, KeyStoreException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarAcuseCancelacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "RecuperarAcuseCancelacion")
    public JAXBElement<RecuperarAcuseCancelacion> createRecuperarAcuseCancelacion(RecuperarAcuseCancelacion value) {
        return new JAXBElement<RecuperarAcuseCancelacion>(_RecuperarAcuseCancelacion_QNAME, RecuperarAcuseCancelacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarAcuseCancelacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "RecuperarAcuseCancelacionResponse")
    public JAXBElement<RecuperarAcuseCancelacionResponse> createRecuperarAcuseCancelacionResponse(RecuperarAcuseCancelacionResponse value) {
        return new JAXBElement<RecuperarAcuseCancelacionResponse>(_RecuperarAcuseCancelacionResponse_QNAME, RecuperarAcuseCancelacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "Cancelar")
    public JAXBElement<Cancelar> createCancelar(Cancelar value) {
        return new JAXBElement<Cancelar>(_Cancelar_QNAME, Cancelar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCFDI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "CancelarCFDI")
    public JAXBElement<CancelarCFDI> createCancelarCFDI(CancelarCFDI value) {
        return new JAXBElement<CancelarCFDI>(_CancelarCFDI_QNAME, CancelarCFDI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarAcuseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "RecuperarAcuseResponse")
    public JAXBElement<RecuperarAcuseResponse> createRecuperarAcuseResponse(RecuperarAcuseResponse value) {
        return new JAXBElement<RecuperarAcuseResponse>(_RecuperarAcuseResponse_QNAME, RecuperarAcuseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmitirTimbrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cfdi.ws2.facturehoy.certus.com/", name = "EmitirTimbrarResponse")
    public JAXBElement<EmitirTimbrarResponse> createEmitirTimbrarResponse(EmitirTimbrarResponse value) {
        return new JAXBElement<EmitirTimbrarResponse>(_EmitirTimbrarResponse_QNAME, EmitirTimbrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xml", scope = EmitirTimbrar.class)
    public JAXBElement<byte[]> createEmitirTimbrarXml(byte[] value) {
        return new JAXBElement<byte[]>(_EmitirTimbrarXml_QNAME, byte[].class, EmitirTimbrar.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PFX", scope = CancelaOtroPAC.class)
    public JAXBElement<byte[]> createCancelaOtroPACPFX(byte[] value) {
        return new JAXBElement<byte[]>(_CancelaOtroPACPFX_QNAME, byte[].class, CancelaOtroPAC.class, ((byte[]) value));
    }

}
