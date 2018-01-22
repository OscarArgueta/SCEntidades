/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviconvi.scentidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "cat_tipo_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatTipoVenta.findAll", query = "SELECT c FROM CatTipoVenta c")
    , @NamedQuery(name = "CatTipoVenta.findByCodigo", query = "SELECT c FROM CatTipoVenta c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "CatTipoVenta.findByDescripcion", query = "SELECT c FROM CatTipoVenta c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CatTipoVenta.findByImpuesto", query = "SELECT c FROM CatTipoVenta c WHERE c.impuesto = :impuesto")})
public class CatTipoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "impuesto")
    private BigDecimal impuesto;

    public CatTipoVenta() {
    }

    public CatTipoVenta(Integer codigo) {
        this.codigo = codigo;
    }

    public CatTipoVenta(Integer codigo, String descripcion, BigDecimal impuesto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.impuesto = impuesto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoVenta)) {
            return false;
        }
        CatTipoVenta other = (CatTipoVenta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}
