#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;


public class MyAppTest {
    private static final Logger LOG = LoggerFactory.getLogger(MyAppTest.class);

    @Test
    public void myAppTest() {
        LOG.debug("hello test ");
        assertThat(true).isTrue();
    }
}
