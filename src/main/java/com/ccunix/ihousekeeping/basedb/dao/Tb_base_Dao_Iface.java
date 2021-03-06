package com.ccunix.ihousekeeping.basedb.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Tb_base;

@DataSourceType(DataSourceType.main)
public interface Tb_base_Dao_Iface {
	public void insert_tb_base(Tb_base tb_base) throws Exception;

	public void update_tb_base(Tb_base tb_base) throws Exception;

	public void delete_tb_base(Tb_base tb_base) throws Exception;

	public List queryAll_tb_base(Tb_base tb_base) throws Exception;

	public List queryBy_tb_base(Tb_base tb_base) throws Exception;
}
