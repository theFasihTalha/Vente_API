/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TheGeek
 */
@Entity
@Table(name = "detailsvente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detailsvente.findAll", query = "SELECT d FROM Detailsvente d")
    , @NamedQuery(name = "Detailsvente.findByNumeroV", query = "SELECT d FROM Detailsvente d WHERE d.detailsventePK.numeroV = :numeroV")
    , @NamedQuery(name = "Detailsvente.findByCode", query = "SELECT d FROM Detailsvente d WHERE d.detailsventePK.code = :code")
    , @NamedQuery(name = "Detailsvente.findByQuantiteV", query = "SELECT d FROM Detailsvente d WHERE d.quantiteV = :quantiteV")
    , @NamedQuery(name = "Detailsvente.findByPrixV", query = "SELECT d FROM Detailsvente d WHERE d.prixV = :prixV")})
public class Detailsvente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailsventePK detailsventePK;
    @Column(name = "quantiteV")
    private Integer quantiteV;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prixV")
    private Float prixV;

    public Detailsvente() {
    }

    public Detailsvente(DetailsventePK detailsventePK) {
        this.detailsventePK = detailsventePK;
    }

    public Detailsvente(int numeroV, String code) {
        this.detailsventePK = new DetailsventePK(numeroV, code);
    }

    public DetailsventePK getDetailsventePK() {
        return detailsventePK;
    }

    public void setDetailsventePK(DetailsventePK detailsventePK) {
        this.detailsventePK = detailsventePK;
    }

    public Integer getQuantiteV() {
        return quantiteV;
    }

    public void setQuantiteV(Integer quantiteV) {
        this.quantiteV = quantiteV;
    }

    public Float getPrixV() {
        return prixV;
    }

    public void setPrixV(Float prixV) {
        this.prixV = prixV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailsventePK != null ? detailsventePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detailsvente)) {
            return false;
        }
        Detailsvente other = (Detailsvente) object;
        if ((this.detailsventePK == null && other.detailsventePK != null) || (this.detailsventePK != null && !this.detailsventePK.equals(other.detailsventePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Detailsvente[ detailsventePK=" + detailsventePK + " ]";
    }
    
}
