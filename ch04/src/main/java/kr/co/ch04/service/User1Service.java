package kr.co.ch04.service;

import kr.co.ch04.dao.User1DAO;
import kr.co.ch04.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {

    @Autowired
    private User1DAO dao;

    public void save(User1DTO dto) {
        dao.insertUser1(dto);
    }
    public void findAll() {}
    public void findById(String uid) {}
    public void delete(String uid) {}
    public void update(User1DTO dto) {}


}