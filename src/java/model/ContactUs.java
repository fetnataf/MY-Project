package model;

/**
 *
 * @author fetnat
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "contus")
public class ContactUs {
    
    @Id
    @SequenceGenerator(name="seq",sequenceName="seqCon")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name="CID")
    private int ID;
    
    @NotEmpty
    @Column(name="EMAIL")
    private String cemail;
    
    @Column(name="MSG")
    private String msg;
    
    @Column(name="SUBJECT")
    private String sub;
    
   @OneToOne
   @JoinColumn(name = "U_NAME")
   private Customer custID;
    public ContactUs() {
    }

    public ContactUs(int ID, String cemail, String msg, String sub) {
        this.ID = ID;
        this.cemail = cemail;
        this.msg = msg;
        this.sub = sub;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
    
    
    
     public Customer getCustID() {
        return custID;
    }

    public void setCustID(Customer custID) {
        this.custID = custID;
    }
    
    
    
}
