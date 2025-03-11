/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "pedido", catalog = "supermarket", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByNitem", query = "SELECT p FROM Pedido p WHERE p.nitem = :nitem"),
    @NamedQuery(name = "Pedido.findByCaixa", query = "SELECT p FROM Pedido p WHERE p.caixa = :caixa"),
    @NamedQuery(name = "Pedido.findByNome", query = "SELECT p FROM Pedido p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pedido.findByValor", query = "SELECT p FROM Pedido p WHERE p.valor = :valor"),
    @NamedQuery(name = "Pedido.findByUnit", query = "SELECT p FROM Pedido p WHERE p.unit = :unit"),
    @NamedQuery(name = "Pedido.findByCodebar", query = "SELECT p FROM Pedido p WHERE p.codebar = :codebar")})
public class Pedido implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nitem")
    private String nitem;
    @Basic(optional = false)
    @Column(name = "caixa")
    private String caixa;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "unit")
    private int unit;
    @Basic(optional = false)
    @Column(name = "codebar")
    private String codebar;

    public Pedido() {
    }

    public Pedido(String nitem) {
        this.nitem = nitem;
    }

    public Pedido(String nitem, String caixa, String nome, BigDecimal valor, int unit, String codebar) {
        this.nitem = nitem;
        this.caixa = caixa;
        this.nome = nome;
        this.valor = valor;
        this.unit = unit;
        this.codebar = codebar;
    }

    public String getNitem() {
        return nitem;
    }

    public void setNitem(String nitem) {
        String oldNitem = this.nitem;
        this.nitem = nitem;
        changeSupport.firePropertyChange("nitem", oldNitem, nitem);
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        String oldCaixa = this.caixa;
        this.caixa = caixa;
        changeSupport.firePropertyChange("caixa", oldCaixa, caixa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        BigDecimal oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        int oldUnit = this.unit;
        this.unit = unit;
        changeSupport.firePropertyChange("unit", oldUnit, unit);
    }

    public String getCodebar() {
        return codebar;
    }

    public void setCodebar(String codebar) {
        String oldCodebar = this.codebar;
        this.codebar = codebar;
        changeSupport.firePropertyChange("codebar", oldCodebar, codebar);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nitem != null ? nitem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.nitem == null && other.nitem != null) || (this.nitem != null && !this.nitem.equals(other.nitem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Pedido[ nitem=" + nitem + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
