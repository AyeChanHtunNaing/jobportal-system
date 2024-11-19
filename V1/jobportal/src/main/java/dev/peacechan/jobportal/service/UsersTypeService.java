package dev.peacechan.jobportal.service;

import dev.peacechan.jobportal.entity.UsersType;
import dev.peacechan.jobportal.repository.UsersRepository;
import dev.peacechan.jobportal.repository.UsersTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;
    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
