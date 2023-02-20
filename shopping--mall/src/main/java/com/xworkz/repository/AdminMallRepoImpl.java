package com.xworkz.repository;

import static com.xworkz.logger.Loggers.getLogger;

import java.time.LocalTime;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.AdminMallDTO;

@Repository
public class AdminMallRepoImpl implements AdminMallRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	private Logger logger = getLogger();

	@Override
	public AdminMallDTO findByAdminNameAndpassword(String adminName, String password) {
		logger.info("find by name and password method running");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {
			Query createNamedQuery = createEntityManager.createNamedQuery("findByAdminNameAndpassword");
			createNamedQuery.setParameter("nm", adminName);
			createNamedQuery.setParameter("pd", password);
			Object resultList = createNamedQuery.getSingleResult();
			System.out.println(resultList);
			if (resultList != null) {
				AdminMallDTO ref = (AdminMallDTO) resultList;
				logger.info("result is present" + ref);
				return ref;
			} else {
				logger.info("result is not present");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateNoOfWrongAttemptsByName(String adminName, int noOfWrongAttempt) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateNoOfWrongAttemptsByName");
			query.setParameter("nm", adminName);
			query.setParameter("na", noOfWrongAttempt);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO findByName(String adminName) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {
			logger.info("find by name running");
			Query query = createEntityManager.createNamedQuery("findByName");
			query.setParameter("nm", adminName);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminMallDTO refe = (AdminMallDTO) singleResult;
				logger.info("list is present" + refe);
				return refe;

			} else {
				logger.info("list is null");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateAccountLockedByName(String adminName, String accountLocked) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", adminName);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			return null;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateGeneratedPasswordByName(String adminName, String generatedPassword) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByName");
			query.setParameter("nm", adminName);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", password);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();

			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO findByMallName(String name) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByMallName");
			query.setParameter("name", name);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminMallDTO ref = (AdminMallDTO) singleResult;
				System.out.println("result is not empty   :" + ref);
				return ref;
			} else {
				System.out.println("result is null");
				return null;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			createEntityManager.close();
		}

		return null;
	}

	@Override
	public AdminMallDTO updateGeneratedPasswordByMallName(String name, String generatedPassword) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByMallName");
			query.setParameter("mn", name);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateLoginCountByAdminName(String adminName, int loginCount) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateLoginCountByAdminName");
			query.setParameter("nm", adminName);
			query.setParameter("lc", loginCount);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateTimeByMallName(String name, LocalTime time) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateTimeByMallName");
			query.setParameter("mn", name);
			query.setParameter("ti", time);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
			;
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updatefirstLoginByName(String adminName, int firstLogin) {

		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatefirstStatusByName");
			query.setParameter("nm", adminName);
			query.setParameter("lg", firstLogin);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminMallDTO updateAcountUnlockByName(String adminName, String accountLocked) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateAcountUnlockByName");
			query.setParameter("nm", adminName);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}

		return null;
	}

	@Override
	public AdminMallDTO updateNoOfWrongAttemptsByMallName(String name, int noOfWrongAttempt) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateNoOfWrongAttemptsByMallName");
			query.setParameter("mn", name);
			query.setParameter("noof", noOfWrongAttempt);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO findByGeneratedPassword(String generatedPassword) {
		EntityManager manager = entityManagerFactory.createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByGeneratedPassword");
			query.setParameter("ps", generatedPassword);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminMallDTO ref = (AdminMallDTO) singleResult;
				logger.info("data is present" + singleResult);
				return ref;
			} else {
				logger.info("data is not present");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminMallDTO updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordTimeByGeneratedPassword");
			query.setParameter("gp", generatedPassword);
			query.setParameter("gpt", generatedPasswordTime);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

		return null;
	}

}
