package uk.ac.ebi.efo.status;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Simon Jupp
 * @date 22/12/2016
 * Samples, Phenotypes and Ontologies Team, EMBL-EBI
 */
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = null;
        try {
            out = resp.getWriter();
            out.println("OK");
        }
        finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }

    }

}