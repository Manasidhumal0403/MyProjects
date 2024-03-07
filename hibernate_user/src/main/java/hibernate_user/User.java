package hibernate_user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	@Column(unique=true)
	private long phone;
	@Column(unique=true)
	private String email;
	private String password;
	private String faceBOOK;
	private String instagram;
	private String snapChat;
	private String whatsappp;
	private String Twitter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFaceBOOK() {
		return faceBOOK;
	}
	public void setFaceBOOK(String faceBOOK) {
		this.faceBOOK = faceBOOK;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getSnapChat() {
		return snapChat;
	}
	public void setSnapChat(String snapChat) {
		this.snapChat = snapChat;
	}
	public String getWhatsappp() {
		return whatsappp;
	}
	public void setWhatsappp(String whatsappp) {
		this.whatsappp = whatsappp;
	}
	public String getTwitter() {
		return Twitter;
	}
	public void setTwitter(String twitter) {
		Twitter = twitter;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", faceBOOK=" + faceBOOK + ", instagram=" + instagram + ", snapChat=" + snapChat + ", whatsappp="
				+ whatsappp + ", Twitter=" + Twitter + "]";
	}
	

}
