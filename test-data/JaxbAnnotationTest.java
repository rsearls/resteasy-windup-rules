

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;
import org.jboss.resteasy.annotations.providers.jaxb.IgnoreMediaTypes;
import org.jboss.resteasy.annotations.providers.jaxb.JAXBConfig;
import org.jboss.resteasy.annotations.providers.jaxb.XmlHeader;
import org.jboss.resteasy.annotations.providers.jaxb.Stylesheet;
import org.jboss.resteasy.annotations.providers.jaxb.Formatted;
import org.jboss.resteasy.annotations.providers.jaxb.WrappedMap;
import org.jboss.resteasy.annotations.providers.jaxb.DoNotUseJAXBProvider;


public class JaxbAnnotationTest {

    @Wrapped
    public void testWrapped() {}

    @IgnoreMediaTypes
    public void testIgnoreMediaTypes() {}

    @JAXBConfig
    public void testJAXBConfig () {}

    @XmlHeader
    public void testXmlHeader () {}

    @Stylesheet
    public void testStylesheet () {}

    @Formatted
    public void testFormatted () {}

    @WrappedMap
    public void testWrappedMap () {}

    @DoNotUseJAXBProvider
    public void testDoNotUseJAXBProvider () {}

}