package com.koyel.device_sell.service;

import com.koyel.device_sell.model.user;

public interface AuthenticationService
{
    user signInAndReturnJWT(user signInRequest);
}
