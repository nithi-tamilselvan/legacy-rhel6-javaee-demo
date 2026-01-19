// src/main/java/com/example/LegacyServlet.java
package com.example;

import javax.servlet.http.HttpServlet; // old javax.servlet
import java.util.Date;

public class LegacyServlet extends HttpServlet {
    private Date oldDate = new Date(); // old java.util.Date usage

    public void doGet() {
        // Simulate legacy code
    }
}
