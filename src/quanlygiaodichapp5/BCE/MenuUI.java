package quanlygiaodichapp5.BCE;

import java.util.Scanner;

public class MenuUI {
    private Scanner in = new Scanner(System.in);

    public void getChoice() {
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Xuat giao dich > 1 ty");
            System.out.println("0. Thoat");
            System.out.print("-> ");
            choice = in.nextInt();

            if (choice == 1) {
                new XuatGDTren1TyUI().xuat();
            }
        } while (choice != 0);
    }
}
