package hello.hellop_spring;

import hello.hellop_spring.repository.MemberRepository;
import hello.hellop_spring.repository.MemoryMemberRepository;
import hello.hellop_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
