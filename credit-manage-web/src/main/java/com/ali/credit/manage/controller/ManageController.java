package com.ali.credit.manage.controller;


import com.ali.credit.bean.NplmLoanContract;
import com.ali.credit.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ManageController {
    @Reference
    private ManageService manageService;
    @RequestMapping("smp")
    public String getSmp(){
        return "smp";
    }

    @RequestMapping("lendersList")
    public String getLendersList(){
        return "lendersList";
    }

    @RequestMapping("contractList")
    public String getContractList(HttpServletRequest request){
        List<NplmLoanContract> nplmLoanContractList = manageService.selectNplmLoanContractList();
        request.setAttribute("nplmLoanContractList",nplmLoanContractList);
        return "contractList";
    }




    }

