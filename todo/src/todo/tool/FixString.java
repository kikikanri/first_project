package todo.tool;

import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

public class FixString {

	static public String encoding(String str) {
		String test = ServletActionContext.getRequest().getCharacterEncoding();

    	try {
            return new String(str.getBytes("iso-8859-1"),
            		ServletActionContext.getRequest().getCharacterEncoding());
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }
}
