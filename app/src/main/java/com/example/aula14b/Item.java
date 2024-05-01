package com.example.aula14b;

public class Item {
    //Vamos colocar as informações e as suas formas sendo elas string ou int.
    String name;
    String email;
    int image;
    //Após isso, clique ALT+INSERT para gerar as variáveis e a classe para programarmos.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

}
