package com.ruoyi.project.system.source.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 课程表 sys_source
 * 
 * @author ruoyi
 * @date 2018-08-15
 */
public class Source extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键ID */
	private Integer id;
	/**  */
	private String test1;
	/**  */
	private String test2;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setTest1(String test1) 
	{
		this.test1 = test1;
	}

	public String getTest1() 
	{
		return test1;
	}
	public void setTest2(String test2) 
	{
		this.test2 = test2;
	}

	public String getTest2() 
	{
		return test2;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("test1", getTest1())
            .append("test2", getTest2())
            .toString();
    }
}
