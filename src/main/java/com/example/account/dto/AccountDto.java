package com.example.account.dto;

import com.example.account.domain.Account;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    // 생성자를 만들지 않고 fromEntity 를 사용
    public static AccountDto fromEntity(Account account) {
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .registeredAt(account.getRegisteredAt())
                .unRegisteredAt(account.getUnRegisteredAt())
                .build();
    }
}
