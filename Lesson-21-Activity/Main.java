class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
  int addTwoNumbers(-8);
  int addTwoNumbers(0);
  int addTwoNumbers(8);
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}
// Challenge 1//
void solve(){
  int x=1;
  qhile(!(Math.pow(2,x)>500)){
    x++;
  }
  print (x);
  }

//Challenge 2//
void addTwoNumbers(){
  int n1=randInt(0,100);
  int n2=randInt(0,100);
  print("What is sum of"n1+"and"+n2);
  int answer=Input.readInt();
  while(!(answer==n1+n2)){
    print("Incorrect, try again......");
    answer=Input.readInt();
  }
  print("Correct");
}
// Challenge 3//
int GCF(int n1, int n2){
  int divisor=Math.min(n1,n2);
  while(!(n1%divisor==0&&n2%divisor==0)){
    divisor--;
  }
  return divisor;
  }
}