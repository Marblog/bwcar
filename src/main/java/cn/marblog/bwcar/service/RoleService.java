package cn.marblog.bwcar.service;



import java.util.List;

public interface RoleService {
    List<String> findRolesByUserId(Long userId);
}
