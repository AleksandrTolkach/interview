package by.toukach.sortingalgorithm.sorting;

import java.util.Arrays;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HairbrushSort implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {

    int[] ints = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    double factor = 1.247;
    int n = ints.length;
    int step = n - 1;
    int temp = 0;

    while (step >= 1) {
      for (int i = 0; i + step < n; i++) {
        if (ints[i] > ints[i + step]) {
          temp = ints[i];
          ints[i] = ints[i + step];
          ints[i + step] = temp;
        }
      }
      step /= factor;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if ((ints[j + 1]) < ints[j]) {
          temp = ints[j];
          ints[j] = ints[j + 1];
          ints[j + 1] = temp;
        }
      }
    }

    System.out.println("Hairbrush sort:");
    Arrays.stream(ints)
        .forEach(System.out::print);
    System.out.println();
  }
}
