package com.zm.net.teaching.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "curriculum_stytem")
public class CurriculumStytem {
    /**
     * 体系表自增id
     */
    @Id
    @Column(name = "curriculum_system_id")
    private Integer curriculumSystemId;

    /**
     * 章节名称
     */
    @Column(name = "curriculum_system_name")
    private String curriculumSystemName;

    /**
     * 第几节
     */
    @Column(name = "curriculum_system_sequence")
    private Integer curriculumSystemSequence;

    /**
     * 课程总表ID
     */
    @Column(name = "corriculum_stytem_total_id")
    private Integer corriculumStytemTotalId;


    private Set<CurriculumDetails> setDeta;

    public Set<CurriculumDetails> getSetDeta() {
        return setDeta;
    }

    public void setSetDeta(Set<CurriculumDetails> setDeta) {
        this.setDeta = setDeta;
    }

    private List<CurriculumDetails> details;

    public List<CurriculumDetails> getDetails() {
        return details;
    }

    public void setDetails(List<CurriculumDetails> details) {
        this.details = details;
    }
    /**
     * 获取体系表自增id
     *
     * @return curriculum_system_id - 体系表自增id
     */
    public Integer getCurriculumSystemId() {
        return curriculumSystemId;
    }

    /**
     * 设置体系表自增id
     *
     * @param curriculumSystemId 体系表自增id
     */
    public void setCurriculumSystemId(Integer curriculumSystemId) {
        this.curriculumSystemId = curriculumSystemId;
    }

    /**
     * 获取章节名称
     *
     * @return curriculum_system_name - 章节名称
     */
    public String getCurriculumSystemName() {
        return curriculumSystemName;
    }

    /**
     * 设置章节名称
     *
     * @param curriculumSystemName 章节名称
     */
    public void setCurriculumSystemName(String curriculumSystemName) {
        this.curriculumSystemName = curriculumSystemName;
    }

    /**
     * 获取第几节
     *
     * @return curriculum_system_sequence - 第几节
     */
    public Integer getCurriculumSystemSequence() {
        return curriculumSystemSequence;
    }

    /**
     * 设置第几节
     *
     * @param curriculumSystemSequence 第几节
     */
    public void setCurriculumSystemSequence(Integer curriculumSystemSequence) {
        this.curriculumSystemSequence = curriculumSystemSequence;
    }

    /**
     * 获取课程总表ID
     *
     * @return corriculum_stytem_total_id - 课程总表ID
     */
    public Integer getCorriculumStytemTotalId() {
        return corriculumStytemTotalId;
    }

    /**
     * 设置课程总表ID
     *
     * @param corriculumStytemTotalId 课程总表ID
     */
    public void setCorriculumStytemTotalId(Integer corriculumStytemTotalId) {
        this.corriculumStytemTotalId = corriculumStytemTotalId;
    }
}