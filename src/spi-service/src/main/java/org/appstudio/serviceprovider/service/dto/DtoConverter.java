package org.appstudio.serviceprovider.service.dto;

import org.appstudio.serviceprovider.service.storage.AccessToken;

public class DtoConverter {
  public static AccessTokenDto asDto(AccessToken accessToken) {
    return new AccessTokenDto(accessToken.getToken(), accessToken.getName());
  }

  public static AccessToken asToken(AccessTokenDto accessTokenDto) {
    return new AccessToken(
        accessTokenDto.getToken(),
        accessTokenDto.getName(),
        "https://github.com",
        "jdoe",
        "jd-64839",
        "i-4934",
        1663409036);
  }
}
