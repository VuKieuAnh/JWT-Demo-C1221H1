package com.example.democ12jwt.service.appuser;

import com.example.democ12jwt.model.AppUser;
import com.example.democ12jwt.model.DTO.ICountRole;
import com.example.democ12jwt.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Iterable<ICountRole> getRoleNumber();
}
