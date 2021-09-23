package org.appstudio.serviceprovider.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class AccessTokenDto {
  @NotBlank(message = "token may not be blank")
  private String token;
  @Pattern(regexp = "[a-z0-9]([-a-z0-9]*[a-z0-9])?")
  private String name;

  public AccessTokenDto() {
  }

  public AccessTokenDto(String token, String name) {
    this.token = token;
    this.name = name;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessTokenDto that = (AccessTokenDto) o;
    return Objects.equals(token, that.token) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, name);
  }

  @Override
  public String toString() {
    return "AccessTokenDto{" +
            "token='" + token + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
