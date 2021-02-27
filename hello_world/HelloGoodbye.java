public class HelloGoodbye {
  public static void main(String[] args) {
    String[] people = new String[2];

    people = args;

    System.out.println("Hello " + String.join(" and ", people));
    System.out.println("Goodbye " + String.join(" and ", invertedPeople(people)));
  }


  private static String[] invertedPeople(String[] people) {
    for (int i = 0; i < people.length / 2; i++) {
      String person = people[i];
      people[i] = people[people.length - 1 - i];
      people[people.length - 1 - i] = person;
    }
    return people;
  }
}
