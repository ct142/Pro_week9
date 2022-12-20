package question1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cat myCat = new Cat("Bao");
        Dog myDog = new Dog("Minh");
        Dog anotherDog = new Dog("Lu");
        BigDog myBigDog = new BigDog("Hy");
        BigDog anotherBigDog = new BigDog("Still Hy");

        System.out.println(myCat);
        System.out.println(myDog);
        System.out.println(anotherDog);
        System.out.println(myBigDog);
        System.out.println(anotherBigDog);

        myCat.greets();
        myDog.greets();
        myDog.greets(anotherDog);
        myBigDog.greets();
        myBigDog.greets(anotherDog);
        myBigDog.greets(anotherBigDog);

    }
}

//system out println{}