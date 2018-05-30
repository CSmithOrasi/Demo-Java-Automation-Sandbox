/**
 *
 */
package com.trainingserver.soap.operations;

import java.io.File;

import com.orasi.utils.Constants;
import com.orasi.utils.XMLTools;
import com.trainingserver.soap.TrainingServer;

/**
 * @author michael.huneycutt
 *
 */
public abstract class OperationsTemplate extends TrainingServer {

    protected String Link;
    protected File xml;

    public final int getNumberOfResults() {
        return getNumberOfResponseNodesByXPath(("/Envelope/Body/" + Link + "Response"));
    }

    public final void setup() {
        xml = new File(this.getClass().getResource(Constants.XML_FILES + "/trainingServer/" + Link + ".xml").getPath());
        setRequestDocument(XMLTools.makeXMLDocument(xml));

        // Generate a request from a project xml file
        setOperationName(Link + "Request");
        removeComments();
        removeWhiteSpace();
    }

    public File getXML() {
        return xml;
    }

    /**
     * @param Link
     *            the Link to set
     */
    public void setLink(String Link) {
        this.Link = Link;
    }

    /**
     * @return the Link
     */
    public String getLink() {
        return Link;
    }

}
