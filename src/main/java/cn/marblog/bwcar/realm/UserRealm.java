package cn.marblog.bwcar.realm;

import cn.marblog.bwcar.pojo.SysUser;
import cn.marblog.bwcar.service.MenuService;
import cn.marblog.bwcar.service.RoleService;
import cn.marblog.bwcar.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserRealm extends AuthorizingRealm {

    @Autowired
    SysUserService sysUserService;
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SysUser sysuser = (SysUser) principalCollection.getPrimaryPrincipal();
        Long userId = sysuser.getUserId();
        //用户角色
        List<String> rolesByUserId = roleService.findRolesByUserId(userId);
        //菜单权限
        List<String> permsByUserId = menuService.findPermsByUserId(userId);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(rolesByUserId);
        info.addStringPermissions(permsByUserId);
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        SysUser user = sysUserService.findByUsername(username);
        if (user == null) {
            throw new UnknownAccountException("账户不存在");
        }
        if (user.getPassword().equals(password)) {
            throw new IncorrectCredentialsException("密码错误");
        }
        if (user.getStatus() == 0) {
            throw new LockedAccountException("账户禁用");
        }

        return new SimpleAuthenticationInfo(user, password, this.getName());
    }
}
