package com.aluracursos.screenmatch.excepcion;

public class ErrorDeConversionException extends RuntimeException {
    private String mensaje;

    public ErrorDeConversionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
