package edu.umd.lib.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="public:textdocument")
public class TextDocument extends BaseDocument{
    
    public HippoHtml getHtml(){
        return getHippoHtml("public:body");    
    }

    public String getSummary() {
        return getProperty("public:summary");
    }
 
    public String getTitle() {
        return getProperty("public:title");
    }

}
