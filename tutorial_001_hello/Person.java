class Person {

  private final String name;
  private final int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String greeting() {
    return "Hello, I'm " + name + ".";
  }

  String howOldAreYou() {
    return "I'm " + Integer.toString(age) + " years old.";
  }

}