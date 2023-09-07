package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//회원 객체 저장
public interface MemberRepository {
    Member save(Member member);//회원 저장
    //회원 조회
    Optional<Member> findById(Long id); //null반환 시 optional을 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll(); //회원 전체 조회
}
