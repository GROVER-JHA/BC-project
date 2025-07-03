package bc.bcauthservice.service;

import bc.bcauthservice.dto.AuthUserDto;
import bc.bcauthservice.entity.AuthUser;
import bc.bcauthservice.entity.TokenDto;

public interface AuthUserService {
    public AuthUser save(AuthUserDto authUserDto);

    public TokenDto login(AuthUserDto authUserDto);

    public TokenDto validate(String token);

}

