/**
 * 
 */
package com.foodallert.model;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public enum Allergen {
	
	EGG("Huevo", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-eggs-filled-100.png"),
	FISH("Pescado", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-fish-food-filled-100.png"),
	MILK("Leche", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-tetra-pak-filled-100.png"),
	OTHER_ALLERGENS("Otros alergenos", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-eggs-filled-100.png"),
	PEANUT("Cacahuate", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-peanuts-filled-100.png"),
	SHELLFISH("Mariscos", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-shrimp-and-lobster-filled-100.png"),
	SOY("Soya", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-soy-filled-100.png"),
	TREE_NUT("Nueces", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-nut-filled-100.png"),
	WHEAT("Gluten", "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-wheat-filled-100.png");
	
	private String spanish;
	private String imageURL;
	
	private Allergen(String spanish, String imageURL) {
		this.spanish = spanish;
		this.imageURL = imageURL;
	}

	public String getSpanish() {
		return spanish;
	}
	
	public String getImageURL() {
		return imageURL;
	}

	public static String getSpanish(String text) {
		for(Allergen allergen : Allergen.values()) {
			if(allergen.toString().equals(text.toUpperCase())) {
				return allergen.getSpanish();
			}
		}
		
		return "Otros alergenos";
	}
	
	public static String getAllergenImageURL(String text) {
		for(Allergen allergen : Allergen.values()) {
			if(allergen.toString().equals(text.toUpperCase())) {
				return allergen.getImageURL();
			}
		}
		
		return "https://api-food-allert-backend.apps.us-west-2.online-starter.openshift.com/images/307672-peach-filled-100.png";
	}
}
