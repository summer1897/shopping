package com.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * <p>Title: PageDispatcherController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author duhao
 * @date 2016年3月1日 下午12:39:23
 *
 */
@Controller
public class PageDispatcherController {

	@RequestMapping("/{viewName}")
	public String dispatcher(@PathVariable String viewName){
		return viewName;
	}
}
