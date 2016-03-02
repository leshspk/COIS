package model;
// Generated 21 Feb 2016 9:49:20 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Administrator generated by hbm2java
 */
@Entity
@Table(name="administrator"
    ,catalog="clienteledbsystem"
    , uniqueConstraints = {@UniqueConstraint(columnNames="admin_name"), @UniqueConstraint(columnNames="account_account_id")} 
)
public class Administrator  implements java.io.Serializable {


     private AdministratorId id;
     private Account account;
     private String adminPassword;

    public Administrator() {
    }

	
    public Administrator(AdministratorId id, Account account) {
        this.id = id;
        this.account = account;
    }
    public Administrator(AdministratorId id, Account account, String adminPassword) {
       this.id = id;
       this.account = account;
       this.adminPassword = adminPassword;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="adminName", column=@Column(name="admin_name", unique=true, nullable=false, length=200) ), 
        @AttributeOverride(name="accountAccountId", column=@Column(name="account_account_id", unique=true, nullable=false) ) } )
    public AdministratorId getId() {
        return this.id;
    }
    
    public void setId(AdministratorId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="account_account_id", unique=true, nullable=false, insertable=false, updatable=false)
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

    
    @Column(name="admin_password", length=45)
    public String getAdminPassword() {
        return this.adminPassword;
    }
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }




}

