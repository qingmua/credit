package com.ali.credit.manage.service.impl;

import com.ali.credit.bean.NplmContractAttribute;
import com.ali.credit.bean.NplmLoanContract;
import com.ali.credit.manage.mapper.NplmLoanContractMapper;
import com.ali.credit.service.ManageService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper;

    @Override
    public List<NplmLoanContract> selectNplmLoanContractList() {
        return nplmLoanContractMapper.selectNplmLoanContractList();
    }




}
