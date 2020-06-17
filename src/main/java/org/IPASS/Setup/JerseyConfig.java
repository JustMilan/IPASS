package org.IPASS.Setup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("restservices")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("org.IPASS.webservices org.IPASS.security");
        register(RolesAllowedDynamicFeature.class);
    }
}
