package mypackage.exceptiondemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ExceptionsController {

  @GetMapping("/notfoundexception")
  public String getResourceThatThrowsNotFoundException() {
    throw new NotFoundException("Not found thrown by getResourceThatThrowsNotFoundException");
  }

  @GetMapping("/responsestatusexception")
  public String getResourceThatThrowsResponseStatusException() {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found thrown by getResourceThatThrowsResponseStatusException");
  }

}
