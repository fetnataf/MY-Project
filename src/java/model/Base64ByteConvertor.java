/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fetnat
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import org.apache.commons.codec.binary.Base64;
import java.sql.Blob;

public class Base64ByteConvertor extends SimpleTagSupport {

    private Blob blob;

    public void setBlob(Blob blob) {
        this.blob = blob;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (blob == null) {
            return;
        }

        try {
            JspWriter out = getJspContext().getOut();
            long len = blob.length();
            byte[] ba = blob.getBytes(1, (int) len);
            if (ba != null && ba.length > 0) {
                byte[] encodeBase64 = Base64.encodeBase64(ba);
                String base64Encoded = new String(encodeBase64, "UTF-8");
                out.print("data:image/jpeg;base64," + base64Encoded);
            }
        } catch (Exception e) {
            throw new JspException("Error: " + e.getMessage());
        }
    }
}
