package com.arifah.kitalulussimple.model;

public class Menu {
    private String nama_menu;
    private String harga_menu;
    private String foto_menu;

    public Menu(String nama_menu, String harga_menu, String foto_menu) {
        this.nama_menu = nama_menu;
        this.harga_menu = harga_menu;
        this.foto_menu = foto_menu;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public String getHarga_menu() {
        return harga_menu;
    }

    public void setHarga_menu(String harga_menu) {
        this.harga_menu = harga_menu;
    }

    public String getFoto_menu() {
        return foto_menu;
    }

    public void setFoto_menu(String foto_menu) {
        this.foto_menu = foto_menu;
    }



}
