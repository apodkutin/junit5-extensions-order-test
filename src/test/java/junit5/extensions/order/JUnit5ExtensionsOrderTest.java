package junit5.extensions.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class JUnit5ExtensionsOrderTest {

    @Nested
    @DisplayName("ExtendWith as an array")
    @ExtendWith({FirstExtension.class, SecondExtension.class})
    class ExtendWithAsArray {

        @Test
        void extensionsOrderTest() {
        }

    }

    @Nested
    @DisplayName("ExtendWith as a separate annotations")
    @ExtendWith(FirstExtension.class)
    @ExtendWith(SecondExtension.class)
    class ExtendWithAsSeparateAnnotations {

        @Test
        void extensionsOrderTest() {
        }

    }
}
