package cn.ggx.entity;

import java.util.Date;

/**
 * course_topic
 * 
 * @author bianj
 * @version 1.0.0 2021-01-21
 */
public class CourseTopic implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3277500310736064101L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer id;

    /** topicName */
    private String topicName;

    /** views */
    private Integer views;

    /** vipFlag */
    private Integer vipFlag;

    /** courseType */
    private Integer courseType;

    /** topicIntro */
    private String topicIntro;

    /** flag */
    private Integer flag;

    /** pptUrl */
    private String pptUrl;

    /** createTime */
    private Date createTime;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取topicName
     * 
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * 设置topicName
     * 
     * @param topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * 获取views
     * 
     * @return views
     */
    public Integer getViews() {
        return this.views;
    }

    /**
     * 设置views
     * 
     * @param views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 获取vipFlag
     * 
     * @return vipFlag
     */
    public Integer getVipFlag() {
        return this.vipFlag;
    }

    /**
     * 设置vipFlag
     * 
     * @param vipFlag
     */
    public void setVipFlag(Integer vipFlag) {
        this.vipFlag = vipFlag;
    }

    /**
     * 获取courseType
     * 
     * @return courseType
     */
    public Integer getCourseType() {
        return this.courseType;
    }

    /**
     * 设置courseType
     * 
     * @param courseType
     */
    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    /**
     * 获取topicIntro
     * 
     * @return topicIntro
     */
    public String getTopicIntro() {
        return this.topicIntro;
    }

    /**
     * 设置topicIntro
     * 
     * @param topicIntro
     */
    public void setTopicIntro(String topicIntro) {
        this.topicIntro = topicIntro;
    }

    /**
     * 获取flag
     * 
     * @return flag
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * 设置flag
     * 
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取pptUrl
     * 
     * @return pptUrl
     */
    public String getPptUrl() {
        return this.pptUrl;
    }

    /**
     * 设置pptUrl
     * 
     * @param pptUrl
     */
    public void setPptUrl(String pptUrl) {
        this.pptUrl = pptUrl;
    }

    /**
     * 获取createTime
     * 
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}