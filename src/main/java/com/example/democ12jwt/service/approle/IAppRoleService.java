package com.example.democ12jwt.service.approle;

import com.example.democ12jwt.model.AppRole;
import com.example.democ12jwt.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
