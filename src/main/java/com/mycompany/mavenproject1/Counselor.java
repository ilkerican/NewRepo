/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "counselor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Counselor.findAll", query = "SELECT c FROM Counselor c"),
    @NamedQuery(name = "Counselor.findByCounselorId", query = "SELECT c FROM Counselor c WHERE c.counselorId = :counselorId"),
    @NamedQuery(name = "Counselor.findByFirstName", query = "SELECT c FROM Counselor c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Counselor.findByNickName", query = "SELECT c FROM Counselor c WHERE c.nickName = :nickName"),
    @NamedQuery(name = "Counselor.findByLastName", query = "SELECT c FROM Counselor c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Counselor.findByTelephone", query = "SELECT c FROM Counselor c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "Counselor.findByEmail", query = "SELECT c FROM Counselor c WHERE c.email = :email"),
    @NamedQuery(name = "Counselor.findByMemberSince", query = "SELECT c FROM Counselor c WHERE c.memberSince = :memberSince")})
public class Counselor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "counselor_id")
    private Short counselorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "member_since")
    @Temporal(TemporalType.DATE)
    private Date memberSince;

    public Counselor() {
    }

    public Counselor(Short counselorId) {
        this.counselorId = counselorId;
    }

    public Short getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(Short counselorId) {
        this.counselorId = counselorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (counselorId != null ? counselorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Counselor)) {
            return false;
        }
        Counselor other = (Counselor) object;
        if ((this.counselorId == null && other.counselorId != null) || (this.counselorId != null && !this.counselorId.equals(other.counselorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Counselor[ counselorId=" + counselorId + " ]";
    }
    
}
