package com.demo.security.pojos.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
  private static final long serialVersionUID = 6705727010900183801L;
  private String code;
  private String name;
  private String lastName;
  private String documentType;
  private String documentNumber;
  private String email;
}
