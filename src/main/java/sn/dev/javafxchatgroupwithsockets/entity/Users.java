package sn.dev.javafxchatgroupwithsockets.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "adhesionDate")
    private Date adhesionDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAdhesionDate() {
        return adhesionDate;
    }

    public void setAdhesionDate(Date adhesionDate) {
        this.adhesionDate = adhesionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && Objects.equals(username, users.username) && Objects.equals(adhesionDate, users.adhesionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, adhesionDate);
    }
}
