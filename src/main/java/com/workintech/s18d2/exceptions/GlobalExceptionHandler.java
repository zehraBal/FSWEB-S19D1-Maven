package com.workintech.s18d2.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {



        @ExceptionHandler
        public ResponseEntity<PlantErrorResponse> handleException(PlantException exception) {
            PlantErrorResponse plantErrorResponse = new PlantErrorResponse( exception.getMessage());
            log.error("Plant exception occured: ", exception);
            return new ResponseEntity<>(plantErrorResponse, exception.getHttpStatus());
        }



        @ExceptionHandler
        public ResponseEntity<PlantErrorResponse> handleException(Exception exception) {
            PlantErrorResponse plantErrorResponse = new PlantErrorResponse(exception.getMessage());
            log.error("Plant exception occured: ", exception);
            return new ResponseEntity<>(plantErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
