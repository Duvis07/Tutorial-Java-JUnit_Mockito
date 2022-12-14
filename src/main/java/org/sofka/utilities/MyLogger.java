package org.sofka.utilities;

import java.util.logging.Logger;

/**
 * Clase para manejar el log del sistema
 *
 */
public class MyLogger {

    /**
     * Constructor privado
     */
    private MyLogger() {
        throw new IllegalStateException("MyLogger class");
    }

    /**
     * Crea la instancia de Logger
     * 
     * @return Instancia de Logger
     */
    public static Logger getInstance() {
        return Logger.getLogger("MyLogApp");
    }
}
