package model;
// Generated 21 Feb 2016 9:49:20 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account"
    ,catalog="clienteledbsystem"
)
public class Account  implements java.io.Serializable {


     private int accountId;
     private String accountType;
     private Set<Client> clients = new HashSet<Client>(0);
     private Set<Administrator> administrators = new HashSet<Administrator>(0);
     private Set<User> users = new HashSet<User>(0);

    public Account() {
    }	
    public Account(int accountId) {
        this.accountId = accountId;
    }
    public Account(int accountId, String accountType, Set<Client> clients, Set<Administrator> administrators, Set<User> users) {
       this.accountId = accountId;
       this.accountType = accountType;
       this.clients = clients;
       this.administrators = administrators;
       this.users = users;
    }
   
     @Id 

    
    @Column(name="account_id", unique=true, nullable=false)
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    
    @Column(name="account_type", length=45)
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Client> getClients() {
        return this.clients;
    }
    
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Administrator> getAdministrators() {
        return this.administrators;
    }
    
    public void setAdministrators(Set<Administrator> administrators) {
        this.administrators = administrators;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


