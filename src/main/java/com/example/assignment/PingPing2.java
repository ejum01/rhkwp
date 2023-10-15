import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PingPing2 {

    @GetMapping("")
    public String index() {return "forward:/index.jsp";}

    @GetMapping("/ping")
    public ResponseEntity<String> pingcontroller() {
        return ResponseEntity.ok("pong");
    }
}
