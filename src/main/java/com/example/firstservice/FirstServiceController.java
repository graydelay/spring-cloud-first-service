package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 클래스 설명 or 서비스 설명
 *
 * <br><br>$com.example.firstservice.FirstServiceController.java
 *
 * @version 1.0.0
 * @author 이지연    jylee@datasolution.kr
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일		수정자     수정내용
 * ------------------------------------------------------------------------------------
 * 2024.04.07      이지연     최초작성
 *
 * </pre>
 * @since 2024.04.07 오후 14:15:00
 */
@Slf4j
@RestController
@RequestMapping("/first-service")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome first service application";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info("header = " + header);
        return "Hello World in First Service";
    }
}
