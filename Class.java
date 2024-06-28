/**
 * @author zzylm
 * @description TODO
 * @date 2024-06-26 11:33
 */
public class Class {
    public static void main(String[] args) {

        Person ming = new Person();
        ming.setName("Xiao Ming");
        ming.setAge(12);
        System.out.println(ming.getName() + "," + ming.getAge());

        Person p = new Person();
        String bob = "Bob";
        p.setName(bob);
        System.out.println(p.getName());
        bob = "Alice";
        System.out.println(p.getName());
    }
}

class Person{
//    get、set 方法
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.isBlank()){
                throw new IllegalArgumentException("invalid name");
            }
            this.name = name.strip();
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if(age < 0 || age > 100){
                throw new IllegalArgumentException("invalid age value");
            }
            this.age = age;
     }

//     构造方法
    public Person(String name,int age){
            this.name = name;
            this.age = age;
    }
//    默认构造方法
    public Person(){
    }

}
