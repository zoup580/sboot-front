package com.myshop.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myshop.model.TestModel;
import com.myshop.service.TestService;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/abd")
	public String abd(Model model, Integer id, String name, Integer age) {
		model.addAttribute("name", name);
		model.addAttribute("age", 123);
		model.addAttribute("testModel", testService.getById(id));
		return "index";
	}

	@RequestMapping(value = "/abc")
	public String abc(Model model, TestModel testModel) {

		model.addAttribute("name", testModel.getName());
		model.addAttribute("testModel", testService.selectById(testModel));
		return "abc";
	}

	/**
	 * ok 
	 */
//	@RequestMapping(value = "/abe")
//	public @ResponseBody String abe(Model model, TestModel testModel) {
//
//		FileWriter out = null;
//		try {
//			// 通过FreeMarker的Confuguration读取相应的模板文件
//			Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
//			// 设置模板路径
//			configuration.setClassForTemplateLoading(TestController.class, "/templates");
//			// 设置默认字体
//			configuration.setDefaultEncoding("utf-8");
//
//			// 获取模板
//			Template template = configuration.getTemplate("abe.ftl");
//			// 设置模型
//
//			// 设置输出文件
//			File file = new File("F:/html/abe.html");
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//			// 设置输出流
//			out = new FileWriter(file);
//			
//			Map map = new HashMap();
//			map.put("testModel", testService.selectById(testModel));
//			map.put("name", testModel.getName());
//			
//			// 模板输出静态文件
//			template.process(map, out);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (null != out) {
//				try {
//					out.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		return "abe";
//	}

}
