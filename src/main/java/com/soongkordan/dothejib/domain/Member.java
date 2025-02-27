package com.soongkordan.dothejib.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
public class Member {

    @Id @Column(name = "member_id")
    @GeneratedValue
    private Long id;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member (String email, String password, Authority authority){
        this.email = email;
        this.password = password;
        this.authority = authority;
    }

}
