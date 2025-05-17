package com.example.log4shell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class Log4ShellController {

    private static final Logger logger = LogManager.getLogger(Log4ShellController.class);

    @GetMapping("/test")
    public String test(@RequestParam String exploit) {
        logger.error("{}", exploit);
        return exploit;
    }
}