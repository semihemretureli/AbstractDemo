public class AbstractDemo {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.datebaseManager=new MySqlDatabaseManager();
        customerManager.getCutomers();
    }
}
