package com.example.test_spr_mandiri.entity;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Muhammad Iqbal Fadillah on 12/11/2022
 */
@Entity
@Table(name = "teams")
@DynamicUpdate
public class Teams implements Serializable {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private BigInteger id;

    @NotNull
    @Column(name = "user_id")
    private BigInteger user_id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "personal_team")
    private int personal_team;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getUser_id() {
        return user_id;
    }

    public void setUser_id(BigInteger user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonal_team() {
        return personal_team;
    }

    public void setPersonal_team(int personal_team) {
        this.personal_team = personal_team;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
