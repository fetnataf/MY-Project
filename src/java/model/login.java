package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author fetnat
 */

@Entity
@Table(name = "login")
public class login implements Serializable{

    @NotEmpty
    @Size(min = 1, max = 50)
    @Id
    @Column(name="USERNAME")
    private String username;
    @NotEmpty
    @Size(min = 1, max = 20)
    @Column(name="PASSWORD")
    private String password;
    
   @OneToOne
   @JoinColumn(name = "U_NAME")
   private Customer custID;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 public Customer getCustID() {
        return custID;
    }

    public void setCustID(Customer custID) {
        this.custID = custID;
    }
}
