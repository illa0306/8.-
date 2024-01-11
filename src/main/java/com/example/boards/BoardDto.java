package com.example.boards;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class BoardDto {

    // PK
    private Long id;
    // 제목
    private String title;
    // 게시글
    private String post;
    // 댓글
    private String comment;
    // 비밀번호
    private String password;

//    public BoardDto(Long boardId, String title, String post) {
//    }
}
