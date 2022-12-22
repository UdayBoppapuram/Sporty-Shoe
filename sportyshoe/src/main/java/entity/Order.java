package entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;

@EntityScan
@Table(name="orders")
public class Order {
	
	@Id
	@Generated(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Order() {
 
	}

	public Order(User user, Product product) {
		super();
		this.user = user;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", product=" + product + "]";
	}
	
	
	
	

}
