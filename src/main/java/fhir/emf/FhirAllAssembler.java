package fhir.emf;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Calendar;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class FhirAllAssembler implements Runnable {
	
	private final static String NS_PREFIX = "xs:";
	public final static String VERSION = "1.7.0";
	
	@Override
	public void run() {
		String currDir = System.getProperty("user.dir");
		File model = new File(new File(currDir), "model");
		File schemas = new File(model, "fhir-codegen-xsd");
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

		try {
	        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	        Document doc = docBuilder.newDocument();
	        doc.appendChild(doc.createComment(comment));
	        Element schemaRoot = doc.createElementNS(XMLConstants.W3C_XML_SCHEMA_NS_URI, NS_PREFIX+"schema");
	        Attr attrTarget = doc.createAttribute("targetNamespace");
	        attrTarget.setValue("http://hl7.org/fhir");
	        schemaRoot.setAttributeNodeNS(attrTarget);     
	        Attr attrForm = doc.createAttribute("elementFormDefault");
	        attrForm.setValue("qualified");
	        schemaRoot.setAttributeNodeNS(attrForm);     
	        Attr attrVersion = doc.createAttribute("version");
	        attrVersion.setValue(VERSION);
	        schemaRoot.setAttributeNodeNS(attrVersion);     
	        doc.appendChild(schemaRoot);	        
			File[] files = schemas.listFiles(filter);
			for(File file : files) {
		        NameTypeElementMaker elMaker = new NameTypeElementMaker(NS_PREFIX, doc);
		        Element idType = elMaker.createElement("include", file.getName());
		        schemaRoot.appendChild(idType);
			}
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(doc);
            //to create a file use something like this:
            transformer.transform(domSource, new StreamResult(new File(schemas,"fhir-all.xsd")));
            //to print to console use this:
            transformer.transform(domSource, new StreamResult(System.out));
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FhirAllAssembler app = new FhirAllAssembler();
		app.run();
	}
	
	private static class NameTypeElementMaker {
        private String nsPrefix;
        private Document doc;

        public NameTypeElementMaker(String nsPrefix, Document doc) {
            this.nsPrefix = nsPrefix;
            this.doc = doc;
        }

        public Element createElement(String elementName, String nameAttrVal) {
            Element element = doc.createElementNS(XMLConstants.W3C_XML_SCHEMA_NS_URI, nsPrefix+elementName);
            if(nameAttrVal != null)
                element.setAttribute("schemaLocation", nameAttrVal);
             return element;
        }	
	}
	
	FilenameFilter filter = new  FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			return !name.startsWith("fhir") && !name.startsWith("x");
		}
		
	};
	
	String comment = "\n"
 +"Copyright (c) 2011 , HL7, Inc\n" 
 +"All rights reserved.\n"
 +"\n"
 +"Redistribution and use in source and binary forms, with or without modification,\n"
 +"are permitted provided that the following conditions are met:\n"
 +"\n"
 +"* Redistributions of source code must retain the above copyright notice, this\n"
 +"list of conditions and the following disclaimer.\n"
 +"* Redistributions in binary form must reproduce the above copyright notice,\n"
 +"this list of conditions and the following disclaimer in the documentation\n"
 +"and/or other materials provided with the distribution.\n"
 +"* Neither the name of HL7 nor the names of its contributors may be used to\n"
 +"endorse or promote products derived from this software without specific\n"
 +"prior written permission.\n"
 +"\n"
 +"THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND\n"
 +"ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED\n"
 +"WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.\n"
 +"IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,\n"
 +"INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT\n"
 +"NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR\n"
 +"PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,\n"
 +"WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)\n"
 +"ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE\n"
 +"POSSIBILITY OF SUCH DAMAGE.\n"
+"\n"
+String.format("Generated on %tc for FHIR  %s \n", Calendar.getInstance(), VERSION);
}
