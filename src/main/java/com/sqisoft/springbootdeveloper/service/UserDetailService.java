package com.sqisoft.springbootdeveloper.service;

import com.sqisoft.springbootdeveloper.domain.User;
import com.sqisoft.springbootdeveloper.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {
  private final UserRepository userRepository;

  @Override
  public User loadUserByUsername(String email) throws UsernameNotFoundException {
    return userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException(email));
  }
}
