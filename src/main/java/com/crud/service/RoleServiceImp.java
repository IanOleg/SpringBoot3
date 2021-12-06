package com.crud.service;

import com.crud.dao.RoleDao;
import com.crud.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
@Transactional
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public void saveRole(Role role) {
        roleDao.saveRole(role);
    }

    @Override
    public void mergeRole(Role role) {
        roleDao.mergeRole(role);
    }

    @Override
    public void removeRole(String role) {
        roleDao.removeRole(role);
    }

    @Override
    public Role getRole(String role) {
        return roleDao.getRole(role);
    }

    @Override
    public List<Role> getAllRoles() {

        return roleDao.getAllRoles();
    }
}
