class Student {
    String name;
    int age;
    int rollNo;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }

    public void sayHello() {
        Student s1 = new Student();

        s1.name = "Abhinav";
        s1.age = 25;
        s1.rollNo = 101;

        s1.displayDetails();
    }
}