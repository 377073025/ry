package com.ruoyi.project.system.source.mapper;

import java.util.List;

import com.ruoyi.project.system.source.domain.Source;	

/**
 * 课程 数据层
 * 
 * @author ruoyi
 * @date 2018-08-15
 */
public interface SourceMapper 
{
	/**
     * 查询课程信息
     * 
     * @param id 课程ID
     * @return 课程信息
     */
	public Source selectSourceById(Integer id);
	
	/**
     * 查询课程列表
     * 
     * @param source 课程信息
     * @return 课程集合
     */
	public List<Source> selectSourceList(Source source);
	
	/**
     * 新增课程
     * 
     * @param source 课程信息
     * @return 结果
     */
	public int insertSource(Source source);
	
	/**
     * 修改课程
     * 
     * @param source 课程信息
     * @return 结果
     */
	public int updateSource(Source source);
	
	/**
     * 删除课程
     * 
     * @param id 课程ID
     * @return 结果
     */
	public int deleteSourceById(Integer id);
	
	/**
     * 批量删除课程
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSourceByIds(String[] ids);
	
}