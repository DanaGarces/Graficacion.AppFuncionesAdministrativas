package entidades;

import java.io.InputStream;
import java.sql.Date;

public class Aviso {

    private int idAviso;
    private String descripcion;
    private InputStream imagen;
    private Date fecha;

    //<editor-fold defaultstate="collapsed" desc="Gets & Sets">
    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    // </editor-fold>
}
