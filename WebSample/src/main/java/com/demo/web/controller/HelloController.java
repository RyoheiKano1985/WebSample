package com.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.fw.bean.HelloBean;
import jp.fw.util.HelloMapperUtils;


@Controller
public class HelloController {

	@Autowired
	private HelloMapperUtils helloMapperUtils;

	@RequestMapping(value = "hello")
	public String init(Model model) {

		List<HelloBean> list = helloMapperUtils.selectName();

		model.addAttribute("list", list);

		return "hello";
	}
}