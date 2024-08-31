package com.losglobitos;

public class Main {
    public static void main(String[] args) {
        Empresa losGlobitos = new Empresa("Los Globitos");
        Menu menu = new Menu(losGlobitos);
        menu.mostrar();
    }
}
