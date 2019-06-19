/**
 * 
 */
package com.foodallert.dto;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class AssistantRequest {
	private String userInput;
	private boolean alternate_intents;

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public boolean isAlternate_intents() {
		return alternate_intents;
	}

	public void setAlternate_intents(boolean alternate_intents) {
		this.alternate_intents = alternate_intents;
	}

}
