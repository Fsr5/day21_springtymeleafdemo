package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class FirstController {

    @GetMapping("/first")
    public String indexPage(Model model){
        System.out.println("测试...");
        String message = "欢迎来到优就业" ;
        model.addAttribute("message",message);
        return "index" ;
    }


    @GetMapping("/second")
    public String indexPage2(Model model){
        String message = "欢迎来到优就业" ;
        model.addAttribute("message",message);

        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        user.setAge(20);

        model.addAttribute("user",user);

        Map map = new HashMap<>();
        map.put("url1","1.jpg");
        map.put("url2","2.jpg");

        model.addAttribute("src",map);

        return "index2";
    }


    @GetMapping("/three")
    public String indexPage3(Model model){

        List<User> list = new ArrayList<>();

        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        user.setAge(32);

        User user2 = new User();
        user2.setId(2);
        user2.setName("lisi");
        user2.setAge(23);

        User user3 = new User();
        user3.setId(3);
        user3.setName("wangwu");
        user3.setAge(43);

        list.add(user);
        list.add(user2);
        list.add(user3);

        model.addAttribute("userList",list);

        return "index3" ;



    }


    @GetMapping("/four")
    public String indexPage4(Model model){

        model.addAttribute("a1","欢迎");
        model.addAttribute("a2","来到成都");
        return "index4" ;

    }


    @GetMapping("/five")
    public String indexPage5(Model model) {
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "menu");
        model.addAttribute("manager", "manager");

        return "index5" ;

    }


    @GetMapping("/six")
    public String index6(Model model){
        return "index6" ;
    }


    @GetMapping("/seven")
    public String index7(Model model){
        //日期时间
        Date date = new Date();
        model.addAttribute("date", date);

        //小数的金额
        double price=128.5678D;
        model.addAttribute("price", price);

        //定义大文本数据
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("strText", str);

        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);

        return "index7";
    }

}
