package hs.kr.dgsw.webshopping.domain;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    List<User> findall();
    int deleteById(@Param("id") Long id); //회원탈퇴 (id로)
    Long add(User user);
    int modifty(User user); //수정
    User findById(@Param("id") Long id); //아이디로 유저 찾기
    User login(User user);
	User findByAccount(@Param("account") String account); //사용자 아이디로 유저 찾기
}