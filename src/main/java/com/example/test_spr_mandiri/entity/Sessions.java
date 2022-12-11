package com.example.test_spr_mandiri.entity;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author Muhammad Iqbal Fadillah on 12/11/2022
 */
@Entity
@Table(name = "sessions")
@DynamicUpdate
public class Sessions implements Serializable {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private String id;

    @NotNull
    @Column(name = "users_id" )
    private BigInteger users_id;

    @Column(name = "ip_address")
    private String ip_address;

    @Column(name = "user_agent")
    private String user_agent;

    @Column(name = "payload")
    private String payload;

    @Column(name = "last_activity")
    private int last_activity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getUsers_id() {
        return users_id;
    }

    public void setUsers_id(BigInteger users_id) {
        this.users_id = users_id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public int getLast_activity() {
        return last_activity;
    }

    public void setLast_activity(int last_activity) {
        this.last_activity = last_activity;
    }
}
