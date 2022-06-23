package org.strongcom.study.hellospring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Member {
    private Long id;
    private String name;

    public Member(String name){
        this.name = name;
    }

}
