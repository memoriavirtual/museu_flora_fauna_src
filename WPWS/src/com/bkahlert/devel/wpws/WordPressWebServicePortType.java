/**
 * WordPressWebServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws;

public interface WordPressWebServicePortType extends java.rmi.Remote {
    public com.bkahlert.devel.wpws.model.Image[] getImages(java.lang.String galleryId, boolean includeSubGalleries) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Page[] getPages(java.lang.String args) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Page getPage(int pageId) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Post[] getPosts(java.lang.String args) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Post getPost(int postId) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Gallery[] getGalleryHierarchy(java.lang.String args) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Gallery[] getGalleries(java.lang.String args) throws java.rmi.RemoteException;
    public com.bkahlert.devel.wpws.model.Gallery getGallery(int galleryId) throws java.rmi.RemoteException;
}
