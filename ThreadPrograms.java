public class ThreadPrograms{

  public static void main(String[] args){
    //ThreadDemo t1 = new ThreadDemo();
    //t1.start();

    Thread t2 = new Thread(new ThreadRunnableDemo());
    t2.start();
  }


}

class ThreadDemo extends Thread{

  @Override
  public void run(){
    System.out.println("This is a test");
  }

}

class ThreadRunnableDemo implements Runnable{

  @Override
  public void run(){
    System.out.println("From Runnable Thread");
  }

}
