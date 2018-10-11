/**
 *
 * Copyright 2008-2014 by Woo Cupid.
 * All rights reserved.
 * 
 */
package top.linjingc.utils;

import java.io.Serializable;

public class JsonResult implements Serializable {

	private static final long serialVersionUID = 5706185031278936807L;

	private Boolean success = true;
	private String message = "Your request has been handled successfully.";
	private Object data;

	/**
	 * 
	 * @Title：success
	 * @Description：call success,return data,and empty message.
	 * @param data
	 * @return JsonResult
	 */
	public static JsonResult success(Object data) {
		JsonResult result = new JsonResult();
		result.setData(data);
		return result;
	}

	public static JsonResult success() {
		JsonResult result = new JsonResult();
		return result;
	}

	public static JsonResult failed(String message) {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setMessage(message);
		result.setData("");
		return result;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
