package com.ccunix.ihousekeeping.basedb.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Tb_base;
import com.ccunix.ihousekeeping.basedb.service.Tb_base_Service_Iface;

@Controller
@RequestMapping("Tb_base_Controller")
public class Tb_base_Controller extends BaseMultiController {
	@Resource
	public Tb_base_Service_Iface tb_base_service_iface;

}