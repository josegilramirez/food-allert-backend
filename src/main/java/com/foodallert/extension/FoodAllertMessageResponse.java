/**
 * 
 */
package com.foodallert.extension;

import java.util.List;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
/**
 * The response sent by the workspace, including the output text, detected intents and entities, and context.
 */
public class FoodAllertMessageResponse  {
	public List<FoodAllertEntity> entities;
	public List<FoodAllertIntent> intents;
	
	public List<FoodAllertEntity> getEntities() {
		return entities;
	}
	public void setEntities(List<FoodAllertEntity> entities) {
		this.entities = entities;
	}
	public List<FoodAllertIntent> getIntents() {
		return intents;
	}
	public void setIntents(List<FoodAllertIntent> intents) {
		this.intents = intents;
	}
}
