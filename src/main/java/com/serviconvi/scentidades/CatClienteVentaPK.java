/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviconvi.scentidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oscar
 */
@Embeddable
public class CatClienteVentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_cliente")
    private int codCliente;
    @Basic(optional = false)
    @Column(name = "nit")
    private String nit;

    public CatClienteVentaPK() {
    }

    public CatClienteVentaPK(int codCliente, String nit) {
        this.codCliente = codCliente;
        this.nit = nit;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCliente;
        hash += (nit != null ? nit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatClienteVentaPK)) {
            return false;
        }
        CatClienteVentaPK other = (CatClienteVentaPK) object;
        if (this.codCliente != other.codCliente) {
            return false;
        }
        if ((this.nit == null && other.nit != null) || (this.nit != null && !this.nit.equals(other.nit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.serviconvi.scentidades.CatClienteVentaPK[ codCliente=" + codCliente + ", nit=" + nit + " ]";
    }
    
}
