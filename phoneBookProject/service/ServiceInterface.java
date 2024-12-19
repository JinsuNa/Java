package service;

import dto.PhoneBookDTO;

import java.util.List;

public interface ServiceInterface {
    int insertService(PhoneBookDTO dto);

    int updateService(PhoneBookDTO dto);

    int deleteService(long id);

    // 전체 데이터 읽어오기
    List<PhoneBookDTO> getAllListService();

    // id로 검색
    PhoneBookDTO findByIdService(Long id);

    // 이름으로 검색하기
    List<PhoneBookDTO> findByNameService(String name);

    // 전화번호로 검색하기
    List<PhoneBookDTO> findByPhoneService(String phone);
}
