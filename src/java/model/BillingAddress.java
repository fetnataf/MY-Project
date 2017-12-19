
package model;

/**
 *
 * @author fetnat
 */
import java.io.Serializable;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "billingAddress")
public class BillingAddress implements Serializable {

	private static final long serialVersionUID = 1028098616457762743L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name="BILLID")
	private int billindAddressId;
        
        @Column(name="ADDRESS")
	private String address;
        
        @Column(name="CITY")
	private String city;
        
         @Column(name="PROVINCE")
	private String province;
         
          @Column(name="POSTAL")
	private String postalcode;
        

	
    @OneToOne
	@JoinColumn(name = "U_NAME")
    private Customer customer;


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getBillindAddressId() {
		return billindAddressId;
	}

	public void setBillindAddressId(int billindAddressId) {
		this.billindAddressId = billindAddressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }


}