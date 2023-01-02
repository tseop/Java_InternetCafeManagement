package com.seop.cafe.controller.detail.member;

import com.seop.cafe.adapter.view.InputView;
import com.seop.cafe.service.MemberService;

public class MemberDeleteController implements MemberControllableString {
    private final MemberService service = new MemberService();
    private static final String MEMBER_REQUEST_DELETE_USER_NO = "샥제할 회원의 No을 입력해 주세요 : ";
    private static final String PATH = "delete";

    @Override
    public String process() {
        System.out.print(MEMBER_REQUEST_DELETE_USER_NO);
        String read = InputView.read();
        service.delete(Long.parseLong(read));
        return PATH;
    }
}
