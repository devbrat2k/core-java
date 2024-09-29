package com.devbrat2k.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.util.ArrayList;
import java.util.List;

public class GetNodesByAttributeValue {

  public static void main(String[] args) throws Exception {

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware(true);
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse("employees.xml");

    String xpathExpression = "";

    //Get all employees in HR department
    xpathExpression = "/employees/employee[department/name='HR']";
    System.out.println(evaluateXPath(document, xpathExpression));
  }

  private static List<String> evaluateXPath(Document document, String xpathExpression) {

    XPathFactory xpathFactory = XPathFactory.newInstance();
    XPath xpath = xpathFactory.newXPath();
    List<String> values = new ArrayList<>();

    try {

      XPathExpression expr = xpath.compile(xpathExpression);
      NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
      for (int i = 0; i < nodes.getLength(); i++) {

        values.add(nodes.item(i).getNodeValue());
      }
    } catch (XPathExpressionException e) {
      e.printStackTrace();
    }
    return values;
  }
}

