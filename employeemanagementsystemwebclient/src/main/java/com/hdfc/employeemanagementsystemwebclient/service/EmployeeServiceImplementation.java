package com.hdfc.employeemanagementsystemwebclient.service;

import com.hdfc.employeemanagementsystemwebclient.entity.Aes;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {
    private static final String AES_KEY = "TOKEN_SECURITY_MOGLIX_AES_KEY_IN_JWT";


    @Override
    public String decrypt(String data) {
        Aes aes = new Aes(AES_KEY);
        return aes.decrypt(data);
    }
}
