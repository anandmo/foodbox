package in.codelog.foodbox.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer p_id;

	private String p_name;
	private String p_description;
	private String p_image;
	private Boolean p_instock;
	private Double p_cost;

	public Product() {
		super();
	}

	/*
	 * public Product(String p_name, String p_description, String p_image, Boolean
	 * p_instock) { super(); this.p_name = p_name; this.p_description =
	 * p_description; this.p_image = p_image; this.p_instock = p_instock; }
	 * 
	 * public Product(Integer p_id, String p_name, String p_description, String
	 * p_image, Boolean p_instock) { super(); this.p_id = p_id; this.p_name =
	 * p_name; this.p_description = p_description; this.p_image = p_image;
	 * this.p_instock = p_instock; }
	 */

	public Product(Integer p_id, String p_name, String p_description, String p_image, Boolean p_instock,
			Double p_cost) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_description = p_description;
		this.p_image = p_image;
		this.p_instock = p_instock;
		this.p_cost = p_cost;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_description() {
		return p_description;
	}

	public void setP_description(String p_description) {
		this.p_description = p_description;
	}

	public String getP_image() {
		return p_image;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public Boolean getP_instock() {
		return p_instock;
	}

	public void setP_instock(Boolean p_instock) {
		this.p_instock = p_instock;
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(p_description, p_id,
	 * p_image, p_instock, p_name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Product other = (Product) obj; return Objects.equals(p_description,
	 * other.p_description) && Objects.equals(p_id, other.p_id) &&
	 * Objects.equals(p_image, other.p_image) && Objects.equals(p_instock,
	 * other.p_instock) && Objects.equals(p_name, other.p_name); }
	 */

	public Double getP_cost() {
		return p_cost;
	}

	public void setP_cost(Double p_cost) {
		this.p_cost = p_cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(p_cost, p_description, p_id, p_image, p_instock, p_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(p_cost, other.p_cost) && Objects.equals(p_description, other.p_description)
				&& Objects.equals(p_id, other.p_id) && Objects.equals(p_image, other.p_image)
				&& Objects.equals(p_instock, other.p_instock) && Objects.equals(p_name, other.p_name);
	}

}
