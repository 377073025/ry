package com.ruoyi.project.system.source.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.source.mapper.SourceMapper;
import com.ruoyi.project.system.source.domain.Source;
import com.ruoyi.project.system.source.service.ISourceService;
import com.ruoyi.common.support.Convert;

/**
 * 课程 服务层实现
 * 
 * @author ruoyi
 * @date 2018-08-15
 */
@Service
public class SourceServiceImpl implements ISourceService 
{
	@Autowired
	private SourceMapper sourceMapper;

	/**
     * 查询课程信息
     * 
     * @param id 课程ID
     * @return 课程信息
     */
    @Override
	public Source selectSourceById(Integer id)
	{
	    return sourceMapper.selectSourceById(id);
	}
	
	/**
     * 查询课程列表
     * 
     * @param source 课程信息
     * @return 课程集合
     */
	@Override
	public List<Source> selectSourceList(Source source)
	{
	    return sourceMapper.selectSourceList(source);
	}
	
    /**
     * 新增课程
     * 
     * @param source 课程信息
     * @return 结果
     */
	@Override
	public int insertSource(Source source)
	{
	    return sourceMapper.insertSource(source);
	}
	
	/**
     * 修改课程
     * 
     * @param source 课程信息
     * @return 结果
     */
	@Override
	public int updateSource(Source source)
	{
	    return sourceMapper.updateSource(source);
	}

	/**
     * 删除课程对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSourceByIds(String ids)
	{
		return sourceMapper.deleteSourceByIds(Convert.toStrArray(ids));
	}
	
}
