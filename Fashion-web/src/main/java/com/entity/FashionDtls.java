
/**
 *
 * @author Anphan
 */
package com.entity;

public class FashionDtls {
	private int fashionId;
	private String fashionName;
	private String price;
	private String fashionCategory;
	private String status;
	private String size, photoName, email;

	public FashionDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FashionDtls(String fashionName, String size, String price, String fashionCategory, String status, String photoName, String email) {

		this.fashionName = fashionName;
		this.price = price;
		this.fashionCategory = fashionCategory;
		this.status = status;
		this.size = size;
		this.photoName = photoName;
		this.email = email;
	}

	public int getFashionId() {
		return fashionId;
	}

	public void setFashionId(int fashionId) {
		this.fashionId = fashionId;
	}

	public String getFashionName() {
		return fashionName;
	}

	public void setFashionName(String fashionName) {
		this.fashionName = fashionName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFashionCategory() {
		return fashionCategory;
	}

	public void setFashionCategory(String fashionCategory) {
		this.fashionCategory = fashionCategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "FashionDtls [fashionId=" + fashionId + ", fashionName=" + fashionName + ", price=" + price
				+ ", fashionCategory=" + fashionCategory + ", status=" + status + ", size=" + size + ", photoName="
				+ photoName + ", email=" + email + "]";
	}

}
