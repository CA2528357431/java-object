// object----基类

// tostring
// 输出、转换成string时候用

public class new01 {

    public static void main(String[] args){
        per no1 = new per(18,"CAOAN");

        System.out.println(no1);

        per no2 = new per(18,"CAOAN");
        // 新对象，只是数据恰好一样
        per no3 = no1;
        // 指针指向


        System.out.println(no1.equals(no2));
        System.out.println(no1.equals(no3));

    }


}

class per {
    int age;
    String name;

    per(int age,String name){
        this.name=name;
        this.age=age;
    }

    void say(){
        System.out.println(String.format("i'm %s, /d years old",name,age));
    }

    public String toString(){
        return String.format("name: %s\nage: %d",name,age);

    }


}