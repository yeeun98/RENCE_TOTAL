/**
 * 
 * @author 최진실
 *
 */
package com.rence.backoffice.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rence.backoffice.model.AuthDTO;
import com.rence.backoffice.model.BackOfficeOperatingTimeDTO;
import com.rence.backoffice.model.BackOfficeDTO;
import com.rence.backoffice.model.EmailVO;

public interface BackOfficeService {

	public Map<String, String> insertOK(BackOfficeDTO vo, BackOfficeOperatingTimeDTO ovo);

	public Map<String, String> backoffice_auth(AuthDTO avo, BackOfficeDTO bvo, EmailVO evo);

	public Map<String, String> backoffice_authOK(String backoffice_email, String auth_code);

	public Map<String, String> backoffice_loginOK(String username, HttpServletResponse response);

	public Map<String, String> backoffice_reset_pw(BackOfficeDTO bvo, EmailVO evo);

	public Map<String, String> backoffice_settingOK_pw(BackOfficeDTO bvo, HttpServletRequest request,
			HttpServletResponse response);

	public void auth_auto_delete(String user_email);

}
