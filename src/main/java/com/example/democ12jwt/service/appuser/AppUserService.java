package com.example.democ12jwt.service.appuser;

import com.example.democ12jwt.model.AppUser;
import com.example.democ12jwt.model.DTO.ICountRole;
import com.example.democ12jwt.model.DTO.UserPrinciple;
import com.example.democ12jwt.repo.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private IAppUserRepo appUserRepo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public Iterable<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return appUserRepo.save(appUser);
    }

    @Override
    public void remove(Long id) {
        appUserRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = appUserRepo.findByName(username);
        if (userOptional.isPresent()){
             return UserPrinciple.build(userOptional.get());
        }
        return null;
    }

    @Override
    public AppUser findByName(String name) {
        return appUserRepo.findByName(name).get();
    }

    @Override
    public Iterable<ICountRole> getRoleNumber() {
        return appUserRepo.getRoleNumber();
    }
}
