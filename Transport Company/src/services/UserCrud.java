package services;

import java.util.List;

import model.User;
public interface UserCrud {
	int insertRecord(User user);
	int updateRecord(User user);
	int deleteRecord(int id);
	List<User> getAllRecords();
	User getUserbyId(int id);
	
	
}
