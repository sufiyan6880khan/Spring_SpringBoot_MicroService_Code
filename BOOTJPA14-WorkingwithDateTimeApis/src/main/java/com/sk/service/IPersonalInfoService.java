package com.sk.service;



import java.util.List;

import com.sk.entity.PersionalInfo;

public interface IPersonalInfoService {
	 
	public String   resisterPersionalInfo(PersionalInfo pInfo);
	public List<PersionalInfo> showAllPersionalInfo();
	

}
