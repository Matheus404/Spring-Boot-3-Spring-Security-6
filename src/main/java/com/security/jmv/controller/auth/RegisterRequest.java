package com.security.jmv.controller.auth;

import com.security.jmv.user.Role;

import java.util.Objects;

public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private Role role;

    public RegisterRequest() {
    }

    public RegisterRequest(String firstname, String lastname, String email, String password, Role role) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.password = password;
      this.role = role;
    }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    RegisterRequest that = (RegisterRequest) o;
    return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && role == that.role;
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, email, password, role);
  }
}