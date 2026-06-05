/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 =
                new Direccion(
                        "Av. Costanera 120",
                        "Llanquihue",
                        "Los Lagos");

        Direccion direccion2 =
                new Direccion(
                        "Pasaje Los Ulmos 45",
                        "Puerto Varas",
                        "Los Lagos");

        Direccion direccion3 =
                new Direccion(
                        "Calle Volcan Osorno 300",
                        "Frutillar",
                        "Los Lagos");

        GuiaTuristico guia1 =
                new GuiaTuristico(
                        "Pedro Gonzalez",
                        "12.345.678-9",
                        "987654321",
                        direccion1,
                        "Turismo Lacustre",
                        8);

        GuiaTuristico guia2 =
                new GuiaTuristico(
                        "Maria Soto",
                        "15.678.123-4",
                        "912345678",
                        direccion2,
                        "Turismo Cultural",
                        5);

        GuiaTuristico guia3 =
                new GuiaTuristico(
                        "Camila Perez",
                        "18.456.789-2",
                        "998877665",
                        direccion3,
                        "Rutas Gastronomicas",
                        10);

        System.out.println("=================================");
        System.out.println("GUIA TURISTICO 1");
        System.out.println("=================================");
        System.out.println(guia1);

        System.out.println("\n=================================");
        System.out.println("GUIA TURISTICO 2");
        System.out.println("=================================");
        System.out.println(guia2);

        System.out.println("\n=================================");
        System.out.println("GUIA TURISTICO 3");
        System.out.println("=================================");
        System.out.println(guia3);
    }
}
