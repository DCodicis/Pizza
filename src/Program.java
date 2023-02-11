import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        String[] pizzas = menu.pizzas();
        String[] drinks = menu.drinks();
        String[] order = {"","","","","",""};
        int counter = 0;

        System.out.println("Hi Welcom To Pizza "+'"'+"Finex"+'"'+"\n");
        System.out.println("0. Exit\n1. Continue\n2. Instruction\n");
        System.out.print("chose the one off the options: ");

        int ans = scanner.nextInt();
        System.out.println("\n");

        while (ans != 0){
            if(ans == 1){
                System.out.println("0. Exit\n1. Menu\n2. Build A Pizza\n");
                System.out.print("Now You Will Decide What You Want To Eat: ");
                int ans1 = scanner.nextInt();
                System.out.println("\n");

                while(ans1 != 0){
                    if(ans1 == 1){
                        System.out.println("Select From The List What You Want:\n");
                        System.out.print("[");
                        for(int i=0;i<menu.indexPizzas();i++){
                            System.out.print(i+1+". "+pizzas[i]);
                            if(i+1<menu.indexPizzas()){
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]\n");
                        System.out.print("Chose One Of The Numbers: ");
                        int piz = scanner.nextInt();
                        System.out.println("\n");
                        if(piz != 0){
                            order[counter] = pizzas[piz-1];
                            counter++; 
                        }
                        if(order[counter]==""){
                            System.out.println("0. Exit\n1. Yes\n2. No\n");
                            System.out.print("You Want To Add Some More Pizza?: ");
                            piz = scanner.nextInt();
                            System.out.println("\n");

                            if(piz == 1){
                                continue;
                            }
                            if(piz == 2){
                                ans1=0;
                            }
                            if(piz == 0){
                                break;
                            }
                        }
                    }

                    if(ans1 == 2){

                    }
                }
            }
            if(ans == 2){

            }
        }
    }
}
