package lesson_27_Equals_HashCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String voice;
    private String fire;
    private String breedType;
}
