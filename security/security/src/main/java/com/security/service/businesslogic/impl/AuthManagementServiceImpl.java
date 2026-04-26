package com.security.service.businesslogic.impl;

import com.security.service.businesslogic.AuthManagementService;
import com.security.service.domain.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthManagementServiceImpl implements AuthManagementService {
    UserService userService;
}
