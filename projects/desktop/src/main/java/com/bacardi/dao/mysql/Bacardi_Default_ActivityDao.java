package com.bacardi.dao.mysql;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.Query;
import javax.persistence.Transient;
import javax.sound.midi.SysexMessage;
import javax.sql.DataSource;
import javax.transaction.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnitUtil;
import javax.transaction.Transactional;
import javax.persistence.Query;


import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.apache.log4j.*;



 import com.bacardi.domain.core.Bacardi;import com.bacardi.domain.core.BaUser;

/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
 * build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
@Transactional
@Repository("Bacardi_Default_ActivityDao")
public class Bacardi_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(Bacardi_Default_ActivityDao.class.getName());

	@Value("${create_Bacardi.sql}")
	private String create_Bacardi;
	@Value("${search_for_update_Bacardi.sql}")
	private String search_for_update_Bacardi;
	@Value("${update_Bacardi.sql}")
	private String update_Bacardi;
	@Value("${delete_Bacardi.sql}")
	private String delete_Bacardi;
	@Value("${get_all_Bacardi.sql}")
	private String get_all_Bacardi;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  Bacardi noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Bacardi object will return
	*@throws Exception
	*/

	public Bacardi bacardi_search_for_update(long id, BaUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("bacardi_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_Bacardi,Bacardi.class)

			.setParameter("id", id);;

			ArrayList<Bacardi> Bacardi_list =	(ArrayList<Bacardi>)result.getResultList();

			if(Bacardi_list  == null){

			log.error("bacardi_search_for_update Dao throws exception :" + "no Bacardi found" );
			}
			log.info("Object returned from bacardi_search_for_update  Dao method !");
			return (Bacardi) Bacardi_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("bacardi_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  Bacardi noun from  database
	*
	*
	*@return List of Bacardi object will return
	*@throws Exception
	*/

	public ArrayList<Bacardi> get_all_bacardi() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_bacardi Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_Bacardi,Bacardi.class)

;

			ArrayList<Bacardi> Bacardi_list =	(ArrayList<Bacardi>)result.getResultList();

			if(Bacardi_list .size() < 1){

			log.error("get_all_bacardi Dao throws exception :" + "no Bacardi found" );
				return new ArrayList<Bacardi>();
			}
			log.info("Object returned from get_all_bacardi  Dao method !");
			return (ArrayList<Bacardi>) Bacardi_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_bacardi Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  Bacardi noun into database
	*@param Bacardi
	*@param user
	*@return Bacardi object will return
	*@throws Exception
	*/

	@Transactional
	public Bacardi create_bacardi(Bacardi Bacardi, BaUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_bacardi Dao started operation!");//dhina updateverb

		try{
			Query query = entityManager
					.createNativeQuery(create_Bacardi)
			.setParameter("price", Bacardi.getprice())
			.setParameter("quantity", Bacardi.getquantity())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					Bacardi.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_bacardi  Dao method !");

			return Bacardi;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_bacardi) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  Bacardi noun into database
	*@param Bacardi
	*@param user
	*@return the_Bacardi object will return
	*@throws Exception
	*/

	@Transactional
	public Bacardi update_bacardi(Bacardi Bacardi, BaUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_bacardi Dao started operation!");//dhina updateverb

		try{
			Query query = entityManager
					.createNativeQuery(update_Bacardi)
			.setParameter("id", Bacardi.getId())
			.setParameter("price", Bacardi.getprice())
			.setParameter("quantity", Bacardi.getquantity())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_bacardi  Dao method !");

			return Bacardi;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_bacardi) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  Bacardi noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Bacardi id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_bacardi(long id, BaUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_bacardi Dao started operation!");//dhina updateverb

		try{
			Query query = entityManager
					.createNativeQuery(delete_Bacardi)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_bacardi  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_bacardi) throws Exception : "+e.toString());

		}
		return null;



	}




}