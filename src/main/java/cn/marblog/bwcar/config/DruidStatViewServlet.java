package cn.marblog.bwcar.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "druidStatViewServlet",urlPatterns = "/druid/*",
initParams = {
        @WebInitParam(name = "loginUsername",value = "druid"),
        @WebInitParam(name="loginPassword",value="druid"),
//        @WebInitParam(name = "allow",value = "127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
//        @WebInitParam(name="deny",value = "10.9.41.71"),
        @WebInitParam(name="resetEnable",value = "false")
})
public class DruidStatViewServlet extends StatViewServlet {

}
