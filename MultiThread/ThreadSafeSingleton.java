package MultiThread;

public enum ThreadSafeSingleton {
   SINGLETON_INSTANCE;
   public void display(){
       System.out.println("Thread-safe singleton Display");
   }	
}
