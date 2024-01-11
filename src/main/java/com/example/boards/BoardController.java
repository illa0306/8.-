package com.example.boards;

import com.example.boards.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BoardController {

    // 게시판 보기
    @GetMapping("/boards/{boardId}/")
    public String board() {
        return "board/home.html";
    }

    // 게시글 작성하기
    @GetMapping("/boards/{boardId}/article/")
    public String createArticle(
            @RequestParam("title") String title,
            @RequestParam("post") String post
    ) {
        return "borad/create.html";
    }

    // 게시글 목록 보기
    @GetMapping("/article/{articleId}/")
    public String article() {
        return "board/forum.html";
    }

    // 게시글 수정하기 Update
    @PostMapping("/article/{articleId}/update/")
    public String articleUpdate() { return "redirect:/article/{articleId}/"; }

    // 게시글 삭제하기 Delete
    @PostMapping("/article/{articleId}/delete/")
    public String Delete() {
        return "redirect:/article/{articleId}/";
    }

    // 댓글 작성하기
    @PostMapping("/article/{articleId}/comment/")
    public String comment() {
        return "";
    }

    // 댓글 삭제하기
    @PostMapping("/article/{articleId}/comment/{commentId}/delete/")
    public String commentDelete() {
        return "";
    }

}
