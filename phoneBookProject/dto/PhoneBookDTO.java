package dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PhoneBookDTO {
    private Long id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;




    @Override
    public String toString() {
        // 2024-12-20T11:17:36 이렇게 출력되는 시간 날짜 변경하기
        String createDate = createdAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        //updateDate 의 값이 null 일때 오류가 발생하는거 보안
        String updateDate = "";
        if (updatedAt != null) {
            updateDate = updatedAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        }

        String str = String.format("%d\t %s\t %d\t %s\t %s\t %s\t %s"
        ,id,name,age,address,phone,createDate,updateDate);
        return str;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
