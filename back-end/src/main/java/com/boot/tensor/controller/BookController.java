package com.boot.tensor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tensor.dto.BookDTO;
import com.boot.tensor.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    // 학습 데이터
    @GetMapping("/book-data")
    public ResponseEntity<?> getBookData() {
        try {
            // 캐시 헤더 추가
            HttpHeaders headers = new HttpHeaders();
            headers.setCacheControl("max-age=300"); // 5분 캐시
            
            ArrayList<BookDTO> bookList = bookService.getBookDTO();
            
            // 스트림을 사용한 더 효율적인 처리
            List<List<Integer>> features = bookList.parallelStream()
                .map(dto -> Arrays.asList(
                    dto.getHappy(), dto.getSad(), dto.getStress(),
                    dto.getCalm(), dto.getExcited(), dto.getTired()
                ))
                .collect(Collectors.toList());
                
            List<Integer> labels = bookList.parallelStream()
                .map(BookDTO::getEmotionNumber)
                .collect(Collectors.toList());

            Map<String, Object> response = new HashMap<>();
            response.put("features", features);
            response.put("labels", labels);
            response.put("count", features.size());

            log.info("@# book features_count => " + features.size());
            log.info("@# book labels_count => " + labels.size());

            return ResponseEntity.ok()
                .headers(headers)
                .body(response);

        } catch (Exception e) {
            log.error("BookController getBookData 에러: ", e);
            
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status", "error");
            errorResponse.put("message", e.getMessage());
            errorResponse.put("count", 0);

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorResponse);
        }
    }
}
