import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    public void bar() {
        Foo foo = new Foo();

        String returnedFoo = foo.doFoo();

        assertEquals("foo", returnedFoo);
    }
}