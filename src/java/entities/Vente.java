/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TheGeek
 */
@Entity
@Table(name = "vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vente.findAll", query = "SELECT v FROM Vente v")
    , @NamedQuery(name = "Vente.findByNumeroV", query = "SELECT v FROM Vente v WHERE v.numeroV = :numeroV")
    , @NamedQuery(name = "Vente.findByDateV", query = "SELECT v FROM Vente v WHERE v.dateV = :dateV")})
public class Vente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroV")
    private Integer numeroV;
    @Column(name = "dateV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateV;

    public Vente() {
    }

    public Vente(Integer numeroV) {
        this.numeroV = numeroV;
    }

    public Integer getNumeroV() {
        return numeroV;
    }

    public void setNumeroV(Integer numeroV) {
        this.numeroV = numeroV;
    }

    public Date getDateV() {
        return dateV;
    }

    public void setDateV(Date dateV) {
        this.dateV = dateV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroV != null ? numeroV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vente)) {
            return false;
        }
        Vente other = (Vente) object;
        if ((this.numeroV == null && other.numeroV != null) || (this.numeroV != null && !this.numeroV.equals(other.numeroV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vente[ numeroV=" + numeroV + " ]";
    }
    
}
