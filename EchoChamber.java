class Echo<T>{

  public T echo(T value){
    return value;
  }

  public Echo<T> echo(Echo<T> value){
  return value;
  }

}

public class EchoChamber{

  public static void main(String[] args){
    Echo<Number> numberEcho = new Echo<Number>();
    numberEcho.echo(10d);
    numberEcho.echo(new Echo<Number>());
  }

}
