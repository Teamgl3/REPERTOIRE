package com.teamgl.gl3;

class Fruit {
    private  int categorie;
    private String  nom;
    private String Origine;
    public Fruit(int categorie ,String nom,String Origine ){
              categorie=this.categorie;
               nom=this.nom;
               Origine=this.Origine;


    }


    public String getNom(){

        return this.nom;
    }

public String getOrigine(){
        return  this.Origine;
}

public  void setNom(String nom){

        this.nom=nom;
}







}
