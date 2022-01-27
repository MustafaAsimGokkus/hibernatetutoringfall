package hb3.onetoone_joins;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class C34_RunnerFetch {
	public static void main(String[] args) {
		
		C31_Students readStd = new C31_Students();
		C32_Diary readDairy = new C32_Diary();
		
		
		Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(C32_Diary.class)
				.addAnnotatedClass(C31_Students.class);
		
		SessionFactory sf =con.buildSessionFactory();
	    Session session = sf.openSession();
	 
	    Transaction tx = session.beginTransaction();
	   
	    //Example 1 :Fetch the student whose id is 1003 by using get()
	   
	    readStd = session.get(C31_Students.class, 1003);
	    System.out.println(readStd);
	   
	    //Example 2 :Fetch the diary details of a student whose is is 1004 by using get()
	   
	   // readDairy = session.get(C32_Diary.class, readStd.getDairy().getId());
	    System.out.println(readDairy);
	   
	    //Example 3: Fetch student name, diary name and student grade of common records
	    //from C31_Students and C32_Diary tables
	   
	    String sql1 = "SELECT * FROM C31_Students s "
	    		+ " FULL JOIN C32_Diary d ON s.std_id=d.std_idt";
	   
	    List<Object[]> resultList1 = session.createSQLQuery(sql1).getResultList();
	    for(Object[]w:resultList1) {
	    	System.out.println(Arrays.toString(w));
	    }
	    
	    
	    /*Example 4: Fetch student name, diary name and student grade of records from Students table

		String hql2 = "SELECT * FROM C31_Students s FULL JOIN FETCH C32_Diary d ON s.std_id = d.student";
		List<Object[]> resultList3 = session.createSQLQuery(hql2).getResultList();
		for(Object[] w:resultList3) {
			System.out.println(Arrays.toString(w));*/
		
		
		tx.commit();
	    session.close();
	    sf.close();
	}
}