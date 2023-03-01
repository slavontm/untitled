public class pflevels {
    public static void main(String[] args) {
        String PF="PF:";

//        LEVELS PF:

        System.out.println(PF+" first level: "+"do");
        System.out.println(PF+" second level: "+"regular");
        System.out.println(PF+" third leve: "+"power");  // if regular is not regular goto second level
        System.out.println(PF+" 4th leve: "+"accuracy"); //ponimanie kak
        System.out.println(PF+" 5th level "+"fast"); //
        System.out.println("\n\nТаблица\n\n");

        String[] seasons  = {"L", "R", "D"};
        int k=1;
               for (int i=1;i<=10;i++) {
                    for (int j=1;j<=10;j++) {
                        int c=(int)((Math.random() * (2  + 1) + 0));

                        System.out.printf("%6d %s", (k++),seasons[c]);
                    }
                    System.out.println();
                }


    }
}


