package ui;

import java.util.Scanner;

public class UIMenu {
        public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiemnre", "Octubre", "Noviembre", "Diciembre"};
        public static void showMenu(){
            System.out.println("Bienvenido a mi App");
            System.out.println("Selecciona la opción deseada");

            int response =0;
            do{
                System.out.println("1. Doctor");
                System.out.println("2. Paciente");
                System.out.println("0. Salir");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("Doctor");
                        break;
                    case 2:
                        response=0;
                        showPatientMenu();
                        break;
                    case 0:
                        System.out.println("Gracias por su visita");
                        break;
                    default:
                        System.out.println("Porfavor ingrese una elección correcta");
                }
            }while(response!=0);
        }

        static void showPatientMenu(){
            int response =0;
            do {
                System.out.println("\n\n");
                System.out.println("Paciente");
                System.out.println("1. Reserva una cita");
                System.out.println("2. Mis citas");
                System.out.println("0. Regreso");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("::Reserve una cita");
                        for(int i=1; i<4; i++){
                            System.out.println(i+". "+MESES[i-1]);
                        }
                        break;
                    case 2:
                        System.out.println("::Mis citas");
                        break;
                    case 0:
                        response=0;
                        showMenu();
                        break;
                    default:
                        System.out.println("Porfavor ingrese una elección correcta");
                }
            }while(response!=0);
        }
    }
