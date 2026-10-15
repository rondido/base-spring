package hello.hellop_spring.domain;


import jakarta.persistence.*;

@Entity
public class Member {
    //GeneratedValue id 값을 db자체에서 시퀀스로 추가해주기 때문에 필요
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
