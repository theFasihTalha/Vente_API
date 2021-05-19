/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author TheGeek
 */
@Embeddable
public class DetailsventePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroV")
    private int numeroV;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "code")
    private String code;

    public DetailsventePK() {
    }

    public DetailsventePK(int numeroV, String code) {
        this.numeroV = numeroV;
        this.code = code;
    }

    public int getNumeroV() {
        return numeroV;
    }

    public void setNumeroV(int numeroV) {
        this.numeroV = numeroV;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numeroV;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailsventePK)) {
            return false;
        }
        DetailsventePK other = (DetailsventePK) object;
        if (this.numeroV != other.numeroV) {
            return false;
        }
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetailsventePK[ numeroV=" + numeroV + ", code=" + code + " ]";
    }
    
}
