
/**
 * Sync_SubmitResponse.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.4 Built on : Oct 21, 2016
 * (10:48:01 BST)
 */


package org.immregistries.smm.tester.connectors.az.gov.azdhs.www;


/**
 * Sync_SubmitResponse bean class
 */
@SuppressWarnings({"all"})

public class Sync_SubmitResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("http://www.azdhs.gov", "Sync_SubmitResponse", "ns5");



  /**
   * field for Response
   */


  protected org.immregistries.smm.tester.connectors.az.asiis_response.aie_schemas.Response_type1 localResponse;

  /*
   * This tracker boolean wil be used to detect whether the user called the set method for this
   * attribute. It will be used to determine whether to include this field in the serialized XML
   */
  protected boolean localResponseTracker = false;

  public boolean isResponseSpecified() {
    return localResponseTracker;
  }



  /**
   * Auto generated getter method
   * 
   * @return asiis_response.aie_schemas.Response_type1
   */
  public org.immregistries.smm.tester.connectors.az.asiis_response.aie_schemas.Response_type1 getResponse() {
    return localResponse;
  }



  /**
   * Auto generated setter method
   * 
   * @param param Response
   */
  public void setResponse(
      org.immregistries.smm.tester.connectors.az.asiis_response.aie_schemas.Response_type1 param) {
    localResponseTracker = param != null;

    this.localResponse = param;


  }



  /**
   *
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
      final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {



    return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));

  }

  public void serialize(final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  public void serialize(final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {



    java.lang.String prefix = null;
    java.lang.String namespace = null;


    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {


      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.azdhs.gov");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
            namespacePrefix + ":Sync_SubmitResponse", xmlWriter);
      } else {
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
            "Sync_SubmitResponse", xmlWriter);
      }


    }
    if (localResponseTracker) {
      if (localResponse == null) {
        throw new org.apache.axis2.databinding.ADBException("Response cannot be null!!");
      }
      localResponse.serialize(
          new javax.xml.namespace.QName("http://AIE_Schemas.ASIIS_Response", "Response"),
          xmlWriter);
    }
    xmlWriter.writeEndElement();


  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("http://www.azdhs.gov")) {
      return "ns5";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /**
   * Utility method to write an element start tag.
   */
  private void writeStartElement(java.lang.String prefix, java.lang.String namespace,
      java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
    } else {
      if (namespace.length() == 0) {
        prefix = "";
      } else if (prefix == null) {
        prefix = generatePrefix(namespace);
      }

      xmlWriter.writeStartElement(prefix, localPart, namespace);
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
  }

  /**
   * Util method to write an attribute with the ns prefix
   */
  private void writeAttribute(java.lang.String prefix, java.lang.String namespace,
      java.lang.String attName, java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
    } else {
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
      xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
    }
  }

  /**
   * Util method to write an attribute without the ns prefix
   */
  private void writeAttribute(java.lang.String namespace, java.lang.String attName,
      java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
    }
  }


  /**
   * Util method to write an attribute without the ns prefix
   */
  private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
      javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    java.lang.String attributeNamespace = qname.getNamespaceURI();
    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
    if (attributePrefix == null) {
      attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
    }
    java.lang.String attributeValue;
    if (attributePrefix.trim().length() > 0) {
      attributeValue = attributePrefix + ":" + qname.getLocalPart();
    } else {
      attributeValue = qname.getLocalPart();
    }

    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attributeValue);
    } else {
      registerPrefix(xmlWriter, namespace);
      xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
    }
  }

  /**
   * method to handle Qnames
   */

  private void writeQName(javax.xml.namespace.QName qname,
      javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
      java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
      if (prefix == null) {
        prefix = generatePrefix(namespaceURI);
        xmlWriter.writeNamespace(prefix, namespaceURI);
        xmlWriter.setPrefix(prefix, namespaceURI);
      }

      if (prefix.trim().length() > 0) {
        xmlWriter.writeCharacters(
            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }

    } else {
      xmlWriter
          .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
  }

  private void writeQNames(javax.xml.namespace.QName[] qnames,
      javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
      // we have to store this data until last moment since it is not possible to write any
      // namespace data after writing the charactor data
      java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
      java.lang.String namespaceURI = null;
      java.lang.String prefix = null;

      for (int i = 0; i < qnames.length; i++) {
        if (i > 0) {
          stringToWrite.append(" ");
        }
        namespaceURI = qnames[i].getNamespaceURI();
        if (namespaceURI != null) {
          prefix = xmlWriter.getPrefix(namespaceURI);
          if ((prefix == null) || (prefix.length() == 0)) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
          }

          if (prefix.trim().length() > 0) {
            stringToWrite.append(prefix).append(":").append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        } else {
          stringToWrite
              .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }

  }


  /**
   * Register a namespace prefix
   */
  private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter,
      java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }



  /**
   * Factory class that keeps the parse method
   */
  public static class Factory {
    private static org.apache.commons.logging.Log log =
        org.apache.commons.logging.LogFactory.getLog(Factory.class);



    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static Sync_SubmitResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      Sync_SubmitResponse object = new Sync_SubmitResponse();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement())
          reader.next();

        currentQName = reader.getName();

        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

            if (!"Sync_SubmitResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (Sync_SubmitResponse) org.immregistries.smm.tester.connectors.az.gov.azdhs.www.ExtensionMapper
                  .getTypeObject(nsUri, type, reader);
            }


          }


        }



        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();



        reader.next();


        while (!reader.isStartElement() && !reader.isEndElement())
          reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("http://AIE_Schemas.ASIIS_Response", "Response")
                .equals(reader.getName())
            || new javax.xml.namespace.QName("", "Response").equals(reader.getName())) {

          object.setResponse(
              org.immregistries.smm.tester.connectors.az.asiis_response.aie_schemas.Response_type1.Factory
                  .parse(reader));

          reader.next();

        } // End of if for expected property start element

        else {

        }

        while (!reader.isStartElement() && !reader.isEndElement())
          reader.next();

        if (reader.isStartElement())
          // 2 - A start element we are not expecting indicates a trailing invalid property

          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());



      } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
      }

      return object;
    }

  }// end of factory class



}

