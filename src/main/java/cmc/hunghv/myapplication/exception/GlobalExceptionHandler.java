package cmc.hunghv.myapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<String> handlerRuntimeException(RuntimeException e) {

    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(e.getMessage());
  }
}
