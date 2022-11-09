import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PersonTest {
    @Test
    @DisplayName("Проверка работы метода getAge")
    public void getAgeTest() {
        Person person = new Person("tolya", "ivanov", 22);
        Assertions.assertEquals(0, person.getAge(), "Проверка метода getAge не пройдена!");
    }

    @Test
@DisplayName("Проверка работы метода getName на запретные имена")
    public void getNameForbiddenTest() {
        Person person = new Person("Tolya", "ivanov", 22);
        String[] listForbiddenName  = {"Sasha", " Kolya", "Natasha"};
        for (int i = 0; i < listForbiddenName.length; i++) {
            String forbiddenName = listForbiddenName[i];
            Assertions.assertNotEquals(forbiddenName, person.getName(), "Проверка метода getName не пройдена");
        }
    }
    @Test
    @DisplayName("Проверка работы метода getSumname")
    void getSurnameTest() {
        Person person = new Person("Tolya", "Ivanov", 22);
        Assertions.assertEquals("Ivanov",person.getSurname(), "Проверка метода getSurname не пройдена!");
    }
}