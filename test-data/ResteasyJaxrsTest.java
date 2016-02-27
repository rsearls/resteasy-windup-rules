
import org.jboss.resteasy.util.URLUtils;
import org.jboss.resteasy.test.TJWSServletContainer;
import org.jboss.resteasy.spi.WriterException;
import org.jboss.resteasy.spi.validation.GeneralValidator;
import org.jboss.resteasy.spi.touri.MappedByAnnotationResolver;
import org.jboss.resteasy.spi.metadata.ResourceClass;
import org.jboss.resteasy.spi.interception.ClientExecutionInterceptor;
import org.jboss.resteasy.specimpl.PathSegmentImpl;
import org.jboss.resteasy.plugins.server.tjws.TJWSServletDispatcher;
import org.jboss.resteasy.plugins.server.servlet.ServletSecurityContext;
import org.jboss.resteasy.plugins.server.resourcefactory.POJOResourceFactory;
import org.jboss.resteasy.plugins.server.embedded.SecurityDomain;
import org.jboss.resteasy.plugins.providers.JaxrsFormProvider;
import org.jboss.resteasy.plugins.interceptors.encoding.GZIPEncodingInterceptor;
import org.jboss.resteasy.plugins.interceptors.CacheControlFeature;
import org.jboss.resteasy.plugins.delegates.NewCookieHeaderDelegate;
import org.jboss.resteasy.mock.MockHttpRequest;
import org.jboss.resteasy.logging.impl.Log4jLogger;
import org.jboss.resteasy.core.SynchronousExecutionContext;
import org.jboss.resteasy.core.interception.ResponseContainerRequestContext;
import org.jboss.resteasy.core.FormInjector;
import org.jboss.resteasy.client.ProxyConfig;
import org.jboss.resteasy.client.exception.ResteasyMalformedCookieException;
import org.jboss.resteasy.client.exception.mapper.ClientExceptionMapper;
import org.jboss.resteasy.client.core.marshallers.PathParamMarshaller;
import org.jboss.resteasy.client.core.extractors.ResponseObjectEntityExtractorFactory;
import org.jboss.resteasy.client.core.extractors.ClientRequestContext;
import org.jboss.resteasy.client.core.executors.URLConnectionClientExecutor;
import org.jboss.resteasy.client.cache.LightweightBrowserCache;
import org.jboss.resteasy.api.validation.ConstraintType;
import org.jboss.resteasy.annotations.StringParameterUnmarshallerBinder;
import org.jboss.resteasy.annotations.interception.RedirectPrecedence;
import org.jboss.resteasy.annotations.GZIP;
        
/* modules/system/layers/base/org/jboss/resteasy/resteasy-jaxrs/main/resteasy-jaxrs-3.0.11.Final.jar */        
public class ResteasyJaxrsTest {
  
}