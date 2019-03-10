
public class EvenOddThreadExample {

	public static void main(String[] args) {
	
		
		SharedPrint sp = new SharedPrint();
		
		Thread t1 = new Thread(new EvenNumProducer(sp, 10));
		Thread t2 = new Thread(new OddNumProducer(sp, 10));
		
		t1.start();
		t2.start();
		
		
	}
	
}


class SharedPrint{
	
	boolean evenFlag = false;
	
	public void printEvenNum(int num){
		
		synchronized(this){
			while(!evenFlag){
				try{
					wait();
				}catch(InterruptedException  e){
					e.printStackTrace();
				}
			}
			System.out.println("Thread 1:"+num);
			evenFlag= false;
			notify();
		}		
		
	}
	
	public void printOddNum(int num){
		
		synchronized(this){
			while(evenFlag){
				try{
					wait();
				}catch(InterruptedException  e){
					e.printStackTrace();
				}
			}
			System.out.println("Thread 2:"+num);
			evenFlag= true;
			notify();
		}		
	}	
}

class EvenNumProducer implements Runnable{
    SharedPrint sp;
    int index;
    EvenNumProducer(SharedPrint sp, int index){
        this.sp = sp;
        this.index = index;
    }
    @Override
    public void run() {
        for(int i = 2; i <= index; i = i+2){
            sp.printEvenNum(i);
        }   
    }   
}

//Thread Class generating Odd numbers
class OddNumProducer implements Runnable{
  SharedPrint sp;
  int index;
  OddNumProducer(SharedPrint sp, int index){
      this.sp = sp;
      this.index = index;
  }
  @Override
  public void run() {
      for(int i = 1; i <= index; i = i+2){
          sp.printOddNum(i);
      }
  }
}


/*
 * so it starts with thread t1 means calling even number method first 
 * since evenFlag initial value is false so while condition is set to true and it will 
 * wait condition till that time thread t2 prints value because its while condition is false
 * and so on 
 */

