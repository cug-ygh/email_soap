
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _ValidateEmailAddressResponse_QNAME = new QName("http://Server/", "validateEmailAddressResponse");
    private final static QName _SendManyEmail_QNAME = new QName("http://Server/", "send_many_email");
    private final static QName _TestWebService_QNAME = new QName("http://Server/", "testWebService");
    private final static QName _SendMassTextingResponse_QNAME = new QName("http://Server/", "send_mass_textingResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://Server/", "send_emailResponse");
    private final static QName _ValidateEmailAddress_QNAME = new QName("http://Server/", "validateEmailAddress");
    private final static QName _SendEmail_QNAME = new QName("http://Server/", "send_email");
    private final static QName _SendManyEmailResponse_QNAME = new QName("http://Server/", "send_many_emailResponse");
    private final static QName _SendMassTexting_QNAME = new QName("http://Server/", "send_mass_texting");
    private final static QName _TestWebServiceResponse_QNAME = new QName("http://Server/", "testWebServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestWebService }
     * 
     */
    public TestWebService createTestWebService() {
        return new TestWebService();
    }

    /**
     * Create an instance of {@link SendManyEmail }
     * 
     */
    public SendManyEmail createSendManyEmail() {
        return new SendManyEmail();
    }

    /**
     * Create an instance of {@link ValidateEmailAddressResponse }
     * 
     */
    public ValidateEmailAddressResponse createValidateEmailAddressResponse() {
        return new ValidateEmailAddressResponse();
    }

    /**
     * Create an instance of {@link SendMassTexting }
     * 
     */
    public SendMassTexting createSendMassTexting() {
        return new SendMassTexting();
    }

    /**
     * Create an instance of {@link TestWebServiceResponse }
     * 
     */
    public TestWebServiceResponse createTestWebServiceResponse() {
        return new TestWebServiceResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendManyEmailResponse }
     * 
     */
    public SendManyEmailResponse createSendManyEmailResponse() {
        return new SendManyEmailResponse();
    }

    /**
     * Create an instance of {@link ValidateEmailAddress }
     * 
     */
    public ValidateEmailAddress createValidateEmailAddress() {
        return new ValidateEmailAddress();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendMassTextingResponse }
     * 
     */
    public SendMassTextingResponse createSendMassTextingResponse() {
        return new SendMassTextingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateEmailAddressResponse")
    public JAXBElement<ValidateEmailAddressResponse> createValidateEmailAddressResponse(ValidateEmailAddressResponse value) {
        return new JAXBElement<ValidateEmailAddressResponse>(_ValidateEmailAddressResponse_QNAME, ValidateEmailAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendManyEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_many_email")
    public JAXBElement<SendManyEmail> createSendManyEmail(SendManyEmail value) {
        return new JAXBElement<SendManyEmail>(_SendManyEmail_QNAME, SendManyEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "testWebService")
    public JAXBElement<TestWebService> createTestWebService(TestWebService value) {
        return new JAXBElement<TestWebService>(_TestWebService_QNAME, TestWebService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMassTextingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_mass_textingResponse")
    public JAXBElement<SendMassTextingResponse> createSendMassTextingResponse(SendMassTextingResponse value) {
        return new JAXBElement<SendMassTextingResponse>(_SendMassTextingResponse_QNAME, SendMassTextingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_emailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmailAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateEmailAddress")
    public JAXBElement<ValidateEmailAddress> createValidateEmailAddress(ValidateEmailAddress value) {
        return new JAXBElement<ValidateEmailAddress>(_ValidateEmailAddress_QNAME, ValidateEmailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_email")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendManyEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_many_emailResponse")
    public JAXBElement<SendManyEmailResponse> createSendManyEmailResponse(SendManyEmailResponse value) {
        return new JAXBElement<SendManyEmailResponse>(_SendManyEmailResponse_QNAME, SendManyEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMassTexting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "send_mass_texting")
    public JAXBElement<SendMassTexting> createSendMassTexting(SendMassTexting value) {
        return new JAXBElement<SendMassTexting>(_SendMassTexting_QNAME, SendMassTexting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "testWebServiceResponse")
    public JAXBElement<TestWebServiceResponse> createTestWebServiceResponse(TestWebServiceResponse value) {
        return new JAXBElement<TestWebServiceResponse>(_TestWebServiceResponse_QNAME, TestWebServiceResponse.class, null, value);
    }

}
