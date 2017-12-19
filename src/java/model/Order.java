package model;

/**
 *
 * @author fetnat
 */
import java.io.Serializable;
import java.util.Date;
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

@Entity
@Table(name = "ORDER_PRO")

public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ORDERID")
    private int orID;

    @Column(name = "ORDERDATE")
    private Date orDate;
    
     @Column(name = "QUANTITY")
    private int qty;
     
     @Column(name = "TOTAL_PRICE")
    private double price;
 
        @OneToOne
	@JoinColumn(name = "U_NAME")
	private Customer customer;

        @OneToOne
	@JoinColumn(name = "shipId")
	private ShippingAddress shippingAddress;

	@OneToOne
	@JoinColumn(name = "BILLID")
	private BillingAddress billingAddress;

 

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTID", nullable = false, //
            foreignKey = @ForeignKey(name = "custID_FK"))
    private Customer custID;*/

    public Order() {
    }

    public int getOrID() {
        return orID;
    }

    public void setOrID(int orID) {
        this.orID = orID;
    }


    public Date getOrDate() {
        return orDate;
    }

    public void setOrDate(Date orDate) {
        this.orDate = orDate;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    

    
    
}
