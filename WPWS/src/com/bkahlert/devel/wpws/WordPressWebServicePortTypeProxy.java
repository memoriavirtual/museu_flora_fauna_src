package com.bkahlert.devel.wpws;

import java.io.Serializable;

public class WordPressWebServicePortTypeProxy implements
		com.bkahlert.devel.wpws.WordPressWebServicePortType, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4706641377328248204L;
	private String _endpoint = null;
	private com.bkahlert.devel.wpws.WordPressWebServicePortType wordPressWebServicePortType = null;

	public WordPressWebServicePortTypeProxy() {
		_initWordPressWebServicePortTypeProxy();
	}

	public WordPressWebServicePortTypeProxy(String endpoint) {
		_endpoint = endpoint;
		_initWordPressWebServicePortTypeProxy();
	}

	private void _initWordPressWebServicePortTypeProxy() {
		try {
			wordPressWebServicePortType = (new com.bkahlert.devel.wpws.WordPressWebServiceLocator())
					.getWordPressWebServiceHttpSoapEndpoint();
			if (wordPressWebServicePortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) wordPressWebServicePortType)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) wordPressWebServicePortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (wordPressWebServicePortType != null)
			((javax.xml.rpc.Stub) wordPressWebServicePortType)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public com.bkahlert.devel.wpws.WordPressWebServicePortType getWordPressWebServicePortType() {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType;
	}

	public com.bkahlert.devel.wpws.model.Image[] getImages(
			java.lang.String galleryId, boolean includeSubGalleries)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getImages(galleryId,
				includeSubGalleries);
	}

	public com.bkahlert.devel.wpws.model.Page[] getPages(java.lang.String args)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getPages(args);
	}

	public com.bkahlert.devel.wpws.model.Page getPage(int pageId)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getPage(pageId);
	}

	public com.bkahlert.devel.wpws.model.Post[] getPosts(java.lang.String args)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getPosts(args);
	}

	public com.bkahlert.devel.wpws.model.Post getPost(int postId)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getPost(postId);
	}

	public com.bkahlert.devel.wpws.model.Gallery[] getGalleryHierarchy(
			java.lang.String args) throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getGalleryHierarchy(args);
	}

	public com.bkahlert.devel.wpws.model.Gallery[] getGalleries(
			java.lang.String args) throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getGalleries(args);
	}

	public com.bkahlert.devel.wpws.model.Gallery getGallery(int galleryId)
			throws java.rmi.RemoteException {
		if (wordPressWebServicePortType == null)
			_initWordPressWebServicePortTypeProxy();
		return wordPressWebServicePortType.getGallery(galleryId);
	}

}