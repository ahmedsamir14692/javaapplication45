
package javaapplication45;


public class NewClass implements Runnable {
    
    
    int y =5;
   public void  NClass(int x)
    {
      Thread t = new Thread(new NewClass()); 
      Thread tt= new Thread(this);
      t.start();
      
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
