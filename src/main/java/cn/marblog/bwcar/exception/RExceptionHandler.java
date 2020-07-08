package cn.marblog.bwcar.exception;

import cn.marblog.bwcar.utils.R;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class RExceptionHandler {

    @ExceptionHandler(RException.class)
    @ResponseBody
    public R rExp(RException exception) {
        R r = new R();
        r.put("code", 500);
        r.put("msg", exception.getMsg());
        return r;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R allExp(Exception e) {
        R r = new R();
        r.put("code", 500);
        r.put("msg", "系统错误");
        return r;
    }

    @ExceptionHandler(AuthorizationException.class)
    public ModelAndView authorExp(AuthorizationException authorizationException) {
        return new ModelAndView("unauthorized.html");
    }
}
