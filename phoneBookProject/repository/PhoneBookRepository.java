package repository;

import db.DBConn;
import dto.PhoneBookDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookRepository implements RepositoryInterface {

    int result = 0; //쿼리실행 결과를 담을 변수. (성공하면 양수, 실패하면 0 return)
    Connection dbConn = DBConn.getConnection();
    PreparedStatement psmt = null;
    String sql;

    @Override
    public int insertData(PhoneBookDTO dto) {
        System.out.println("[PhoneBookRepository]-insertData");
        // DB에 저장하기
        try {
            sql = "INSERT INTO phone_book (name, age, address, phone, created_at) ";
            sql = sql + "VALUES(?,?,?,?,?)";
            psmt = dbConn.prepareStatement(sql);
            //전달할 인자값을 psmt에 추가  ?에 있는걸 할당해 주는 방법
            psmt.setString(1, dto.getName());
            psmt.setInt(2, dto.getAge());
            psmt.setString(3, dto.getAddress());
            psmt.setString(4, dto.getPhone());
            psmt.setTimestamp(5, Timestamp.valueOf(dto.getCreatedAt()));

            //DB 에 저장 요청
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateData(PhoneBookDTO dto) {
        System.out.println("[PhoneBookRepository]-updateData");
        return 0;
    }

    @Override
    public int deleteData(long id) {
        System.out.println("[PhoneBookRepository]-deleteData");
        sql = "DELETE FROM phone_book WHERE id = ?";
        try {
            psmt = dbConn.prepareStatement(sql);
            psmt.setLong(1, id);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<PhoneBookDTO> getAllList() {
        System.out.println("[PhoneBookRepository]-getAllList");
        List<PhoneBookDTO> dtoList = new ArrayList<>();
        //resurt set에 있는 레코드를 하나씩 읽어서 담을 DTO

        ResultSet rs = null;   //mysql에서 select * from table 한 내용을 받아오는 역활 빈 깡통으로 넣어 아래에 있는 select 구문을 넣는것이다.

        try {

            sql = "SELECT * FROM phone_book ORDER BY id ASC";
            psmt = dbConn.prepareStatement(sql);
            //query 실행한 결과 -> resultSet 에 return한다.
            rs = psmt.executeQuery();
            //ResutSet의 내용을 하나씩 읽어서 dtoList에 담아야한다.
            while (rs.next()) {  //next 는 다음 자료가 있는지 확인하는 메서드다. boolean return
                PhoneBookDTO dto = new PhoneBookDTO();
                //레코드 즉 행들을 하나씩 읽어서 DTO에 담는 작업
                dto.setId(rs.getLong("id"));  // 테이블의 필드명을 입력
                dto.setName(rs.getString("name"));
                dto.setAge(rs.getInt("age"));
                dto.setPhone(rs.getString("phone"));
                dto.setAddress(rs.getString("address"));
                dto.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());

                if (rs.getTimestamp("updated_at") != null) {
                    dto.setCreatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
                }
                // 담은 DTO를 리스트에 담는 작업
                dtoList.add(dto);
            }

            //ResultSet 닫기
            rs.close();
            //PreparedStatement 닫기
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return dtoList;
    }

    @Override
    public PhoneBookDTO findById(Long id) {
        System.out.println("[PhoneBookRepository]-findById");
        List<PhoneBookDTO> dtoList = new ArrayList<>();
        ResultSet rs = null;

        return null;
    }

    @Override
    public List<PhoneBookDTO> findByName(String name) {
        System.out.println("[PhoneBookRepository]-findByName");
        return List.of();
    }

    @Override
    public List<PhoneBookDTO> findByPhone(String phone) {
        System.out.println("[PhoneBookRepository]-findByPhone");
        return List.of();
    }
}
