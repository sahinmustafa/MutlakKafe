
package hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MustafaS
 */
public class HbmIslemler {
    
    
    public void ekle(Object o) throws HibernateException{
        
        Session sesion = SessionFactory.getSessionFactory()
                .openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        try{
            sesion.save(o);
            tr.commit();
        }catch(HibernateException ex){
            tr.rollback();
            throw ex;
        }finally{
            sesion.close();
        }
    
    }
    
    @SuppressWarnings("rawtypes")
	public boolean sil(int id, Class clas)throws HibernateException{
        
        Session sesion = SessionFactory.getSessionFactory()
                .openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        try{
            Object obj = sesion.get(clas, id);
            
            if(obj != null){
                sesion.delete(obj);
                tr.commit();
                return true;
            }
            return false;
        }catch(HibernateException ex){
            tr.rollback();
            throw ex;
        }finally{
            sesion.close();
        }
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public List<? extends Object> list(String hql)throws HibernateException{
        
        Session sesion = SessionFactory.getSessionFactory()
                .openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        try{
            List list = sesion.createQuery(hql).list();
            tr.commit();
            return list;
            
        }catch(HibernateException ex){
            tr.rollback();
            throw ex;
        }finally{
            sesion.close();
        }
        
    }
    
    public boolean guncelle(int id, Object obj) throws HibernateException{
    
        Session sesion = SessionFactory.getSessionFactory()
                .openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        try{
            Object oldObj = sesion.get(obj.getClass(), id);
            
            if( oldObj != null){
                oldObj = obj;
                tr.commit();
                return true;
            }
            
            return false;
        }catch(HibernateException ex){
            tr.rollback();
            throw ex;
        }finally{
            sesion.close();
        }
    }
    
    @SuppressWarnings("rawtypes")
	public Object bilgiGetir(int id, Class clas){
        
        Session sesion = SessionFactory.getSessionFactory()
                .openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        try {            
            Object obj = sesion.get(clas, id);
            tr.commit();
            return obj;
        } catch (HibernateException ex) {
            tr.rollback();
            throw ex;
        }finally{
            sesion.close();
        }
    }
        
}

