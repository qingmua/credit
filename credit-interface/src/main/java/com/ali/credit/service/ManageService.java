package com.ali.credit.service;


import com.ali.credit.bean.NplmContractAttribute;
import com.ali.credit.bean.NplmLoanContract;

import java.util.List;

public interface ManageService {
    //查询所有的合同列表
    List<NplmLoanContract> selectNplmLoanContractList();


}
