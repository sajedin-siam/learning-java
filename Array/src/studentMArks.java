public class studentMArks {
    public static void main(String[] args) {
        int[] marks = { 80, 75, 90, 85, 70 };
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

        }
        double average = (double) total / marks.length;

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);

    }
}
