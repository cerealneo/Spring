package kr.co.sboard.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class TermsDTO {

    private String no;
    private String terms;
    private String privacy;
}
