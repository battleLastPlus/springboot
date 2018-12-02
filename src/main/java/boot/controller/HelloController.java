package boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.properties.ParamProperties;

@Controller
public class HelloController extends baseController{
	//配置文件application.properties
	@Autowired
    private ParamProperties paramProperties;
	//日志log4j2
//	private static final Logger LOGGER = LoggerFactory
//			.getLogger(HelloController.class);
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "yrfmmp";
	}
	
	@RequestMapping("/toDemo")
	public String toDemo(ModelMap map) {
//		LOGGER.debug("===========debug信息>>>>" + paramProperties);
//		LOGGER.info("===========info信息>>>>" + paramProperties);
//		LOGGER.trace("I am trace log.");
//		LOGGER.debug("I am debug log.");
//		LOGGER.warn("I am warn log.");
//		LOGGER.error("I am error log.");
		// 手动异常
//		System.out.println(1 / 0);
		// 会有中文乱码问题 TODO
		map.addAttribute("host", "baidu.com" + paramProperties.getBasesName()); 
		return "demo";
	}
}
