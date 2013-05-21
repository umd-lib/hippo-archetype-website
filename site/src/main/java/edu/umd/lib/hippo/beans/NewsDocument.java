package edu.umd.lib.hippo.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="public:newsdocument")
public class NewsDocument extends BaseDocument{

    public Calendar getDate() {
        return getProperty("public:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("public:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("public:image", HippoGalleryImageSetBean.class);
    }

    public String getSummary() {
        return getProperty("public:summary");
    }

    public String getTitle() {
        return getProperty("public:title");
    }

}
