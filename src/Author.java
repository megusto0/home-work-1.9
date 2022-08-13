import java.util.Objects;

public class Author {
    String name;
    String middleName;

    public Author(String name, String middleName) {
        this.name = name;
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(middleName, author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName);
    }
}
