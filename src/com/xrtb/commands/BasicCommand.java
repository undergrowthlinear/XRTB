package com.xrtb.commands;

import org.codehaus.jackson.map.ObjectMapper;
import com.xrtb.common.Configuration;

/**
 * This is the basic command and response object in POJO form of commands sent over REDIS
 * @author Ben M. Faul
 *
 */
public class BasicCommand {
	/** Default command, -1 means uninitialized. Extending objects need to set this. */
	public Integer cmd = -1;
	/** The instance name obtained from the configurarion */
	public String from = Configuration.instanceName;
	/** The id of whom the response is sent to */
	public String to;
	/** A unique ID used for this command */
	public String id;
	/** The message that is associated with the command */
	public String msg;
	/** The return status code, assume the best */
	public String status = "ok";
	/** The type of the return, we assume status */
	public String type = "status";
	
	/**
	 * Empty constructor. Manipulate the fields for creating your
	 * own command/command response.
	 */
	public BasicCommand() {

	}
	
	/**
	 * Returns a JSON representation of the command/command response.
	 */
	
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString;
		try {
			jsonString = mapper.writeValueAsString(this);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return jsonString;
	}
}