package cn.marblog.bwcar.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * <filter>
 *     <filter-name></filter-name>
 *     <filter-class></filter-class>
 *     <init-param>
 *         <param-name></param-name>
 *         <param-value></param-value>
 *     </init-param>
 * </filter>
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
initParams = {@WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
//exclusions 不拦截资源
public class DruidWebStatFilter extends WebStatFilter {


}
