//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 11:21:48 PM CEST 
//


package com.nalogzaprenos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nalog_za_prenos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nalog_za_prenos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://nalogZaPrenos.com}podaci_o_duzniku_nalogodavcu"/>
 *         &lt;element name="svrha_placanja">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="200"/>
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://nalogZaPrenos.com}podaci_o_poveriocu_primaocu"/>
 *         &lt;element ref="{http://nalogZaPrenos.com}podaci_o_prenosu"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hitno" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="datum_prijema" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nalog_za_prenos", propOrder = {
    "podaciODuznikuNalogodavcu",
    "svrhaPlacanja",
    "podaciOPoveriocuPrimaocu",
    "podaciOPrenosu"
})
public class NalogZaPrenos {

    @XmlElement(name = "podaci_o_duzniku_nalogodavcu", required = true)
    protected TLice podaciODuznikuNalogodavcu;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(name = "podaci_o_poveriocu_primaocu", required = true)
    protected TLice podaciOPoveriocuPrimaocu;
    @XmlElement(name = "podaci_o_prenosu", required = true)
    protected PodaciOPrenosu podaciOPrenosu;
    @XmlAttribute(name = "hitno", required = true)
    protected boolean hitno;
    @XmlAttribute(name = "datum_prijema", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPrijema;
    @XmlAttribute(name = "datum_valute")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;

    /**
     * Gets the value of the podaciODuznikuNalogodavcu property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPodaciODuznikuNalogodavcu() {
        return podaciODuznikuNalogodavcu;
    }

    /**
     * Sets the value of the podaciODuznikuNalogodavcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPodaciODuznikuNalogodavcu(TLice value) {
        this.podaciODuznikuNalogodavcu = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the podaciOPoveriocuPrimaocu property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPodaciOPoveriocuPrimaocu() {
        return podaciOPoveriocuPrimaocu;
    }

    /**
     * Sets the value of the podaciOPoveriocuPrimaocu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPodaciOPoveriocuPrimaocu(TLice value) {
        this.podaciOPoveriocuPrimaocu = value;
    }

    /**
     * Gets the value of the podaciOPrenosu property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOPrenosu }
     *     
     */
    public PodaciOPrenosu getPodaciOPrenosu() {
        return podaciOPrenosu;
    }

    /**
     * Sets the value of the podaciOPrenosu property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOPrenosu }
     *     
     */
    public void setPodaciOPrenosu(PodaciOPrenosu value) {
        this.podaciOPrenosu = value;
    }

    /**
     * Gets the value of the hitno property.
     * 
     */
    public boolean isHitno() {
        return hitno;
    }

    /**
     * Sets the value of the hitno property.
     * 
     */
    public void setHitno(boolean value) {
        this.hitno = value;
    }

    /**
     * Gets the value of the datumPrijema property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPrijema() {
        return datumPrijema;
    }

    /**
     * Sets the value of the datumPrijema property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPrijema(XMLGregorianCalendar value) {
        this.datumPrijema = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

}