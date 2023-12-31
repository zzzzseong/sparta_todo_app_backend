package com.sparta.spartabulletinboardbackend.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomErrorCode {

    //USER
    USER_EXISTS_EXCEPTION("이미 존재하는 회원입니다"),
    USER_NOT_EXIST_EXCEPTION("존재하지 않은 회원입니다"),

    INVALID_INPUT_VALUE("입력값이 유효하지 않습니다."),

    EMAIL_INVALID_EXCEPTION("유효하지 않은 이메일입니다"),
    PASSWORD_INVALID_EXCEPTION("유효하지 않은 비밀번호입니다"),

    //POST
    POST_NOT_EXIST_EXCEPTION("게시글이 존재하지 않습니다"),
    POST_TITLE_INVALID_EXCEPTION("게시글 제목이 유효하지 않습니다"),

    NOT_ALLOWED_TO_UPDATE_POST_EXCEPTION("댓글 수정 권한이 없습니다."),
    NOT_ALLOWED_TO_DELETE_POST_EXCEPTION("댓글 삭제 권한이 없습니다."),

    //COMMENT
    COMMENT_NOT_EXIST_EXCEPTION("댓글이 존재하지 않습니다"),
    NOT_ALLOWED_TO_UPDATE_COMMENT_EXCEPTION("댓글 수정 권한이 없습니다."),
    NOT_ALLOWED_TO_DELETE_COMMENT_EXCEPTION("댓글 삭제 권한이 없습니다.");


    private final String statusMessage;
}