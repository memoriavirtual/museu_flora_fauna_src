/**
 * Post.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws.model;

import org.jsoup.Jsoup;

public class Post  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1020228303365232483L;

	private int id;

    private java.lang.String author;

    private java.util.Date date;

    private java.util.Date dateGmt;

    private java.lang.String content;

    private java.lang.String title;

    private java.lang.String excerpt;

    private java.lang.String status;

    private java.lang.String commentStatus;

    private java.lang.String pingStatus;

    private java.lang.String password;

    private java.lang.String name;

    private java.lang.String toPing;

    private java.lang.String pinged;

    private java.util.Date modified;

    private java.util.Date modifiedGmt;

    private java.lang.String contentFiltered;

    private int parentId;

    private java.lang.String guid;

    private int menuOrder;

    private java.lang.String type;

    private java.lang.String mimeType;

    private int commentCount;

    private java.lang.String filter;

    private java.lang.String resumedContent;
    
    private java.lang.String contentOnlyText;
    
    public Post() {
    }

    public Post(
           int id,
           java.lang.String author,
           java.util.Date date,
           java.util.Date dateGmt,
           java.lang.String content,
           java.lang.String title,
           java.lang.String excerpt,
           java.lang.String status,
           java.lang.String commentStatus,
           java.lang.String pingStatus,
           java.lang.String password,
           java.lang.String name,
           java.lang.String toPing,
           java.lang.String pinged,
           java.util.Date modified,
           java.util.Date modifiedGmt,
           java.lang.String contentFiltered,
           int parentId,
           java.lang.String guid,
           int menuOrder,
           java.lang.String type,
           java.lang.String mimeType,
           int commentCount,
           java.lang.String filter) {
           this.id = id;
           this.author = author;
           this.date = date;
           this.dateGmt = dateGmt;
           this.content = content;
           this.title = title;
           this.excerpt = excerpt;
           this.status = status;
           this.commentStatus = commentStatus;
           this.pingStatus = pingStatus;
           this.password = password;
           this.name = name;
           this.toPing = toPing;
           this.pinged = pinged;
           this.modified = modified;
           this.modifiedGmt = modifiedGmt;
           this.contentFiltered = contentFiltered;
           this.parentId = parentId;
           this.guid = guid;
           this.menuOrder = menuOrder;
           this.type = type;
           this.mimeType = mimeType;
           this.commentCount = commentCount;
           this.filter = filter;
    }

    public String getresumedContent(){
    	String r = new String();
    	String textOnly = Jsoup.parse(content.toString()).text();
    	
    	if(textOnly.length()>250)
    		r = textOnly.substring(0, 250)+"...";
    	else
    		r = textOnly;
    	
    	resumedContent = r;
    	return r;
    }
    
    public void setResumedContent(String resumedContent){
    	this.resumedContent = resumedContent;
    }
    
    public String getContentOnlyText(){
    	String textOnly = Jsoup.parse(content.toString()).text();
    	contentOnlyText = textOnly;
    	return textOnly;
    }

    public void setContentOnlyText(String contentOnlyText){
    	this.contentOnlyText = contentOnlyText;
    }
    
    /**
     * Gets the id value for this Post.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Post.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the author value for this Post.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Post.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the date value for this Post.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this Post.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the dateGmt value for this Post.
     * 
     * @return dateGmt
     */
    public java.util.Date getDateGmt() {
        return dateGmt;
    }


    /**
     * Sets the dateGmt value for this Post.
     * 
     * @param dateGmt
     */
    public void setDateGmt(java.util.Date dateGmt) {
        this.dateGmt = dateGmt;
    }


    /**
     * Gets the content value for this Post.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Post.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the title value for this Post.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Post.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the excerpt value for this Post.
     * 
     * @return excerpt
     */
    public java.lang.String getExcerpt() {
        return excerpt;
    }


    /**
     * Sets the excerpt value for this Post.
     * 
     * @param excerpt
     */
    public void setExcerpt(java.lang.String excerpt) {
        this.excerpt = excerpt;
    }


    /**
     * Gets the status value for this Post.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Post.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the commentStatus value for this Post.
     * 
     * @return commentStatus
     */
    public java.lang.String getCommentStatus() {
        return commentStatus;
    }


    /**
     * Sets the commentStatus value for this Post.
     * 
     * @param commentStatus
     */
    public void setCommentStatus(java.lang.String commentStatus) {
        this.commentStatus = commentStatus;
    }


    /**
     * Gets the pingStatus value for this Post.
     * 
     * @return pingStatus
     */
    public java.lang.String getPingStatus() {
        return pingStatus;
    }


    /**
     * Sets the pingStatus value for this Post.
     * 
     * @param pingStatus
     */
    public void setPingStatus(java.lang.String pingStatus) {
        this.pingStatus = pingStatus;
    }


    /**
     * Gets the password value for this Post.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Post.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the name value for this Post.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Post.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the toPing value for this Post.
     * 
     * @return toPing
     */
    public java.lang.String getToPing() {
        return toPing;
    }


    /**
     * Sets the toPing value for this Post.
     * 
     * @param toPing
     */
    public void setToPing(java.lang.String toPing) {
        this.toPing = toPing;
    }


    /**
     * Gets the pinged value for this Post.
     * 
     * @return pinged
     */
    public java.lang.String getPinged() {
        return pinged;
    }


    /**
     * Sets the pinged value for this Post.
     * 
     * @param pinged
     */
    public void setPinged(java.lang.String pinged) {
        this.pinged = pinged;
    }


    /**
     * Gets the modified value for this Post.
     * 
     * @return modified
     */
    public java.util.Date getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this Post.
     * 
     * @param modified
     */
    public void setModified(java.util.Date modified) {
        this.modified = modified;
    }


    /**
     * Gets the modifiedGmt value for this Post.
     * 
     * @return modifiedGmt
     */
    public java.util.Date getModifiedGmt() {
        return modifiedGmt;
    }


    /**
     * Sets the modifiedGmt value for this Post.
     * 
     * @param modifiedGmt
     */
    public void setModifiedGmt(java.util.Date modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }


    /**
     * Gets the contentFiltered value for this Post.
     * 
     * @return contentFiltered
     */
    public java.lang.String getContentFiltered() {
        return contentFiltered;
    }


    /**
     * Sets the contentFiltered value for this Post.
     * 
     * @param contentFiltered
     */
    public void setContentFiltered(java.lang.String contentFiltered) {
        this.contentFiltered = contentFiltered;
    }


    /**
     * Gets the parentId value for this Post.
     * 
     * @return parentId
     */
    public int getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Post.
     * 
     * @param parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the guid value for this Post.
     * 
     * @return guid
     */
    public java.lang.String getGuid() {
        return guid;
    }


    /**
     * Sets the guid value for this Post.
     * 
     * @param guid
     */
    public void setGuid(java.lang.String guid) {
        this.guid = guid;
    }


    /**
     * Gets the menuOrder value for this Post.
     * 
     * @return menuOrder
     */
    public int getMenuOrder() {
        return menuOrder;
    }


    /**
     * Sets the menuOrder value for this Post.
     * 
     * @param menuOrder
     */
    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }


    /**
     * Gets the type value for this Post.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Post.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the mimeType value for this Post.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this Post.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the commentCount value for this Post.
     * 
     * @return commentCount
     */
    public int getCommentCount() {
        return commentCount;
    }


    /**
     * Sets the commentCount value for this Post.
     * 
     * @param commentCount
     */
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }


    /**
     * Gets the filter value for this Post.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this Post.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Post)) return false;
        Post other = (Post) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateGmt==null && other.getDateGmt()==null) || 
             (this.dateGmt!=null &&
              this.dateGmt.equals(other.getDateGmt()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.excerpt==null && other.getExcerpt()==null) || 
             (this.excerpt!=null &&
              this.excerpt.equals(other.getExcerpt()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.commentStatus==null && other.getCommentStatus()==null) || 
             (this.commentStatus!=null &&
              this.commentStatus.equals(other.getCommentStatus()))) &&
            ((this.pingStatus==null && other.getPingStatus()==null) || 
             (this.pingStatus!=null &&
              this.pingStatus.equals(other.getPingStatus()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.toPing==null && other.getToPing()==null) || 
             (this.toPing!=null &&
              this.toPing.equals(other.getToPing()))) &&
            ((this.pinged==null && other.getPinged()==null) || 
             (this.pinged!=null &&
              this.pinged.equals(other.getPinged()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.modifiedGmt==null && other.getModifiedGmt()==null) || 
             (this.modifiedGmt!=null &&
              this.modifiedGmt.equals(other.getModifiedGmt()))) &&
            ((this.contentFiltered==null && other.getContentFiltered()==null) || 
             (this.contentFiltered!=null &&
              this.contentFiltered.equals(other.getContentFiltered()))) &&
            this.parentId == other.getParentId() &&
            ((this.guid==null && other.getGuid()==null) || 
             (this.guid!=null &&
              this.guid.equals(other.getGuid()))) &&
            this.menuOrder == other.getMenuOrder() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            this.commentCount == other.getCommentCount() &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateGmt() != null) {
            _hashCode += getDateGmt().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getExcerpt() != null) {
            _hashCode += getExcerpt().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCommentStatus() != null) {
            _hashCode += getCommentStatus().hashCode();
        }
        if (getPingStatus() != null) {
            _hashCode += getPingStatus().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getToPing() != null) {
            _hashCode += getToPing().hashCode();
        }
        if (getPinged() != null) {
            _hashCode += getPinged().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getModifiedGmt() != null) {
            _hashCode += getModifiedGmt().hashCode();
        }
        if (getContentFiltered() != null) {
            _hashCode += getContentFiltered().hashCode();
        }
        _hashCode += getParentId();
        if (getGuid() != null) {
            _hashCode += getGuid().hashCode();
        }
        _hashCode += getMenuOrder();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        _hashCode += getCommentCount();
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Post.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Post"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateGmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "dateGmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excerpt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "excerpt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "commentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "pingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "toPing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "pinged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedGmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "modifiedGmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFiltered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "contentFiltered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "guid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "menuOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "commentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    public String getDataPublicacaoFormatada(){
    	return getDate().toLocaleString().split(" ")[0];
    }
    
}
