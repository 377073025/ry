package com.ruoyi.project.system.source.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.constant.BusinessType;
import com.ruoyi.project.system.source.domain.Source;
import com.ruoyi.project.system.source.service.ISourceService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 课程 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-08-15
 */
@Controller
@RequestMapping("/system/source")
public class SourceController extends BaseController
{
    private String prefix = "system/source";
	
	@Autowired
	private ISourceService sourceService;
	
	@RequiresPermissions("system:source:view")
	@GetMapping()
	public String source()
	{
	    return prefix + "/source";
	}
	
	/**
	 * 查询课程列表
	 */
	@RequiresPermissions("system:source:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Source source)
	{
		startPage();
        List<Source> list = sourceService.selectSourceList(source);
		return getDataTable(list);
	}
	
	/**
	 * 新增课程
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存课程
	 */
	@RequiresPermissions("system:source:add")
	@Log(title = "课程", action = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Source source)
	{		
		return toAjax(sourceService.insertSource(source));
	}

	/**
	 * 修改课程
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Source source = sourceService.selectSourceById(id);
		mmap.put("source", source);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存课程
	 */
	@RequiresPermissions("system:source:edit")
	@Log(title = "课程", action = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Source source)
	{		
		return toAjax(sourceService.updateSource(source));
	}
	
	/**
	 * 删除课程
	 */
	@RequiresPermissions("system:source:remove")
	@Log(title = "课程", action = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sourceService.deleteSourceByIds(ids));
	}
	
}
