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

/**
 * Occupation generated by hbm2java
 */
@Entity
@Table(name="occupation"
    ,catalog="clienteledbsystem"
)
public class Occupation  implements java.io.Serializable {


     private int jobId;
     private String jobType;
     private Double monthlySalary;
     private Set<Client> clients = new HashSet<Client>(0);

    public Occupation() {
    }

	
    public Occupation(int jobId) {
        this.jobId = jobId;
    }
    public Occupation(int jobId, String jobType, Double monthlySalary, Set<Client> clients) {
       this.jobId = jobId;
       this.jobType = jobType;
       this.monthlySalary = monthlySalary;
       this.clients = clients;
    }
   
     @Id 

    
    @Column(name="job_id", unique=true, nullable=false)
    public int getJobId() {
        return this.jobId;
    }
    
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    
    @Column(name="job_type", length=100)
    public String getJobType() {
        return this.jobType;
    }
    
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    
    @Column(name="monthly_salary", precision=22, scale=0)
    public Double getMonthlySalary() {
        return this.monthlySalary;
    }
    
    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="occupation")
    public Set<Client> getClients() {
        return this.clients;
    }
    
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }




}


