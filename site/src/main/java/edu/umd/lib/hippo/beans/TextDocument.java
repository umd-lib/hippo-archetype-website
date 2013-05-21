
package edu.umd.lib.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="public:textdocument")
public class TextDocument extends BaseDocument{


    public String getTitle() {
        return getProperty("public:title");
    }
    
    public String getSummary() {
        return getProperty("public:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("public:body");    
    }
}
