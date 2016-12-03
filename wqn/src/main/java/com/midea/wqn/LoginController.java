/**
 * 
 */
package com.midea.wqn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * <pre>
 * 。
 * </pre>
 * 
 * @author wangqiaonian qiaonian.wang@midea.com.cn
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "login !!";
	}

}
