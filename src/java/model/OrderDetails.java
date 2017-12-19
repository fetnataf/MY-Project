package model;

/**
 *
 * @author fetnat
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = -6571020025726257848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerOrderId;

	@OneToOne
	@JoinColumn(name = "cartId")
	private Cart cart;

	@OneToOne
	@JoinColumn(name = "U_NAME")
	private Customer customer;

	@OneToOne
	@JoinColumn(name = "shipId")
	private ShippingAddress shippingAddress;

	@OneToOne
	@JoinColumn(name = "BILLID")
	private BillingAddress billingAddress;

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(String customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
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

}
    
    
    
    
    
    
    
    
    
    
    
    

