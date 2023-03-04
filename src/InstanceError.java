class instanceClass{
    String Name;
    int age;

    void high(){
        System.out.println(Name + "입니다.");
    }
    void low(){
        System.out.println(Name + "다.");
    }
    void ageUp(){
        ++age;
    }
    void ageDown(){
        --age;
    }
}

class OtherInstanceClass{

}

class instanceTest{
    public static void main(String[] args) {
        instanceClass i1 = new instanceClass();
        i1.Name = "Mr.park";
        System.out.println(i1.Name);
        i1.high();
        instanceClass i2 = new instanceClass();
        i2.Name = "Ms.Kim";
        System.out.println(i2.Name);
        i2.low();

        //만약에 i1을 i2에 넣어버리면?
        i2 = i1;        //i1이 저장하고 있는 값을 i2에 저장한다.
        /*이렇게 되면 원래 참조하고 있던 i2인스턴스는 더 이상 사용할 수 없다.
        그리고 i1의 값이 i2에 들어가는 것이아닌 i1과 i2가 같은 곳을 바라보게 된다.
        이는 분명한 말의 차이가 있다 의미의 차이가 있다.*/
        instanceClass i3 = new instanceClass();
        instanceClass i4 = new instanceClass(); // i3와 i4는 한개씩의 공간을 갖는다.


        instanceClass,OtherInstanceClass i5 = new instanceClass(),OtherInstanceClass(); //오류!!!

        //이는 오류가 된다.
        /* 한개의 참조변수가 여러개의 공간을 갖는 것은 불가능하다.
          다만 여러개의 참조변수가 하나의 인스턴스를 가르키는건 가능하다.
          이 차이를 잊지말자. */
    }
}
