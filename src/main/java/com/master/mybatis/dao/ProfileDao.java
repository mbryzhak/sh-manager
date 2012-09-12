package com.master.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.master.mybatis.ManageSqlSession;
import com.master.mybatis.model.Profile;
import com.master.mybatis.model.User;

public class ProfileDao {
	
	public List<Profile> getAllProfiles() throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			List<Profile> profilesList = session.selectList("Profile.getAll");
			return profilesList;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}
	
	public Profile getProfileById(int profileId) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			Profile profile = (Profile) session.selectOne("Profile.getById", profileId);
			return profile;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}

	public List<Profile> getProfilesByUserId(int userId) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			List<Profile> profilesList = session.selectList("Profile.getByUserId", userId);
			return profilesList;
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
		return null;
	}
	
	public void deleteProfileById(int profileId) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.delete("Profile.deleteById", profileId);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}
	
	public void createProfile(Profile profile) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.insert("Profile.insert", profile);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}
	
	public void updateProfileById(Profile profile) throws Exception {

		SqlSession session = ManageSqlSession.openAutoIncSqlSession();

		try {
			session.update("Profile.update", profile);
			session.commit();
		} catch (Exception e) {
			System.err.println("Something goes wrong: " + e);
		} finally {
			session.close();
		}
	}
}
