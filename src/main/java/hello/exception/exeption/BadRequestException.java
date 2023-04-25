package hello.exception.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "에러메세지 reason 확인")
public class BadRequestException extends RuntimeException{
}
