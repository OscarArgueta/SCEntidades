/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviconvi.scentidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "cat_cliente_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatClienteVenta.findAll", query = "SELECT c FROM CatClienteVenta c")
    , @NamedQuery(name = "CatClienteVenta.findByCodCliente", query = "SELECT c FROM CatClienteVenta c WHERE c.catClienteVentaPK.codCliente = :codCliente")
    , @NamedQuery(name = "CatClienteVenta.findByNit", query = "SELECT c FROM CatClienteVenta c WHERE c.catClienteVentaPK.nit = :nit")
    , @NamedQuery(name = "CatClienteVenta.findByNombreCliente", query = "SELECT c FROM CatClienteVenta c WHERE c.nombreCliente = :nombreCliente")
    , @NamedQuery(name = "CatClienteVenta.findByFechaIngreso", query = "SELECT c FROM CatClienteVenta c WHERE c.fechaIngreso = :fechaIngreso")})
public class CatClienteVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CatClienteVentaPK catClienteVentaPK;
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Basic(optional = false)
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    public CatClienteVenta() {
    }

    public CatClienteVenta(CatClienteVentaPK catClienteVentaPK) {
        this.catClienteVentaPK = catClienteVentaPK;
    }

    public CatClienteVenta(CatClienteVentaPK catClienteVentaPK, String nombreCliente, Date fechaIngreso) {
        this.catClienteVentaPK = catClienteVentaPK;
        this.nombreCliente = nombreCliente;
        this.fechaIngreso = fechaIngreso;
    }

    public CatClienteVenta(CatClienteVentaPK catClienteVentaPK, String nombreCliente) {
        this.catClienteVentaPK = catClienteVentaPK;
        this.nombreCliente = nombreCliente;
    }

    public CatClienteVenta(int codCliente, String nit) {
        this.catClienteVentaPK = new CatClienteVentaPK(codCliente, nit);
    }

    public CatClienteVentaPK getCatClienteVentaPK() {
        return catClienteVentaPK;
    }

    public void setCatClienteVentaPK(CatClienteVentaPK catClienteVentaPK) {
        this.catClienteVentaPK = catClienteVentaPK;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catClienteVentaPK != null ? catClienteVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatClienteVenta)) {
            return false;
        }
        CatClienteVenta other = (CatClienteVenta) object;
        if ((this.catClienteVentaPK == null && other.catClienteVentaPK != null) || (this.catClienteVentaPK != null && !this.catClienteVentaPK.equals(other.catClienteVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.serviconvi.scentidades.CatClienteVenta[ catClienteVentaPK=" + catClienteVentaPK + " ]";
    }
    
}
