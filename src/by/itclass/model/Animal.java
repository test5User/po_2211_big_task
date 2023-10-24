package by.itclass.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.StringJoiner;

@AllArgsConstructor
public abstract class Animal implements Comparable<Animal> {
    private final long chipNumber;
    private final Genus genus;
    private final String name;
    @Getter
    private final LocalDate birthDate;
    private final String breed;
    private final String email;

    @Override
    public String toString() {
        return new StringJoiner(", ", genus.getValue() + "[", "]")
                .add("chipNumber=" + chipNumber)
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .add("breed='" + breed + "'")
                .add("email='" + email + "'")
                .toString();
    }

    @Override
    public int compareTo(Animal animal) {
        return birthDate.compareTo(animal.birthDate);
    }
}
