package ManasiHibernatepro;

import javax.persistence.Entity;
import javax.persistence.Id;
//this class is entity class
@Entity
public class Food {
	@Id
    private int foodId;
	private String foodName;
	
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + "]";
	}
	
	
	
		

	}


