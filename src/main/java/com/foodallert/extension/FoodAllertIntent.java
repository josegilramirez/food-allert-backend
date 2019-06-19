/**
 * 
 */
package com.foodallert.extension;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class FoodAllertIntent {
	private String intent;
	private Double confidence;
	
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public Double getConfidence() {
		return confidence;
	}
	public void setConfidence(Double confidence) {
		this.confidence = confidence;
	}
}
