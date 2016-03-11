/**
 * CreativeTemplateOperationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public class CreativeTemplateOperationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativeTemplateOperationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_ALLOWED = "NOT_ALLOWED";
    public static final java.lang.String _NOT_APPLICABLE = "NOT_APPLICABLE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativeTemplateOperationErrorReason NOT_ALLOWED = new CreativeTemplateOperationErrorReason(_NOT_ALLOWED);
    public static final CreativeTemplateOperationErrorReason NOT_APPLICABLE = new CreativeTemplateOperationErrorReason(_NOT_APPLICABLE);
    public static final CreativeTemplateOperationErrorReason UNKNOWN = new CreativeTemplateOperationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativeTemplateOperationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativeTemplateOperationErrorReason enumeration = (CreativeTemplateOperationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativeTemplateOperationErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeTemplateOperationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "CreativeTemplateOperationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
