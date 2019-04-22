package love.programming;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person1.setFirstName("FirstName1");
        person1.setLastName("LastName1");
        person1.setSex('M');
        person1.setAge(1);

        System.out.println("My first person object name is "+person1.getFirstName()+
                " "+person1.getLastName()+" and his age is "+person1.getAge()+
                " and his sex is "+person1.getSex());

        Book book1 = new Book();
    }
}
