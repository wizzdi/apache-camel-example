package com.wizzdi.plugins.apache.camel;

import com.wizzdi.flexicore.boot.base.interfaces.Plugin;
import org.apache.camel.builder.RouteBuilder;
import org.pf4j.Extension;
import org.springframework.stereotype.Component;

@Component
@Extension
public class MyRoute extends RouteBuilder implements Plugin {

    @Override
    public void configure() throws Exception {
        from("timer:foo").to("log:bar");
    }
}