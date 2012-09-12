package com.master.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.master.mybatis.ManageSqlSession;
import com.master.mybatis.model.User;

public class UserDao {

	public List<User> getAllUsers() throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			List<User> usersList = session.selectList("User.getAll");
			return usersList;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}

	public User getUserById(int userId) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			User user = (User) session.selectOne("User.getUserById", userId);
			return user;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}

	public User getUserByEmail(String userEmail) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			User user = (User) session.selectOne("User.getUserByEmail",
					userEmail);
			return user;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}

	public void deleteUserById(int userId) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.delete("User.deleteById", userId);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}

	public void deleteUserByEmail(int userEmail) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.delete("User.deleteByEmail", userEmail);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}

	public void createUser(User user) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.insert("User.insert", user);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}

	public void updateUserById(User user) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.update("User.update", user);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}
}