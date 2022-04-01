public class Qa1Task {
    public static void main(String[] args) {

        String[] months = { "jan", "feb", "mar", "apr", "may", "jun"};

        int size = months.length;

        for(int i = 0; i < size; i++){
            String month = months[i].toUpperCase();
            System.out.println("month: " + month + "\t");
        }
    }
}
