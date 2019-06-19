/**
 * 
 */
package com.foodallert.watson.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.foodallert.extension.FoodAllertEntity;
import com.foodallert.extension.FoodAllertIntent;
import com.foodallert.extension.FoodAllertMessageResponse;
import com.foodallert.model.Allergen;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageResponse;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class MessageResponseConverter {
	static final Logger logger = Logger.getLogger(MessageResponseConverter.class);
			
	public static FoodAllertMessageResponse getFoodAllertResponse(MessageResponse messageResponse) {
		FoodAllertMessageResponse newMessageResponse = new FoodAllertMessageResponse();
		List<FoodAllertEntity> faEntities = new ArrayList<FoodAllertEntity>();
  		List<FoodAllertIntent> faIntents = new ArrayList<FoodAllertIntent>();
		
		// Retrieving entities
    	if (messageResponse.getEntities().size() > 0) {
    		for (int i = 0; i < messageResponse.getEntities().size(); i++) {
    			FoodAllertEntity faEntity = new FoodAllertEntity();
    			
				faEntity.setEntity(messageResponse.getEntities().get(i).getEntity());
				faEntity.setEntity_es(getSpanish(faEntity.getEntity()));
				faEntity.setConfidence(messageResponse.getEntities().get(i).getConfidence());
				faEntity.setLocation(messageResponse.getEntities().get(i).getLocation());
				faEntity.setValue(messageResponse.getEntities().get(i).getValue());
				faEntity.setImageURL(getEntityImageURL(faEntity.getEntity()));
				faEntities.add(faEntity);
			}
    	}
    	
    	// Retrieving intents
    	if (messageResponse.getIntents().size() > 0) {
    		for (int i = 0; i < messageResponse.getIntents().size(); i++) {
    			FoodAllertIntent faIntent = new FoodAllertIntent();

				faIntent.setIntent(messageResponse.getIntents().get(i).getIntent());
				faIntent.setConfidence(messageResponse.getIntents().get(i).getConfidence());
				faIntents.add(faIntent);
			}
    	}
    	
    	newMessageResponse.setEntities(faEntities);
    	newMessageResponse.setIntents(faIntents);
    	
		return newMessageResponse;
	}

	private static String getSpanish(String entity) {
		return Allergen.getSpanish(entity);
	}
	
	private static String getEntityImageURL(String entity) {
		return Allergen.getAllergenImageURL(entity);
	}
	
}
