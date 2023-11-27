package com.example.account.domain;

import com.example.account.type.AccountStatus;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class) // application 전체 설정에 추가 해줘야 사용 가능
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private AccountUser accountUser; // accountUser : user 를 사용할 경우 DB 충돌
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    @CreatedDate // createdAt 자동 생성 ( + EntityListeners )
    private LocalDateTime createdAt;
    @LastModifiedDate // updatedAt 자동 생성 ( + EntityListeners )
    private LocalDateTime updatedAt;
}
