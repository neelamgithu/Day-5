public class Power_Of_2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowersOf2 N");
        } else {
            int N = Integer.parseInt(args[0]);

            if (!(0 <= N && N < 31)) {
                System.out.println("Input out of range. Please enter a value between 0 and 30.");
                return;
            }

            for (int i = 0; i <= N; i++) {
                int result = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + r\esult);
            }
        }
    }
}
