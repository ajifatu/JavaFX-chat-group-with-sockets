package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Messages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "messageContent")
    private String messageContent;
    @Basic
    @Column(name = "messageDate")
    private Date messageDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Messages messages = (Messages) o;
        return id == messages.id && Objects.equals(messageContent, messages.messageContent) && Objects.equals(messageDate, messages.messageDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, messageContent, messageDate);
    }

    @OneToMany
    private Collection<Users> idUser;

    public Collection<Users> getIdUser() {
        return idUser;
    }

    public void setIdUser(Collection<Users> idUser) {
        this.idUser = idUser;
    }
}
