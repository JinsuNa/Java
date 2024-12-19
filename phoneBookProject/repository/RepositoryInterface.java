package repository;

import dto.PhoneBookDTO;

import java.util.List;

public interface RepositoryInterface {
    int insertData(PhoneBookDTO dto);

    int updateData(PhoneBookDTO dto);

    int deleteData(long id);

    // 전체 데이터 읽어오기
    List<PhoneBookDTO> getAllList();

    // id로 검색
    PhoneBookDTO findById(Long id);

    // 이름으로 검색하기
    List<PhoneBookDTO> findByName(String name);

    // 전화번호로 검색하기
    List<PhoneBookDTO> findByPhone(String phone);
}
