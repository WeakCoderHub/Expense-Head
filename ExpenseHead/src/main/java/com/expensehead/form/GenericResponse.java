package com.expensehead.form;

/**
 * @author arunkumar
 * 
 *         this class is use give a response to mobile application against it's
 *         request .
 */
public class GenericResponse {

	public boolean status;
	public String message;

	/**
	 * return true if request is successfully process otherwise false .
	 * 
	 * @return boolean
	 */
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * return a message to be displayed against request .
	 * 
	 * @return String
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
