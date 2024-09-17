package com.example.testProject.serviceImpl;

import com.example.testProject.entity.User;
import com.example.testProject.repository.UserRepository;
import com.example.testProject.service.UserServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    private final UserRepository UserRepository;
    public UserServicesImpl(UserRepository UserRepository) {
        super();
        this.UserRepository = UserRepository;
    }

    @Override
    public List<User> getAllUser() {
        return UserRepository.findAll();
    }

    @Override
    public User saveUser(User User) {
        return UserRepository.save(User);
    }

    @Override
    public User getUserById(Long id) {
        return UserRepository.findById(id).get();
    }

    @Override
    public User updateUser(User User) {
        return UserRepository.save(User);
    }

    @Override
    public void deleteUserById(Long id) {
        UserRepository.deleteById(id);
    }

}
