package com.ali.credit.manage.mapper;

import com.ali.credit.bean.NplmContractAttribute;
import com.ali.credit.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmContractAttribute> {
    List<NplmLoanContract> selectNplmLoanContractList();


}
