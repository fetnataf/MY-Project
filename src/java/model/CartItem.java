package model;

/**
 *
 * @author fetnat
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.json.JSONException;




@Entity
@Table(name = "cartitem")
public class CartItem implements Serializable {

	private static final long serialVersionUID = -2455760938054036364L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartItemId;

	private int quantity;

	private double price;

	@ManyToOne
	@JoinColumn(name = "PROID")
	private Product product;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "cartId")
        //@JsonIgnore
	private Cart cart;

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quality) {
		this.quantity = quality;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}