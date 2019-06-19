/**
 * 
 */
package com.foodallert.watson.services;

import org.apache.log4j.Logger;

import com.foodallert.dto.AssistantRequest;
import com.foodallert.extension.FoodAllertMessageResponse;
import com.foodallert.util.LoadProperties;
import com.ibm.watson.developer_cloud.assistant.v1.Assistant;
import com.ibm.watson.developer_cloud.assistant.v1.model.InputData;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageResponse;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class AssistantConnector {
	private static final String WATSON_CONVERSATION_DATE_VERSION = LoadProperties.getProperty("assistant.dateVersion");
	private static final String WATSON_CONVERSATION_USERNAME = LoadProperties.getProperty("assistant.username");
    private static final String WATSON_CONVERSATION_PASSWORD = LoadProperties.getProperty("assistant.password");
    private static final String WATSON_CONVERSATION_WORKSPACE_ID = LoadProperties.getProperty("assistant.workspaceID");
    
    static final Logger logger = Logger.getLogger(AssistantConnector.class);
    
	public FoodAllertMessageResponse sendAssistantRequest(AssistantRequest request) {
		logger.info("** sendAssistantRequest **");
		FoodAllertMessageResponse faMessageResponse = new FoodAllertMessageResponse();
		Assistant service = new Assistant(WATSON_CONVERSATION_DATE_VERSION);
		service.setUsernameAndPassword(WATSON_CONVERSATION_USERNAME, WATSON_CONVERSATION_PASSWORD);
		
		InputData inputData = new InputData.Builder(request.getUserInput()).build();
	    MessageOptions options = new MessageOptions.Builder(WATSON_CONVERSATION_WORKSPACE_ID)
	        .input(inputData)
	        .alternateIntents(request.isAlternate_intents())
	        .build();
	    
	    MessageResponse messageResponse = service.message(options).execute();
	    logger.info(messageResponse);
	    
	    if (messageResponse != null) {
	    	faMessageResponse = MessageResponseConverter.getFoodAllertResponse(messageResponse);
	    }
	    
		return faMessageResponse;
	}
}
