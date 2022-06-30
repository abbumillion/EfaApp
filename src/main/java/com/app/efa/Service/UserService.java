package com.app.efa.Service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void sign_in();
    void sign_up();
    void sign_out();
}
