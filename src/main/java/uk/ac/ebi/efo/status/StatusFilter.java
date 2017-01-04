package uk.ac.ebi.efo.status;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Simon Jupp
 * @date 22/12/2016
 * Samples, Phenotypes and Ontologies Team, EMBL-EBI
 */
public class StatusFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        servletRequest.setAttribute("health", true);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
    }
}

