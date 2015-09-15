package net.shinc.orm.mybatis.bean.xhscomment;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Topic {
	
    private Integer id;

    @NotEmpty(message="{topicContent.not.empty}")
    private String content;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}