
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;


public class JaxbJsonTest {

    public TestExtends updateTestExtends(@Mapped(namespaceMap = {
        @XmlNsMap(jsonName = "test", namespace = "http://www.example.org/b/Test"),
        @XmlNsMap(jsonName = "can", namespace = "http://www.example.org/a/TestCanonical")
    }) TestExtends data)
    {
        return data;
    }

    public void testBagerFish(@BagerFish bf) {

    }
}
