package businessService;
import org.hibernate.Transaction; 
import org.hibernate.Session; 
import model.Account;
import util.NewHibernateUtil; 
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class LoginManager {
     public void addAccount(int aId,String aType){ 
        try { 
            Configuration config = new Configuration().configure();
            SessionFactory factory = config.buildSessionFactory(); 
            Session session = factory.openSession(); 
            Transaction trans=session.beginTransaction();
            
            Account ad = new Account();
            ad.setAccountId(aId);
            ad.setAccountType(aType);
            session.save(ad);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        } finally { 
        }
     }
        public Account searchAccount(int pi_id,String aType){
        String messages=null;
        Session session = null;
        Transaction tx = null;
        Account ac = null;
        try{
            if(aType.equalsIgnoreCase("Administrator") || aType.equalsIgnoreCase("User")){
                session = NewHibernateUtil.getSessionFactory().openSession();
                tx = session.getTransaction();
                tx.begin();
                Query query = session.createQuery("from Account where id = '" + pi_id + "'");
                ac = (Account)query.uniqueResult();
                tx.commit();
                System.out.println("Account id: " + ac.getAccountId() + "\n Account Type: " + ac.getAccountType());
            }
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            System.out.println("Account failed to be searched!!\n" + e);
        }
        finally{
            session.close();
        }
       return ac;
    }
    public static void main(String[] args) {
            LoginManager m = new LoginManager();
            m.addAccount(808, "User");
            m.searchAccount(808,"user"); 
         }
}
