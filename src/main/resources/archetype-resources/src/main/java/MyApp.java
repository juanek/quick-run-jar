#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
    private static final Logger LOG = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        LOG.info("hello");
    }
}
