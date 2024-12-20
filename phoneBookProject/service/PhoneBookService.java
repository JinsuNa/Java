package service;

import dto.PhoneBookDTO;
import repository.PhoneBookRepository;

import java.util.List;

public class PhoneBookService implements ServiceInterface {

    PhoneBookRepository bookRepository = new PhoneBookRepository();


    @Override
    public int insertService(PhoneBookDTO dto) {
        System.out.println("[PhoneBookService]-insertService");

        return bookRepository.insertData(dto);
    }

    @Override
    public int updateService(PhoneBookDTO dto) {
        System.out.println("[PhoneBookService]-updateService");
        return 0;
    }

    @Override
    public int deleteService(long id) {
        System.out.println("[PhoneBookService]-deleteService");
        return bookRepository.deleteData(id);
    }

    @Override
    public List<PhoneBookDTO> getAllListService() {
        System.out.println("[PhoneBookService]-getAllListService");
        return bookRepository.getAllList();
    }

    @Override
    public PhoneBookDTO findByIdService(Long id) {
        System.out.println("[PhoneBookService]-findByIdService");
        return bookRepository.findById(id);
    }

    @Override
    public List<PhoneBookDTO> findByNameService(String name) {
        System.out.println("[PhoneBookService]-findByNameService");
        return List.of();
    }

    @Override
    public List<PhoneBookDTO> findByPhoneService(String phone) {
        System.out.println("[PhoneBookService]-findByPhoneService");
        return List.of();
    }
}
