package cn.marblog.bwcar.controller;

import cn.marblog.bwcar.dto.DataGridResult;
import cn.marblog.bwcar.dto.QueryDtO;
import cn.marblog.bwcar.dto.UserDTO;
import cn.marblog.bwcar.pojo.SysUser;
import cn.marblog.bwcar.service.SysUserService;
import cn.marblog.bwcar.utils.MD5Utils;
import cn.marblog.bwcar.utils.R;
import cn.marblog.bwcar.utils.ShiroUtils;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
public class UserController {
    @Autowired
    SysUserService sysUserService;

    @Autowired
    DefaultKaptcha kaptcha;

    @RequestMapping("/sys/login")
    public R login(@RequestBody UserDTO userDTO) {
        String kaptcha = ShiroUtils.getKaptcha();
        if (!kaptcha.equalsIgnoreCase(userDTO.getCaptcha())) {
            return R.error("验证码错误");
        }
        Subject subject = SecurityUtils.getSubject();
        String newPassWord = MD5Utils.md5(userDTO.getPassword(), userDTO.getPassword(), 1024);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userDTO.getUsername(), newPassWord);

        if (userDTO.isRememberMe()) {
            usernamePasswordToken.setRememberMe(true);
        }
        subject.login(usernamePasswordToken);


        System.out.println(userDTO.getUsername());
        return R.ok();
    }

    @RequestMapping("/sys/user/list")
    public DataGridResult findUser(QueryDtO queryDtO) {
        return sysUserService.findUserByPage(queryDtO);
    }

    @RequestMapping("/sys/user/export")
    public void exportUser(HttpServletResponse response) {
        Workbook workbook = sysUserService.expotUser();
        //设置响应头
        response.setContentType("application/octet-stream");
        String fileName = "员工信息.xls";
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("content-disposition", "attachment;filename=" + fileName);

            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response) {
        String text = kaptcha.createText();
        response.setHeader("Cache-Control", "no-store,no-cache");
        response.setContentType("image/jpg");
        //生成图片
        BufferedImage image = kaptcha.createImage(text);
        //存储
        ShiroUtils.setKaptcha(text);

        //返回到页面
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert outputStream != null;
            ImageIO.write(image, "jpg", outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/logout")
    public ModelAndView logout() {
        ShiroUtils.logout();
        return new ModelAndView("login.html");
    }

    @RequestMapping("sys/user/password")
    public void password() {
        System.out.println("1111");
    }

    @RequestMapping("/sys/user/info")
    public R userinfo(){
        //可以从shiro中获取
        SysUser userEntity = ShiroUtils.getUserEntity();
        return R.ok().put("user",userEntity);
    }

}

