package com.zm.net.teaching.domain;

import javax.persistence.*;

public class Images {
    @Id
    @Column(name = "images_id")
    private Integer imagesId;

    @Column(name = "images_url")
    private String imagesUrl;

    @Column(name = "images_link")
    private String imagesLink;

    @Column(name = "images_text")
    private String imagesText;

    @Column(name = "images_index")
    private Integer imagesIndex;

    @Column(name = "images_show")
    private Boolean imagesShow;

    /**
     * @return images_id
     */
    public Integer getImagesId() {
        return imagesId;
    }

    /**
     * @param imagesId
     */
    public void setImagesId(Integer imagesId) {
        this.imagesId = imagesId;
    }

    /**
     * @return images_url
     */
    public String getImagesUrl() {
        return imagesUrl;
    }

    /**
     * @param imagesUrl
     */
    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    /**
     * @return images_link
     */
    public String getImagesLink() {
        return imagesLink;
    }

    /**
     * @param imagesLink
     */
    public void setImagesLink(String imagesLink) {
        this.imagesLink = imagesLink;
    }

    /**
     * @return images_text
     */
    public String getImagesText() {
        return imagesText;
    }

    /**
     * @param imagesText
     */
    public void setImagesText(String imagesText) {
        this.imagesText = imagesText;
    }

    /**
     * @return images_index
     */
    public Integer getImagesIndex() {
        return imagesIndex;
    }

    /**
     * @param imagesIndex
     */
    public void setImagesIndex(Integer imagesIndex) {
        this.imagesIndex = imagesIndex;
    }

    /**
     * @return images_show
     */
    public Boolean getImagesShow() {
        return imagesShow;
    }

    /**
     * @param imagesShow
     */
    public void setImagesShow(Boolean imagesShow) {
        this.imagesShow = imagesShow;
    }
}