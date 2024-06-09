/*
       Задача 2. Задана последовательность, состоящая только из символов ‘>’, ‘<’ и ‘-‘.
       Требуется найти количество стрел, которые спрятаны в этой последовательности.
       Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
        */

public class Task2 {
    public static void main(String[] args) {
        //Сделать процедурную генерацию символов
        String value = ">>-->-><<<><><>>--><--<<>>-->>><><--<<--<<>>>>----->>--><<---<<--<<<-<<>>-->>-->";
        char[] arrow1 = {'>', '>', '-', '-', '>'};
        char[] arrow2 = {'<', '-', '-', '<', '<'};

        int count = 0;

        char[] valueArray = value.toCharArray();
        for (int i = 0; i < valueArray.length - 4 ; i++) {
            if (arrow1[0] == valueArray[i]
                    && arrow1[1] == valueArray[i + 1]
                    && arrow1[2] == valueArray[i + 2]
                    && arrow1[3] == valueArray[i + 3]
                    && arrow1[4] == valueArray[i + 4]) {
                count ++;
                //System.out.println("Arrow1");
            }

            if (arrow2[0] == valueArray[i]
                    && arrow2[1] == valueArray[i + 1]
                    && arrow2[2] == valueArray[i + 2]
                    && arrow2[3] == valueArray[i + 3]
                    && arrow2[4] == valueArray[i + 4]) {
                count ++;
                //System.out.println("Arrow2");
            }
        }
        System.out.println("Количество стрел: " + count);
    }
}
