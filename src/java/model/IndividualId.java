package model;
// Generated 21 Feb 2016 9:49:20 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IndividualId generated by hbm2java
 */
@Embeddable
public class IndividualId  implements java.io.Serializable {


     private String identityNumber;
     private int insuranceInsuranceId;

    public IndividualId() {
    }

    public IndividualId(String identityNumber, int insuranceInsuranceId) {
       this.identityNumber = identityNumber;
       this.insuranceInsuranceId = insuranceInsuranceId;
    }
   


    @Column(name="identity_number", unique=true, nullable=false, length=13)
    public String getIdentityNumber() {
        return this.identityNumber;
    }
    
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
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
		 if ( !(other instanceof IndividualId) ) return false;
		 IndividualId castOther = ( IndividualId ) other; 
         
		 return ( (this.getIdentityNumber()==castOther.getIdentityNumber()) || ( this.getIdentityNumber()!=null && castOther.getIdentityNumber()!=null && this.getIdentityNumber().equals(castOther.getIdentityNumber()) ) )
 && (this.getInsuranceInsuranceId()==castOther.getInsuranceInsuranceId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentityNumber() == null ? 0 : this.getIdentityNumber().hashCode() );
         result = 37 * result + this.getInsuranceInsuranceId();
         return result;
   }   


}


