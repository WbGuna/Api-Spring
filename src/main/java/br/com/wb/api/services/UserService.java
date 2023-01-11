package br.com.wb.api.services;

import br.com.wb.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
