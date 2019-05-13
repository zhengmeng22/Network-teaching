package com.zm.net.teaching.domain;

import javax.persistence.*;

public class Labels {
    @Id
    @Column(name = "labels_id")
    private Integer labelsId;

    @Column(name = "labels_name")
    private String labelsName;

    /**
     * @return labels_id
     */
    public Integer getLabelsId() {
        return labelsId;
    }

    /**
     * @param labelsId
     */
    public void setLabelsId(Integer labelsId) {
        this.labelsId = labelsId;
    }

    /**
     * @return labels_name
     */
    public String getLabelsName() {
        return labelsName;
    }

    /**
     * @param labelsName
     */
    public void setLabelsName(String labelsName) {
        this.labelsName = labelsName;
    }
}