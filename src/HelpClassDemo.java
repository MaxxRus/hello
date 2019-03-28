
    class Help {
        void helpOn(int what){
            switch (what){
                case '1':
                    System.out.println("Оператор if:\n");
                    System.out.println("if(условие) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("Оператор switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("\tcase константа:");
                    System.out.println("\tпоследовательность операторов;");
                    System.out.println("\tbreak;");
                    System.out.println("\t// ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Оператор for:\n");
                    System.out.println("for(инициализация; условие; итерация)");
                    System.out.println("\tоператор;");
                    break;
                case '4':
                    System.out.println("Оператор while:\n");
                    System.out.println("while(условие) оператор;");
                    break;
                case '5':
                    System.out.println("Оператор do-while:\n");
                    System.out.println("do {");
                    System.out.println("\tоператор;");
                    System.out.println("\twhile (условие);");
                    break;
                case '6':
                    System.out.println("Оператор break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Оператор continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;
            }
            System.out.println();
        }

        void showMenu(){
            System.out.println("Справка:");
            System.out.println("\t1. if");
            System.out.println("\t2. switch");
            System.out.println("\t3. for");
            System.out.println("\t4. while");
            System.out.println("\t5. do-while");
            System.out.println("\t6. break");
            System.out.println("\t7. continue\n");
            System.out.println("\tq - выход");
        }

        boolean isValid(int ch) {
            if ((ch < '1') |( ch >'7') & (ch != 'q')) return false;
            else return true;
        }
    }

    class HelpClassDemo {
        public static void main(String[] args)
            throws java.io.IOException {
                char choice;
                char ignore;

                Help hlponj = new Help();

                for (;;){
                    do {
                        hlponj.showMenu();

                        choice = (char) System.in.read();

                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');
                    } while (!hlponj.isValid(choice));

                    if (choice == 'q') break;

                    System.out.println("\n");

                    hlponj.helpOn(choice);
                }
        }
    }


