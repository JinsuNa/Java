package exception;

import java.util.regex.Pattern;

public class InputValidation {
    // 이름확인 - 한글만 가능하도록
    public boolean nameCheck(String name) throws MyException {
        //정규표현식
        boolean check = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
        if (!check) {
            throw new MyException("※한글만 입력해주세요※");
        }
        return (!check);
    }

    //전화번호 타입 확인
    public boolean phoneCheck(String phone) throws MyException {
        //정규표현식
        boolean check = Pattern.matches("^\\d{3}-\\d{3,4}-\\d{4}$", phone);
        if (!check) {
            throw new MyException("※휴대폰 입력 형식은 : [010-xxxx-xxxx] 입니다.※");
        }
        return (!check);
    }

    //나이 입력하기
    public boolean ageCheck(int age) throws MyException {
        if (age < 0 || age > 120) {
            throw new MyException("※나이는 0~120 까지 입력해주세요.※");
        } else {
            return false;
        }
    }

    //주소 입력하기
    public boolean addressCheck(String address) throws MyException {
        //정규표현식
        boolean check = Pattern.matches("^[ㄱ-ㅎ가-힣\\s]*$", address);
        if (!check) {
            throw new MyException("※한글만 입력해주세요※");
        }
        return (!check);
    }



}
