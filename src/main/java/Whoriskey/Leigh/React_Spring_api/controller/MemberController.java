package Whoriskey.Leigh.React_Spring_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Whoriskey.Leigh.React_Spring_api.model.Member;

@CrossOrigin(origins = "*")
@RestController
public class MemberController {

    @GetMapping("/api/member")
    public Map<String, List<Member>> getMembers(){
        List<Member> members = List.of(
            new Member(1, "John", "Doe", 
            "john.doe@example.com", "1990-05-15", "Male", "Premium")
        );
        return Map.of("members", members);
    }

}
