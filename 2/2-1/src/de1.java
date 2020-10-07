public class de1 {
        public static void main(String[] args)
        {
            System.out.println(repeat());
        }
        private static String repeat()
        {
            int n = "mice".length();
            String again = "";
            for (int i=0;i<n;i++)
                for (int j = 0; j< 5; j++)
                    again = again + "mice".charAt(i);
            return again;
        }
    }
