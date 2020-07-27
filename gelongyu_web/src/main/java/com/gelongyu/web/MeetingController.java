package com.gelongyu.web;

import com.gelongyu.bean.Meeting;
import com.gelongyu.bean.Meeting_type;
import com.gelongyu.service.MeetingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MeetingController {

    @Resource
    private MeetingService meetingService;

    @RequestMapping("/list")
    public String list(Model model, @RequestParam(value = "cpage",defaultValue = "1")Integer id){

        PageHelper.startPage(id,2);
        List list = meetingService.list();
        PageInfo pa = new PageInfo(list);
        model.addAttribute("list",list);
        model.addAttribute("pa",pa);
        model.addAttribute("cpage",id);
        return "list";
    }

    @RequestMapping("/toadd")
    public String toAdd(){
        return "add";
    }


    @RequestMapping("/bianyi")
    @ResponseBody
    public List<Meeting_type> bianyi(){

        return meetingService.bianyi();
    }

    @RequestMapping("/add")
    public String add(Meeting meeting){

        meetingService.add(meeting);
        return "redirect:list";
    }

    @RequestMapping("/toupd")
    public String toupd(Meeting meeting,Integer id,Model model){
        model.addAttribute("id",id);
        Meeting m = meetingService.hui(meeting);
        model.addAttribute("m",m);

        return "upd?id" + id;
    }



}
