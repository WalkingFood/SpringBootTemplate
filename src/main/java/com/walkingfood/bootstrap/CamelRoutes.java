package com.walkingfood.bootstrap;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Andrew Fooden on 5/13/2015.
 * Part of SpringBootTemplate.
 */
@Component
public class CamelRoutes extends SpringRouteBuilder {

    @Override
    public void configure() throws Exception {

        //Building a route from explicitly declared Strings
        from("seda:beginning").to("seda:end").end();

        //Building a route from properties extracted from application.yml
        from("{{routes.from.start}}")
                .to("{{routes.to.finish}}");
    }
}
