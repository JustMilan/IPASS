package org.IPASS.security;

import org.IPASS.Gebruikers.Gebruiker;

import javax.ws.rs.core.SecurityContext;
import java.security.Principal;

public class MySecurityContext implements SecurityContext {
    private Gebruiker gebruiker;
    private String scheme;

    public MySecurityContext(Gebruiker user, String scheme) {
        this.gebruiker = user;
        this.scheme = scheme;
    }


    @Override
    public Principal getUserPrincipal() {
        return this.gebruiker;
    }

    @Override
    public boolean isUserInRole(String role) {
        if (gebruiker.krijgRol() != null) {
            return role.equals(gebruiker.krijgRol());
        }
        return false;
    }

    @Override
    public boolean isSecure() {
        return "https".equals(this.scheme);
    }

    @Override
    public String getAuthenticationScheme() {
        return SecurityContext.BASIC_AUTH;
    }
}
