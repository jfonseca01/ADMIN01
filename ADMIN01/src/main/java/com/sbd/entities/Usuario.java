package com.sbd.entities;

import org.hibernate.loader.plan.spi.Return;

import javax.persistence.*;
import java.util.List;
@Entity
public class Usuario {
    private Long id;
    private String email;
    private String nombreUsuario;
    private String rol;
    @ManyToOne
    @JoinColumn(name="enterprise_id")
    private Enterprise enterprise;
    @OneToMany(mappedBy = "user")
    private List<Transaction> transactionList;

    public Usuario(Long id, String email, String nombreUsuario, String rol, Enterprise enterprise, List<Transaction> transactionList) {
        this.id = id;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.enterprise = enterprise;
        this.transactionList = transactionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", rol='" + rol + '\'' +
                ", enterprise=" + enterprise +
                ", transactionList=" + transactionList +
                '}';
    }
}
