package controllers;

import models.Menu;
import models.Order;
import models.Reservation;

import java.util.Scanner;

public class RunController {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w naszej restauracji. Prosze wybrac czy woli Pan/Pani zlozyc zamowienie czy dokonac rezerwacji.");
        System.out.println("Wpisz rezerwacja lub zamowienie");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "rezerwacja":

                Reservation reservation = new Reservation();
                reservation.thx();
                System.out.println("Prosze podac wybrany dzien na rezerwacje.");
                reservation.setDate(String.valueOf(scanner.nextLine()));
                System.out.println("Prosze podac godzine na ktora ma byc zrobiona rezerwacja.");
                reservation.setTime(String.valueOf(scanner.nextLine()));
                System.out.println("Prosze podac ilosc gosci.");
                reservation.setPeopleCount(Integer.valueOf(scanner.nextInt()));
                System.out.println("Twoja rezerwacja zostala pomyslnie ustalona na "+reservation.getDate()+", na godzine:"+reservation.getTime()+", na "+reservation.getPeopleCount()+" osob");
                break;


            case "zamowienie":
                Order order = new Order();
                Menu menu = new Menu();
                menu.printmenu();

                dupa: while (scanner.hasNextInt()) {
                    int zmienna_menu = scanner.nextInt();

                    switch (zmienna_menu) {

                        case 7:
                            order.clearCart();
                            break;

                        case 8:
                            scanner.nextLine();
                            break dupa;

                        default:
                            order.addToCart(menu.getDish(zmienna_menu));
                            break;
                    }
                }

                System.out.println("Dziękujemy za wybor naszej restauracji.");
                System.out.println("Prosze podac wybrany dzien na dostarczenie zamowienia.");
                order.setDate(scanner.nextLine());
                System.out.println("Prosze podac godzine na ktora ma byc dostarczone zamowienie.");
                order.setTime(String.valueOf(scanner.nextLine()));
                System.out.println("Prosze podac adres.");
                order.setAddress(String.valueOf(scanner.nextLine()));
                System.out.println("Twoje zamowienie"+order.getCart()+", bedzie dostarczone na adres:"+order.getAddress()+", dnia:"+order.getDate()+", o godzinie:"+order.getTime());
                break;
            default:
                System.out.println("Błędnie wprowadzona wartosc. Sprobuj jeszcze raz.");
                this.run();
                break;
        }
        System.out.println("Dziekujemy! Do widzenia!");
    }
}