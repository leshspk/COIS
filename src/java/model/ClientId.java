package model;
// Generated 21 Feb 2016 9:49:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClientId generated by hbm2java
 */
@Embeddable
public class ClientId  implements java.io.Serializable {


     private int clientId;
     private int occupationJobId;
     private int accountAccountId;
     private int insuranceInsuranceId;

    public ClientId() {
    }

    public ClientId(int clientId, int occupationJobId, int accountAccountId, int insuranceInsuranceId) {
       this.clientId = clientId;
       this.occupationJobId = occupationJobId;
       this.accountAccountId = accountAccountId;
       this.insuranceInsuranceId = insuranceInsuranceId;
    }
   


    @Column(name="client_id", unique=true, nullable=false)
    public int getClientId() {
        return this.clientId;
    }
    
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    @Column(name="occupation_job_id", unique=true, nullable=false)
    public int getOccupationJobId() {
        return this.occupationJobId;
    }
    
    public void setOccupationJobId(int occupationJobId) {
        this.occupationJobId = occupationJobId;
    }


    @Column(name="account_account_id", unique=true, nullable=false)
    public int getAccountAccountId() {
        return this.accountAccountId;
    }
    
    public void setAccountAccountId(int accountAccountId) {
        this.accountAccountId = accountAccountId;
    }


    @Column(name="insurance_insurance_id", unique=true, nullable=false)
    public int getInsuranceInsuranceId() {
        return this.insuranceInsuranceId;
    }
    
    public void setInsuranceInsuranceId(int insuranceInsuranceId) {
        this.insuranceInsuranceId = insuranceInsuranceId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClientId) ) return false;
		 ClientId castOther = ( ClientId ) other; 
         
		 return (this.getClientId()==castOther.getClientId())
 && (this.getOccupationJobId()==castOther.getOccupationJobId())
 && (this.getAccountAccountId()==castOther.getAccountAccountId())
 && (this.getInsuranceInsuranceId()==castOther.getInsuranceInsuranceId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getClientId();
         result = 37 * result + this.getOccupationJobId();
         result = 37 * result + this.getAccountAccountId();
         result = 37 * result + this.getInsuranceInsuranceId();
         return result;
   }   


}


