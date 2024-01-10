package sani.board.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long user_id;
    private String name;
    private String email;
    private String password;
    private String nickname;
    private boolean isWithdrawal;
    private Date registDate;
    private Date withdrawalDate;
}
