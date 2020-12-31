package com.admin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.dao.OtpDao;
import com.admin.model.Otp;
import com.admin.service.OtpService;

@Service("otpService")
@Transactional
@SessionAttributes("user")
public class OtpServiceImpl implements OtpService {
	@Autowired
	OtpDao otpDao;
		
	public long varifyOtp(Otp otp) {
		long value = otp.getOtp();
		otp.setOtp(value);

		Otp result = otpDao.varifyOtp(otp);
		if (result != null) {
			return 1;
		} 
		return 0;
}
}