package junit5.extensions.order;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SecondExtension implements AfterEachCallback {

    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("SecondExtension afterEach method call");
    }
}
