
//Написать программу на любом языке в любой парадигме для
//бинарного поиска. На вход подаётся целочисленный массив и
//число. На выходе - индекс элемента или -1, в случае если искомого
// элемента нет в массиве.
public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArr = {2, 6, 9, 13, 14, 25, 70, 76};
        int element = 21;

        int result = binarySearch(inputArr, element);

        if (result != -1){
            System.out.println("Found element " + element + " with index " + result);
        } else {
            System.out.println(result + "  means that element not found in the array");
        }

    }

    // процедурная парадигма
    // Основные концепции процедурной парадигмы :
    // 1. Процедуры (функции): Основные строительные блоки, которые выполняют
    // определенные действия или вычисления.
    //2. Передача аргументов: Процедуры могут принимать входные данные
    // в виде аргументов для выполнения операций.
    // 3. Структуры данных: Для хранения и организации информации
    // могут использоваться массивы, структуры, указатели и т.д.
    // 4. Последовательное выполнение: Код выполняется последовательно,
    // вызывая процедуры в определенном порядке для достижения цели.
    public static int binarySearch(int[] inputArr, int element){
        int left = 0;
        int right = inputArr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (inputArr[middle] == element){
                return middle;
            }
            if (inputArr[middle] < element){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
