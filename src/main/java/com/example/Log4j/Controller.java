package com.example.Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controller {

        private static final Logger LOG = LogManager.getLogger(Controller.class);

        @GetMapping(value = "/greeting")
        public String greeting() {

            LOG.debug("Debugging log in our greeting method"+LOG.getLevel());
            LOG.info("Info log in our greeting method"+LOG.getLevel());
            LOG.warn("Warning log in our greeting method");
            LOG.error("Error in our greeting method");
            LOG.fatal("Damn! Fatal error. Please fix me.");
            return "Hello!!!";
        }
    }
