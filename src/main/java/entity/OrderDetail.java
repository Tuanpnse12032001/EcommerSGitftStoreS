package entity;

import com.gifthommie.backend.dto.OrderDetailDTO;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
	public OrderDetail() {
		
	}
	
	public OrderDetail(OrderDetailDTO odDTO) {
		this.setId(odDTO.getId());
		this.setOrderId(odDTO.getOrderId());
		this.setProductId(odDTO.getProductId());
		this.setPrice(odDTO.getPrice());
		this.setQuantity(odDTO.getQuantity());
		this.setRating(odDTO.getRating());
		this.setFeedback(odDTO.getFeedback());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "price")
	private Float price;
	
	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "rating")
	private Float rating;
	
	@Column(name = "feedback")
	private String feedback;

	@Column(name = "feedback_time")
	private LocalDateTime feedbackTime;
	
	public LocalDateTime getFeedbackTime() {
		return feedbackTime;
	}

	public void setFeedbackTime(LocalDateTime feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Float getRating() {
		if(rating == null)
			return 0f;
		
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public OrderDetail(Integer orderId, Integer productId, Float price, Integer quantity) {
		
		this.orderId = orderId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
